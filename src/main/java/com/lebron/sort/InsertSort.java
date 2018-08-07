package com.lebron.sort;

/**   
 * @ClassName:  InsertSort   
 * @Description: 插入排序
 * @author: lebron
 * @date:   2018年8月7日 下午6:19:19   
 */
public class InsertSort {
    public static void main(String[] args) {
        int[] array = new int[] { 3, 5, 2, 6, 7, 9, 1, 4, 8, 4, 2 };
        insertSort(array);
        for (int i : array) {
            System.out.println(i);
        }
    }

    /**
     * @Title: insertSort
     * @Description: 插入排序
     * @param: array
     */
    public static void insertSort(int[] array) {
        int n = array.length;
        for (int i = 0; i < n - 1; i++) {
            // 标记无序部分最后一个元素，作为待插入元素
            int k = n - 1 - i - 1;
            int j;
            // 遍历有序部分，将array[k]与有序部分元素进行比较
            for (j = k + 1; j < n; j++) {
                // 找出待插入元素的位置 j-1
                if (array[k] <= array[j]) {
                    break;
                }
            }
            // 将待插入元素插入到有序部分
            if (k != j - 1) {
                insertItem(array, k, j - 1);
            }
        }
    }

    /**
     * @Title: insertItem
     * @Description: 把数组array下标为i的元素插入到下标为j的位置
     * @param: array
     * @param: i
     * @param: j
     */
    private static void insertItem(int[] array, int i, int j) {
        int temp = array[i];
        for (int k = i + 1; k <= j; k++) {
            array[k - 1] = array[k];
        }
        array[j] = temp;
    }
}
