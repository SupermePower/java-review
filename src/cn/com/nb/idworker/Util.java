package cn.com.nb.idworker;

import java.util.HashSet;
import java.util.Set;

public class Util {

    /**
     * 生成id，时间戳+三位随机数
     * @return
     */
    public static Long getId(){
        String code = String.valueOf(System.currentTimeMillis());
        //取三位随机数
        int random = (int)(Math.random()*900)+100;
        code = code + String.format("%03d", random);
        return Long.valueOf(code);
    }


    public static void main(String[] args) {
        Set<Long> idSet = new HashSet<>();
        boolean isGo = true;
        while (isGo) {
            Long id = Util.getId();
            System.out.println(id);
            isGo = idSet.add(id);
        }
    }
}
