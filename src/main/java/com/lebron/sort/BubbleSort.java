package com.lebron.sort;

/**   
 * @ClassName:  BubbleSort   
 * @Description: 冒泡排序
 * @author: lebron
 * @date:   2018年8月7日 下午6:19:28   
 */
public class BubbleSort {
    public static void main(String[] args) {
        int[] array = new int[] { 3, 5, 2, 6, 7, 9, 1, 4, 8, 4, 2 };
        bubbleSort(array);
        for (int i : array) {
            System.out.println(i);
        }
    }

    /**
     * @Title: bubbleSort
     * @Description: 冒泡排序
     * @param: array
     */
    public static void bubbleSort(int[] array) {
        int n = array.length;
        for (int i = 0; i < n - 1; i++) {
            //在这里j不需要遍历到n-1了，因为n-1-i~n-1之间的元素已经排好序了，不需要再比较
            for (int j = 0; j < n - 1 - i; j++) {
                //将最大元素移动到数组末尾
                if (array[j] > array[j + 1]) {
                    swap(array, j, j + 1);
                }
            }
        }
    }

    /**
     * @Title: swap
     * @Description: 交换数组array中下标为i和j的元素
     * @param: array
     * @param: i
     * @param: j
     */
    private static void swap(int[] array, int i, int j) {
        array[i] = array[i] + array[j];
        array[j] = array[i] - array[j];
        array[i] = array[i] - array[j];
    }
}
