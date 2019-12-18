package cn.com.nb.proxy;

import cn.com.nb.domain.User;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Proxy;

/**
 * @description
 * @author: liying.fu
 * @Date: 2019/4/14 下午3:06
 */
public class UserTest {
    public static void main(String[] args) {
        UserTest userTest = new UserTest();
        userTest.update();
    }

    private void save() {
        User user = new User();
        user.setCode("A01");
        user.setName("Tom");
        user.setSex("男");
        UserService userService = new UserServiceImpl();
        InvocationHandler proxy = new DynamicProxy(userService);
        UserService userServiceProxy = (UserService) Proxy.newProxyInstance(ClassLoader.getSystemClassLoader(), new Class[]{UserService.class}, proxy);
        userServiceProxy.save(user);
        this.update();
    }

    private void update() {
        User user = new User();
        user.setCode("A01");
        user.setName("Tom");
        user.setSex("男");
        UserService userService = new UserServiceImpl();
        InvocationHandler proxy = new DynamicProxy(userService);
        UserService userServiceProxy = (UserService) Proxy.newProxyInstance(ClassLoader.getSystemClassLoader(), new Class[]{UserService.class}, proxy);
        userServiceProxy.update(user);
    }

    private static void staticProxy(User user) {
        UserService userService = new UserServiceImpl();
        UserProxy proxy = new UserProxy(userService);
        proxy.save(user);
    }
}
