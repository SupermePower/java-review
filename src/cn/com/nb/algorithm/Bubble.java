package cn.com.nb.algorithm;

/**
 * @description 冒泡排序
 * @author: liying.fu
 * @Date: 2018/11/10 下午4:35
 */
public class Bubble {

    public static void main(String[] args) {
        int[] array = {2, 3, 15, 6, 3, 1};
        int[] result = bubble(array);
        for (int i = 0; i < result.length; i++) {
            System.out.println(result[i]);
        }
    }

    /**
     * 冒泡排序
     *
     * @param array 参数数组
     * @return 响应数组
     */
    private static int[] bubble(int[] array) {
        for (int i = 0; i < array.length - 1; i++) {
            for (int j = i + 1; j < array.length; j++) {
                if (array[i] < array[j]) {
                    int temp = array[i];
                    array[i] = array[j];
                    array[j] = temp;
                }
            }
        }
        return array;
    }
}
