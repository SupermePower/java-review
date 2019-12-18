package cn.com.nb.thread;

/**
 * 线程池
 * @param <Job>
 */
public interface ThreadPool<Job extends Runnable> {

    /**
     * 执行job,这个job必须实现Runnable接口
     * @param job
     */
    void execute(Job job);

    /**
     * 关闭线程池
     */
    void shutDown();

    /**
     * 增加工作线程
     * @param num
     */
    void addWorkers(int num);

    /**
     * 移除工作线程
     * @param num
     */
    void removeWorkers(int num);

    /**
     * 获取正在等待工作的线程数量
     */
    int getJobSize();
}
