package com.lebron.sort;

/**   
 * @ClassName:  MergeSort   
 * @Description: 归并排序
 * @author: lebron
 * @date:   2018年8月7日 下午6:19:09   
 */
public class MergeSort {

    public static void main(String[] args) {
        int[] array = new int[] { 3, 5, 2, 6, 7, 9, 1, 4, 8, 4, 2 };
        mergeSort(array);
        for (int i : array) {
            System.out.println(i);
        }
    }

    /**
     * @Title: mergeSort 
     * @Description: 归并排序 
     * @param: array
     * void @throws
     */
    public static void mergeSort(int[] array) {
        int[] temp = new int[array.length];
        sort(array, temp, 0, array.length - 1);
    }

    /**
     * @Title: sort
     * @Description: 使用归并排序，对array的left~right进行排序
     * @param: array
     * @param: temp
     * @param: left
     * @param: right
     */
    private static void sort(int[] array, int[] temp, int left, int right) {
        // 定义待排序中间元素
        int mid = (left + right) / 2;
        if (left < mid) {
            // 递归排序中间元素及左边的元素
            sort(array, temp, left, mid);
        }
        if (mid + 1 < right) {
            // 递归排序中间元素右边的元素
            sort(array, temp, mid + 1, right);
        }
        // 合并左右两边的元素
        merge(array, temp, left, mid, right);
    }

    /**
     * @Title: merge
     * @Description: 借助temp数组，合并mid元素左右的元素
     * @param: array
     * @param: temp
     * @param: left
     * @param: mid
     * @param: right
     */
    private static void merge(int[] array, int[] temp, int left, int mid, int right) {
        // 用于遍历左边元素
        int i = left;
        // 用于遍历右边元素
        int j = mid + 1;
        // 临时变量
        int t = 0;
        while (i <= mid && j <= right) {
            // 将左右两边最小的元素添加到temp数组中
            if (array[i] <= array[j]) {
                temp[t++] = array[i++];
            } else {
                temp[t++] = array[j++];
            }
        }

        while (i <= mid) {
            // 将左边剩余元素添加到temp数组中
            temp[t++] = array[i++];
        }
        while (j <= right) {
            // 将右边剩余元素添加到temp数组中
            temp[t++] = array[j++];
        }
        t = 0;
        // 将temp中的元素全部拷贝到原数组中
        while (left <= right) {
            array[left++] = temp[t++];
        }
    }
}
