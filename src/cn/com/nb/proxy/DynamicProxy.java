package cn.com.nb.proxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

/**
 * @description
 * @author: liying.fu
 * @Date: 2019/4/14 下午5:14
 */
public class DynamicProxy implements InvocationHandler {

    // 被代理对象
    private Object object;

    public DynamicProxy(Object object) {
        this.object = object;
    }


    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        System.out.println("execute dynamic proxy.....");
        String name = method.getName();
        System.out.println("您要执行的方法是 => " + name);
        method.invoke(object, args);
        System.out.println("方法执行结束");
        return null;
    }
}
