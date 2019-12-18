package cn.com.nb.thread;

import cn.com.nb.domain.User;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

/**
 * @description
 * @author: liying.fu
 * @Date: 2019/4/8 下午10:06
 */
public class NumberAdd {

    private static int number = 0;

    public static void main(String[] args) throws Exception {
        Optional<List<User>> optionalUserList = getUserList();
        List<User> userList = optionalUserList.get();
        System.out.println(userList);
    }

    static class AddNumber extends Thread {
        @Override
        public void run() {
            add();
        }

        public void add() {
            for (int i = 0; i < 100000; i++) {
                number++;
            }
        }
    }

    private static Optional<List<User>> getUserList() {
        List<User> userList = new ArrayList<>();
        return Optional.of(userList);
    }
}
