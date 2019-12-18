package cn.com.nb.hello;



/**
 * @description: 断言测试
 * @author: liying.fu
 * @date: 2019/5/3 下午9:47
 */
public class AssertTest {

    public static void main(String[] args) {
        Integer res = add(1, 2);
        try {
            Assert.isNull(res, "计算结果为空，请检查add()方法......");
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        System.out.println(res);
    }

    private static Integer add(int x, int y) {
        return null;
    }
}
