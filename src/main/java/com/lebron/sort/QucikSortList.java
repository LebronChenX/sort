package com.lebron.sort;

import java.util.ArrayList;
import java.util.List;

/**   
 * @ClassName:  QucikSortList   
 * @Description: 快速排序第一种解法
 * @author: lebron
 * @date:   2018年8月7日 下午6:18:50   
 */
public class QucikSortList {

    public static void main(String[] args) {
        int[] array = new int[] { 3, 5, 2, 6, 7, 9, 1, 4, 8, 4, 2 };
        List<Integer> list = new ArrayList<Integer>();
        for (Integer integer : array) {
            list.add(integer);
        }
        quickSort(list);
        for (Integer integer : list) {
            System.out.println(integer);
        }
    }

    /**   
     * @Title: quickSort   
     * @Description: 快速排序，使用list实现  
     * @param: items      
     */  
    public static void quickSort(List<Integer> items) {
        //用于存放小于基数的元素
        List<Integer> smaller = new ArrayList<Integer>();
        //用于存放等于基数的元素
        List<Integer> same = new ArrayList<Integer>();
        //用于存放大于基数的元素
        List<Integer> larger = new ArrayList<Integer>();

        //选择中间元素作为基数（选择任意元素作为基数都可以）
        Integer choosenItem = items.get(items.size() / 2);
        //遍历所有元素，根据元素和基数的大小关系，将元素添加到三个list中
        for (Integer i : items) {
            if (i < choosenItem) {
                smaller.add(i);
            } else if (i == choosenItem) {
                same.add(i);
            } else {
                larger.add(i);
            }
        }

        if (smaller.size() > 1) {
            //递归排序小于基数的元素
            quickSort(smaller);
        }
        if (larger.size() > 1) {
            //递归排序大于基数的元素
            quickSort(larger);
        }

        //清除list中原来的元素
        items.clear();
        //按照大小顺序把元素添加到list中
        items.addAll(smaller);
        items.addAll(same);
        items.addAll(larger);
    }

}
