package cn.com.nb.interview.sort;

/**
 * @description:
 * @author: GOD
 * @date: 2019/12/4 下午11:57
 */
public class Sort {

    public static void main(String[] args) {
        int[] array = new int[]{4, 1, 6, 3, 0, 2, 5};
        insertSort(array);
        for (int i : array) {
            System.out.print(i + "\t");
        }
    }

    /**
     * 冒泡排序
     *
     * @param array 数组
     */
    private static void bubbleSort(int[] array) {
        for (int i = 0; i < array.length - 1; i++) {
            for (int j = i + 1; j < array.length; j++) {
                if (array[i] > array[j]) {
                    swap(array, i, j);
                }
            }
        }
    }

    /**
     * 选择排序
     *
     * @param array 数组
     */
    private static void selectionSort(int[] array) {
        for (int i = 0; i < array.length - 1; i++) {
            int minIndex = i;
            for (int j = i + 1; j < array.length; j++) {
                if (array[minIndex] > array[j]) {
                    minIndex = j;
                }
            }
            swap(array, i, minIndex);
        }
    }

    /**
     * 快速排序
     *
     * @param array 数组
     * @param l     左
     * @param r     右
     */
    private static void quickSort(int[] array, int l, int r) {
        if (l < r) {
            int middle = partition(array, l, r);
            quickSort(array, l, middle - 1);
            quickSort(array, middle + 1, r);
        }
    }

    /**
     * 插入排序
     *
     * @param array 数组
     */
    private static void insertSort(int[] array) {
        for (int i = 0; i < array.length - 1; i++) {
            for (int j = i + 1; j > 0; j--) {
                if (array[j] < array[j - 1]) {
                    swap(array, j - 1, j);
                }
            }
        }
    }

    /**
     * 获取数组中间位置
     *
     * @param array 数组
     * @param l     左侧
     * @param r     右侧
     * @return 数组中间值
     */
    private static int partition(int[] array, int l, int r) {
        int x = array[l];
        while (l < r) {
            while (l < r && array[r] > x) {
                r--;
            }
            array[l] = array[r];
            while (l < r && array[l] <= x) {
                l++;
            }
            array[r] = array[l];
        }
        array[l] = x;
        return l;
    }

    /**
     * 交换
     *
     * @param array 数组
     * @param i     第一个索引
     * @param j     第二个索引
     */
    private static void swap(int[] array, int i, int j) {
        int temp = array[i];
        array[i] = array[j];
        array[j] = temp;
    }
}
