package com.lebron.sort;

/**   
 * @ClassName:  QuickSort   
 * @Description: 快速排序第二种解法
 * @author: lebron
 * @date:   2018年8月7日 下午6:18:35   
 */
public class QuickSort {

    public static void main(String[] args) {
        System.out.println(Integer.MAX_VALUE);
        int[] array = new int[] { 3, 5, 2, 6, 7, 9, 1, 4, 8, 4, 2 };
        quickSort(array);
        for (int i : array) {
            System.out.println(i);
        }
    }


    /**   
     * @Title: quickSort   
     * @Description: 快速排序
     * @param: array      
     */  
    public static void quickSort(int[] array) {
        sort(array, 0, array.length -1);
    }
    
    /**   
     * @Title: sort   
     * @Description: 使用速排序，对array的left~right进行排序
     * @param: array
     * @param: left
     * @param: right      
     */  
    private static void sort(int[] array, int left, int right) {
        //定义排序左边界
        int i = left;
        //定义排序右边界
        int j=right;
        //临时变量存放基数的值
        int k=array[i];
        
        while (i < j) {
            //j从右往左遍历找到第一个小于基数的值
            while (array[j] > k && i<j) {
                j--;
            }
            if (i<j) {
                //将找到的小于基数的值赋值给array[i]
                array[i++] = array[j];
            }
            //j从左往右遍历找到第一个大于基数的值
            while (array[i] < k && i<j) {
                i++;
            }
            if (i<j) {
                //将找到的大于基数的值赋值给array[j]
                array[j--] = array[i];
            }
        }
        //上面循环结束，array[i]左边的数都比array[i]小，右边的数都比array[i]大
        //将临时变量k赋值给array[i]
        array[i] = k;
        
        if (left < i-1) {
            //递归排序array[i]左边的元素
            sort(array, left, i-1);
        }
        if (i+1 < right) {
            //递归排序array[i]右边的元素
            sort(array, i+1, right);
        }
    }
    
}
