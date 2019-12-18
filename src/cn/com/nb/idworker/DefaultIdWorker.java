package cn.com.nb.idworker;

import com.google.common.base.Preconditions;
import lombok.Setter;
import lombok.extern.slf4j.Slf4j;

import java.util.Calendar;
import java.util.HashSet;
import java.util.Set;

/**
 * 默认的主键生成器.
 * <p>
 * <p>
 * 长度为64bit,从高位到低位依次为
 * </p>
 * <p>
 * <pre>
 * 1bit   符号位
 * 41bits 时间偏移量从1970年1月1日零点到现在的毫秒数（计算机元年）
 * 10bits 工作进程Id
 * 12bits 同一个毫秒内的自增量
 * </pre>
 * <p>
 * <p>
 * 可以调用@{@code DefaultIdWorker.setWorkerId}进行设置
 * </p>
 *
 * @author fly
 */
@Slf4j
public class DefaultIdWorker implements IdWorker {

    private static final int YEAR = 1970;

    private static final int DATE = 1;

    private static final long EPOCH;

    private static final long SEQUENCE_BITS = 6L;

    private static final long WORKER_ID_BITS = 5L;

    private static final long SEQUENCE_MASK = (1 << SEQUENCE_BITS) - 1;

    private static final long WORKER_ID_LEFT_SHIFT_BITS = SEQUENCE_BITS;

    private static final long TIMESTAMP_LEFT_SHIFT_BITS = WORKER_ID_LEFT_SHIFT_BITS + WORKER_ID_BITS;

    private static final long WORKER_ID_MAX_VALUE = 1L << WORKER_ID_BITS;

    @Setter
    private static TimeService timeService = new TimeService();

    private static long workerId;

    static {
        Calendar calendar = Calendar.getInstance();
        calendar.set(YEAR, Calendar.JANUARY, DATE);
        calendar.set(Calendar.HOUR_OF_DAY, 0);
        calendar.set(Calendar.MINUTE, 0);
        calendar.set(Calendar.SECOND, 0);
        calendar.set(Calendar.MILLISECOND, 0);
        EPOCH = calendar.getTimeInMillis();
    }

    private long sequence;

    private long lastTime;

    /**
     * 设置工作进程Id.
     *
     * @param workerId 工作进程Id
     */
    public static void setWorkerId(final long workerId) {
        Preconditions.checkArgument(workerId >= 0L && workerId < WORKER_ID_MAX_VALUE);
        DefaultIdWorker.workerId = workerId;
    }

    /**
     * 生成Id.
     *
     * @return 返回@{@link Long}类型的Id
     */
    @Override
    public long nextId() {
        long currentMillis = timeService.getCurrentMillis();
        Preconditions.checkState(lastTime <= currentMillis, "Clock is moving backwards, last time is %d milliseconds, current time is %d milliseconds", lastTime, currentMillis);
        if (lastTime == currentMillis) {
            if (0L == (sequence = ++sequence & SEQUENCE_MASK)) {
                currentMillis = waitUntilNextTime(currentMillis);
            }
        } else {
            sequence = 0;
        }
        lastTime = currentMillis;
//        if (log.isDebugEnabled()) {
//            log.debug("{}-{}-{}", new SimpleDateFormat("yyyy-MM-dd HH:mm:ss.SSS").format(new Date(lastTime)), workerId, sequence);
//        }
        return ((currentMillis - EPOCH) << TIMESTAMP_LEFT_SHIFT_BITS) | (workerId << WORKER_ID_LEFT_SHIFT_BITS) | sequence;
    }

    private long waitUntilNextTime(final long lastTime) {
        long time = timeService.getCurrentMillis();
        while (time <= lastTime) {
            time = timeService.getCurrentMillis();
        }
        return time;
    }

    public static void main(String[] args) {
        DefaultIdWorker defaultIdWorker = new DefaultIdWorker();
        Set<Long> idSet = new HashSet<>();
        boolean isGo = true;
        while (isGo) {
            long id = defaultIdWorker.nextId();
            System.out.println(id);
            isGo = idSet.add(id);
        }
    }
}
