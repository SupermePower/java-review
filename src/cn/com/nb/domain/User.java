package cn.com.nb.domain;

/**
 * @description 用户
 * @author: liying.fu
 * @Date: 2018/8/26 下午4:18
 */
public class User {

    private String name;
    private String sex;
    private String code;

    public User() {
    }

    public User(String name, String sex, String code) {
        this.name = name;
        this.sex = sex;
        this.code = code;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    @Override
    public String toString() {
        return "User{" +
                "name='" + name + '\'' +
                ", sex='" + sex + '\'' +
                ", code='" + code + '\'' +
                '}';
    }
}
