package cn.com.nb.reflect;

/**
 * @description:
 * @author: GOD
 * @date: 2020/3/7 上午9:48
 */
public class ReflectModel {

    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "ReflectModel{" +
                "name='" + name + '\'' +
                '}';
    }
}
