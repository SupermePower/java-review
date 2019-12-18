package cn.com.nb.collection;

import cn.com.nb.domain.User;

import java.util.*;

/**
 * @description 测试集合中元素移除
 * @author: liying.fu
 * @Date: 2019/3/10 上午11:30
 */
public class RemoveTest {
    public static void main(String[] args) {
        List<User> userList = getUserList();
        System.out.println(userList);
//        fun2();
        fun1();
    }

    /**
     * 获取用户集合
     *
     * @return 用户集合
     */
    private static List<User> getUserList() {
        User u1 = new User("Tom", "1", "A001");
        User u2 = new User("Jerry", "1", "A002");
        User u3 = new User("Marry", "0", "A003");
        User u4 = new User("Mack", "1", "A004");
        User u5 = new User("Roles", "0", "A005");
        List<User> userList = new LinkedList<>();
        userList.add(u1);
        userList.add(u2);
        userList.add(u3);
        userList.add(u4);
        userList.add(u5);
        Iterator<User> iterator = userList.iterator();
        while (iterator.hasNext()) {
            User next = iterator.next();
            if (next.getName().equals("Tom")) iterator.remove();
        }
        return userList;
    }

    public static void fun2(){
        List<String> s=new ArrayList<String>();
        s.add("abc");
        s.add("abc1");
        s.add("abc2");
        s.add("abc3");
        Iterator<String> it=s.iterator();
        while(it.hasNext()){
            String s1=it.next();
            if(s1.equals("abc")){
                s.add("我爱java");
                System.out.println(s);

            }
        }
    }

    public static void fun1(){
        List<String> s=new ArrayList<String>();
        s.add("abc");
        s.add("abc1");
        s.add("abc2");
        s.add("abc3");
        Iterator<String> it=s.iterator();
        while(it.hasNext()){
            String s1=it.next();
            if(s1.equals("abc")){
                it.remove();
                System.out.println(s);

            }
        }
    }

}
