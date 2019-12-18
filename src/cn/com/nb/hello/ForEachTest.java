package cn.com.nb.hello;

import com.sun.istack.internal.Nullable;

/**
 * @description
 * @author: liying.fu
 * @Date: 2019/1/20 上午9:07
 */
public class ForEachTest {

    public static void main(String[] args) {
        String name = getName(null);
        System.out.println(name);

    }

    public static String getName(@Nullable String name) {
        return name.toString();
    }
}
