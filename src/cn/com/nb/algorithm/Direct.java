package cn.com.nb.algorithm;

/**
 * @description 直接排序
 * @author: liying.fu
 * @Date: 2018/11/10 下午4:43
 */
public class Direct {
    public static void main(String[] args) {
        int[] array = {2, 3, 15, 6, 3, 1};
        int[] result = direct(array);
        for (int i = 0; i < result.length; i++) {
            System.out.println(result[i]);
        }
    }

    /**
     * 直接排序
     *
     * @param array 参数
     * @return 排序后数组
     */
    private static int[] direct(int[] array) {
        for (int i = 0; i < array.length - 1; i++) {
            int lowIndex = i;
            for (int j = i + 1; j < array.length; j++) {
                if (array[lowIndex] < array[j]) {
                    lowIndex = j;
                }
            }
            int temp = array[lowIndex];
            array[lowIndex] = array[i];
            array[i] = temp;
        }
        return array;
    }
}
