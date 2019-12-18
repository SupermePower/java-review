package cn.com.nb.proxy;

import cn.com.nb.domain.User;

/**
 * @description
 * @author: liying.fu
 * @Date: 2019/4/14 下午3:00
 */
public class UserProxy implements UserService {

    private UserService userService;


    public UserProxy(UserService userService) {
        this.userService = userService;
    }

    @Override
    public void save(User user) {
        System.out.println("==>开始保存用户信息");
        userService.save(user);
        System.out.println("<==结束保存用户信息");
    }

    @Override
    public void update(User user) {

    }
}
