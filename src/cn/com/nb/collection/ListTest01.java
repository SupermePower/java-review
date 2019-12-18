package cn.com.nb.collection;

import cn.com.nb.domain.DemoEntity;

import java.util.*;
import java.util.function.Consumer;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

/**
 * @author liying.fu
 * @desciption 集合测试
 * @date 2018/8/19
 */
public class ListTest01 {

    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        //生产
        list.add("A");
        list.add("B");
        list.add("C");
        list.add("C");
        List<String> collect = list.stream().distinct().collect(Collectors.toList());
        System.out.println(collect);


        List<DemoEntity> iList = new ArrayList<>();
        DemoEntity d1 = new DemoEntity();
        d1.setCode(1);
        iList.add(d1);

        DemoEntity d50 = new DemoEntity();
        d50.setCode(50);
        iList.add(d50);

        DemoEntity d100 = new DemoEntity();
        d100.setCode(100);
        iList.add(d100);

        DemoEntity d101 = new DemoEntity();
        d101.setCode(10);
        iList.add(d101);
        List<DemoEntity> integers = iList.stream()
                .filter(demo -> demo.getCode() < 100)
                .collect(Collectors.toList());
        for (DemoEntity demoEntity : integers) {
            System.out.println(demoEntity.toString());
        }

        List<Integer> integers1 = new ArrayList<>();
        integers1.add(1);
        integers1.add(2);
        integers1.add(101);
        integers1.add(15);
        List<Integer> collect1 = integers1.stream().filter(x -> x < 100).collect(Collectors.toList());
        System.out.println(collect1);
    }

    public static void testPrint(String string) {
        System.out.println("HelloWord");
    }

    public static String getNewEquipmentNo(String equipmentType, String equipmentNo) {
        String newEquipmentNo = "00001";

        if (equipmentNo != null && !equipmentNo.isEmpty()) {
            int newEquipment = Integer.parseInt(equipmentNo) + 1;
            newEquipmentNo = String.format(equipmentType + "%05d", newEquipment);
        }

        return newEquipmentNo;
    }

    /**
     * 测试02
     */
    private static List<DemoEntity> test02() {
        List<DemoEntity> list = new ArrayList<>();
        for (int i = 1; i <= 4; i++) {
            DemoEntity demo = new DemoEntity();
            demo.setCode(i);
            demo.setName(i + "");
            list.add(demo);
        }
        IntStream intStream = list.stream().mapToInt(DemoEntity::getCode);
        OptionalInt max = intStream.max();
        System.out.println(max.getAsInt());
        list.forEach(new Consumer<DemoEntity>() {
            @Override
            public void accept(DemoEntity demoEntity) {
                System.out.println(demoEntity.toString());
            }
        });
        return list;
    }

    /**
     * list map 遍历测试
     */
    private static void test01() {
        List<String> list = new ArrayList<>();
        list.add("A");
        list.add("B");
        list.add("C");
        list.add("D");
        list.add("E");
        list.forEach(l -> System.out.println(l));
        Map<String, Object> map = new HashMap<>();
        map.put("a", "A");
        map.put("b", "B");
        map.put("c", "C");
        map.put("d", "D");
        map.forEach((k, v) -> System.out.println(k + "-" + v));
    }
}
