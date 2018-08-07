package com.lebron.sort;


/**   
 * @ClassName:  SelectSort   
 * @Description: 选择排序 
 * @author: lebron
 * @date:   2018年8月7日 下午6:17:31   
 */
public class SelectSort {
    public static void main(String[] args) {
        int[] array = new int[] { 3, 5, 2, 6, 7, 9, 1, 4, 8, 4, 2 };
        selectSort(array);
        for (int i : array) {
            System.out.println(i);
        }
    }

    /**
     * @Title: selectSort
     * @Description: 选择排序
     * @param: array
     */
    public static void selectSort(int[] array) {
        int n = array.length;
        for (int i = 0; i < n; i++) {
            //记录最大元素的下标
            int max = 0;
            for (int j = 0; j<n-i; j++) {
                if (array[j] > array[max]) {
                    max = j;
                }
            }
            //最大元素和无序部分最后一个元素交换
            if (max != n-1-i) {
                swap(array, max, n-1-i);
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
