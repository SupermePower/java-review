package cn.com.nb.framework;

import cn.com.nb.domain.DemoEntity;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

/**
 *@desciption
 *@author liying.fu
 *@date 2018/7/26
 */
public class ListDemo<Job extends Runnable> {

    public static void main(String[] args) {
        BigDecimal bigDecimal = BigDecimal.ZERO;
        for (int i = 0; i < 4; i++) {
           bigDecimal = bigDecimal.add(new BigDecimal(i));
        }
        System.out.println(bigDecimal);
    }

    /**
     *@desciption
     *@author liying.fu
     *@param      
     *@return        
     *@date 2018/7/26
     */
    private static void removeElement(String name) {
        List<DemoEntity> demoEntities = new ArrayList<>();
        DemoEntity demoEntity1 = new DemoEntity(1, "Tom1");
        DemoEntity demoEntity2 = new DemoEntity(2, "Tom2");
        demoEntities.add(demoEntity1);
        demoEntities.add(demoEntity2);
        for (int i = 0; i < demoEntities.size(); i++) {
            if (demoEntities.get(i).getName().equals("Tom2")) {
                System.out.println(demoEntities.get(i));
            }
        }
        for (DemoEntity demoEntity : demoEntities) {
            if (demoEntity.getName().equals("Tom2")) {
                System.out.println(demoEntity);
            }
        }
    }
}
