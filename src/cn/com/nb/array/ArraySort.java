package cn.com.nb.array;

/**
 * @description:
 * @author: GOD
 * @date: 2019/10/23 下午10:44
 */
public class ArraySort {

    public static void main(String[] args) {
        int[] sort = sortMP(new int[]{2, 3, 1, 6, 7, 4});
        for (int s : sort) {
            System.out.print(s + "\t");
        }
        System.out.println("");
        System.out.println("--------------------------");
        int[] sortCR = sortCR(new int[]{2, 3, 1, 6, 7, 4});
        for (int cr : sortCR) {
            System.out.print(cr + "\t");
        }
    }

    /**
     * 排序(冒泡排序)
     *
     * @param param 参数
     * @return 结果
     */
    private static int[] sortMP(int[] param) {
        int index = 0;
        for (int i = 0; i < param.length - 1; i++) {
            for (int j = i + 1; j < param.length; j++) {
                if (param[i] > param[j]) {
                    int temp = param[i];
                    param[i] = param[j];
                    param[j] = temp;
                }
                index++;
            }
        }
        System.out.println("一共循环：" + index + " 次");
        return param;
    }

    /**
     * 排序
     *
     * @param param 参数
     * @return 结果
     */
    private static int[] sortCR(int[] param) {
        int times = 0;
        for (int i = 0; i < param.length - 1; i++) {
            for (int j = i + 1; j > 0; j--) {
                times++;
                if (param[j] < param[j - 1]) {
                    int temp = param[j];
                    param[j] = param[j - 1];
                    param[j - 1] = temp;
                }
            }

        }
        System.out.println("一共循环：" + times + " 次");
        return param;
    }
}
