package cn.com.nb.hello;

import java.util.LinkedList;
import java.util.List;
import java.util.Optional;

/**
 * @description
 * @author: liying.fu
 * @Date: 2019/1/12 下午5:26
 */
public class MerchantTest {

    public static List<Merchant> getMerchantList() {
        List<Merchant> merchantList = new LinkedList<>();
        Merchant m1 = new Merchant(1L, "炒饭", (byte) 0, "快餐");
        Merchant m2 = new Merchant(2L, "麻辣烫", (byte) 0, "川菜");
        Merchant m3 = new Merchant(3L, "米线", (byte) 0, "云南菜");
        Merchant m4 = new Merchant(4L, "烤鸭", (byte) 0, "北京菜");
        Merchant m5 = new Merchant(5L, "披萨", (byte) 0, "西餐");
        Merchant m6 = new Merchant(6L, "汉堡", (byte) 0, "西餐");
        Merchant m7 = new Merchant(7L, "快餐", (byte) 0, "快餐");
        merchantList.add(m1);
        merchantList.add(m2);
        merchantList.add(m3);
        merchantList.add(m4);
        merchantList.add(m5);
        merchantList.add(m6);
        merchantList.add(m7);
        return merchantList;
    }

    public static void main(String[] args) {
        Optional<String> name = getName(1);
        System.out.println(name.orElse("年龄太小"));
    }

    private static String getCateNameTradition() {
        List<Merchant> merchantList = getMerchantList();
        Merchant merchant = new Merchant(6L, "汉堡", (byte) 0, "西餐");
        for (Merchant temp : merchantList) {
            if (temp.getId().equals(merchant.getId())) {
                return temp.getCateName();
            }
        }
        return "暂无品类信息";
    }

    public static String getCateNameJavaEight() {
        List<Merchant> merchantList = getMerchantList();
        Merchant merchant = new Merchant(8L, "汉堡", (byte) 0, "西餐");
        Optional<String> any = merchantList.stream()
                .filter(temp -> temp.getId().equals(merchant.getId()))
                .map(Merchant::getCateName)
                .findAny();
        return any.orElse("暂无品类信息");
    }

    public static Optional<String> getName(Integer age) {
        if (age.compareTo(1) >= 1) {
            return Optional.of("成功");
        }
        return Optional.empty();
    }
}
