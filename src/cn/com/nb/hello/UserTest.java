package cn.com.nb.hello;

import cn.com.nb.domain.User;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

/**
 * @description 用户测试m
 * @author: liying.fu
 * @Date: 2019/4/27 下午10:00
 */
public class UserTest {

    public static void main(String[] args) {
        List<User> userList = getUserList();
        userList.stream().sorted(Comparator.comparing(User::getCode).reversed()
        );
        Map<String, List<User>> collect = userList.stream().collect(Collectors.groupingBy(User::getSex));
        System.out.println(collect);
    }

    private static List<User> getUserList() {
        return Arrays.asList(new User("Tom", "男", "A01"), new User("Jerry", "男", "A02"),
                new User("Marry", "女", "A03"), new User("Jack", "男", "A04"));
    }
}
