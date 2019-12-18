package cn.com.nb.hello;

import java.util.Arrays;

/**
 * @description:
 * @author: GOD
 * @date: 2019/10/30 下午11:11
 */
public class PrintMaxTop {

    public static class HeapNode {
        int value;
        int arrNum;
        int index;

        HeapNode(int value, int arrNum, int index) {
            this.value = value;
            this.arrNum = arrNum;
            this.index = index;
        }
    }

    private static void printTopK(int[][] matrix, int topK) {
        HeapNode[] heap = new HeapNode[topK];
        for (int i = 0; i != topK; i++) {
            int index = matrix[i].length - 1;
            heap[i] = new HeapNode(matrix[i][index], i, index);
            heapInsert(heap, i);
        }

        System.out.println("TOP " + topK + " : ");
        for (int i = 0; i != topK; i++) {
            System.out.println(heap[i].value + " ");
        }

    }

    private static void heapInsert(HeapNode[] heap, int index) {

        while (index != 0) {

            int parent = index - 1;
            if (heap[parent].value < heap[index].value) {
                swap(heap, parent, index);
                index = parent;

            } else {
                break;
            }

        }

    }

    private static void swap(HeapNode[] heap, int index1, int index2) {
        HeapNode tmp = heap[index1];
        heap[index1] = heap[index2];
        heap[index2] = tmp;
    }

    private static int[][] generateRandomMatrix(int row, int col, int maxValue) {
        if (row < 0 || col < 0) {
            return null;
        }
        int[][] matrix = new int[row][col];
        for (int i = 0; i != matrix.length; i++) {
            for (int j = 0; j != matrix[i].length; j++) {
                matrix[i][j] = (int) (Math.random() * maxValue);
            }
            Arrays.sort(matrix[i]);
        }

        return matrix;

    }

    public static void main(String[] args) {

        int[][] matrix = generateRandomMatrix(200, 100, 20);
        printTopK(matrix, 20);

    }

}