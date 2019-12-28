package cn.com.nb.nowcode;

/**
 * @description:
 * @author: GOD
 * @date: 2019/12/28 上午11:06
 */
public class QuickSortFirstArray {

    public static void main(String[] args) {
        int[] array = new int[]{12, 15, 1, 18, 2, 35, 30, 11};
        quickSort(array, 0, array.length - 1);
    }

    private static void quickSort(int[] array, int l, int r) {
        if (l < r) {
            int middel = partition(array, l, r);
            quickSort(array, l, middel - 1);
            quickSort(array, middel + 1, r);
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

        for (int element : array) {
            System.out.print(element + "\t");
        }
        System.exit(0);
        return l;
    }
}
