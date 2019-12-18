package cn.com.nb.hello;

/**
 * @description
 * @author: liying.fu
 * @Date: 2019/1/12 下午5:24
 */
public class Merchant {
    private Long id;
    private String name;
    private Byte type;
    private String cateName;

    public Merchant(Long id, String name, Byte type, String cateName) {
        this.id = id;
        this.name = name;
        this.type = type;
        this.cateName = cateName;
    }


    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
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

    public String getCateName() {
        return cateName;
    }

    public void setCateName(String cateName) {
        this.cateName = cateName;
    }

    @Override
    public String toString() {
        return "Merchant{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", type=" + type +
                ", cateName='" + cateName + '\'' +
                '}';
    }
}
