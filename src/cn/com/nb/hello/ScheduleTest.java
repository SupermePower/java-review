package cn.com.nb.hello;

import java.util.LinkedList;
import java.util.List;

/**
 * @description
 * @author: liying.fu
 * @Date: 2018/12/30 下午3:12
 */
public class ScheduleTest {

    public static List<Schedule> getScheduleList() {
        Schedule schedule1 = new Schedule("设备检查", (byte) 1, "7:00");
        Schedule schedule2 = new Schedule("设备检查", (byte) 1, "11:00");
        Schedule schedule3 = new Schedule("设备检查", (byte) 1, "14:00");
        Schedule schedule4 = new Schedule("消毒检查", (byte) 2, "7:00");
        Schedule schedule5 = new Schedule("消毒检查", (byte) 2, "11:00");
        Schedule schedule6 = new Schedule("开店检查", (byte) 3, "7:00");
        Schedule schedule7 = new Schedule("闭店检查", (byte) 4, "19:00");
        List<Schedule> schedules = new LinkedList<>();
        schedules.add(schedule1);
        schedules.add(schedule2);
        schedules.add(schedule3);
        schedules.add(schedule4);
        schedules.add(schedule5);
        schedules.add(schedule6);
        schedules.add(schedule7);
        return schedules;
    }

    public static void main(String[] args) {
        List<Schedule> scheduleList = getScheduleList();
    }
}
