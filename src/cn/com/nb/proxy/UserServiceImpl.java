package cn.com.nb.proxy;

import cn.com.nb.domain.User;

/**
 * @description 用户业务实现
 * @author: liying.fu
 * @Date: 2019/4/14 下午3:02
 */
public class UserServiceImpl implements UserService {

    /**
     * 保存用户信息
     *
     * @param user 用户信息
     */
    @Override
    public void save(User user) {
        System.out.println("<="+user.toString()+"=>");
    }

    /**
     * 更新用户信息
     *
     * @param user 用户信息
     */
    @Override
    public void update(User user) {

    }
}
