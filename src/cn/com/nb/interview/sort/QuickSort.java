package cn.com.nb.interview.sort;

/**
 * @description:
 * @author: GOD
 * @date: 2019/11/27 下午10:29
 */
public class QuickSort {

    public static void main(String[] args) {
        int[] array = new int[]{2, 1, 4, 5, 9, 4, 5, 7, 0, 3};
        quickSort(array, 0, array.length - 1);
        for (int i : array) {
            System.out.print(i + "\t");
        }
    }

    private static void quickSort(int[] array, int l, int r) {
        if (l < r) {
            int middle = partition(array, l, r);
            quickSort(array, l, middle - 1);
            quickSort(array, middle + 1, r);
        }
    }

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
}
