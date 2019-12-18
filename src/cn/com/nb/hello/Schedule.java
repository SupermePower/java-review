package cn.com.nb.hello;

/**
 * @description
 * @author: liying.fu
 * @Date: 2018/12/30 下午3:11
 */
public class Schedule {
    private String name;
    private Byte type;
    private String time;

    public Schedule() {
    }

    public Schedule(String name, Byte type, String time) {
        this.name = name;
        this.type = type;
        this.time = time;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Byte getType() {
        return type;
    }

    public void setType(Byte type) {
        this.type = type;
    }

    public String getTime() {
        return time;
    }

    public void setTime(String time) {
        this.time = time;
    }
}
