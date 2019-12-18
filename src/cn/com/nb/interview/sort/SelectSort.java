package cn.com.nb.interview.sort;

/**
 * @description: 选择排序
 * @author: GOD
 * @date: 2019/11/25 下午2:28
 */
public class SelectSort {

    public static void main(String[] args) {
        for (int i : selectSort(new int[]{2, 1, 3, 4, 6, 3, 9, 7, 8})) {
            System.out.print(i + "\t");
        }
    }

    /**
     * 选择排序
     *
     * @param array 数组
     */
    private static int[] selectSort(int[] array) {
        for (int i = 0; i < array.length - 1; i++) {
            int minIndex = i;
            for (int j = i + 1; j < array.length; j++) {
                if (array[minIndex] > array[j]) {
                    minIndex = j;
                }
            }
            int temp = array[i];
            array[i] = array[minIndex];
            array[minIndex] = temp;
        }
        return array;
    }
}
