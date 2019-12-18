package cn.com.nb.domain;

public class DemoEntity implements Demo {

    private int code;
    private String name;

    public DemoEntity() {
    }

    public DemoEntity(int code, String name) {
        this.code = code;
        this.name = name;
    }

    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "DemoEntity{" +
                "code=" + code +
                ", name='" + name + '\'' +
                '}';
    }

    @Override
    public DemoEntity queryDemo(int code, String name) {
        return new DemoEntity(code, name);
    }
}
