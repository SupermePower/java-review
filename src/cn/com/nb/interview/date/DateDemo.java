package cn.com.nb.interview.date;

import java.util.Calendar;
import java.util.Date;

/**
 * @description: 日期
 * @author: GOD
 * @date: 2019/12/15 下午11:12
 */
public class DateDemo {

    public static void main(String[] args) {
        Calendar calendar = Calendar.getInstance();
        calendar.setTime(new Date());
        System.out.println(calendar.getTime());
    }
}
