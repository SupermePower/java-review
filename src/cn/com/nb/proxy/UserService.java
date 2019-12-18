package cn.com.nb.proxy;

import cn.com.nb.domain.User;

/**
 * @description 用户业务接口
 * @author: liying.fu
 * @Date: 2019/4/14 下午3:00
 */
public interface UserService {

    /**
     * 保存用户
     *
     * @param user 用户信息
     */
    void save(User user);

    /**
     * 修改用户
     *
     * @param user 用户信息
     */
    void update(User user);
}
