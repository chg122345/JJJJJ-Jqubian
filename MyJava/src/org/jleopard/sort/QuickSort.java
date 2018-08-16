package org.jleopard.sort;

import java.util.Arrays;

/**
 * @Copyright (c) 2018, Chen_9g 陈刚 (80588183@qq.com).
 * @DateTime 2018-08-15  下午8:33
 *
 * <p>
 * 众里寻他千百度，蓦然回首，那人却在，灯火阑珊处。
 * Find a way for success and not make excuses for failure.
 * </p>
 */
public class QuickSort {


    /**
     * 快速排序
     * @param arr
     * @param s
     * @param e
     */
    public static void sort(int[] arr, int s, int e){
        if (s < e){
            int index =  sortUtil(arr,s,e);
            sort(arr, s,index - 1);
            sort(arr,index + 1, e);
        }


    }
    /**
     *  快速排序
     * @param arr 排序數組
     * @param s  起始位置
     * @param e   結束位置
     * @return  標杆數值
     */
    private static int sortUtil(int[] arr, int s, int e){

        int num = arr[s];
        while (s < e) {
            while(s < e){
                if (arr[e] < num){
                    arr[s] = arr[e];
                    break;
                }
                e --;
            }
            while(s < e){
                if (arr[s] >= num){
                    arr[e] = arr[s];
                    break;
                }
                s ++;
            }
        }
        arr[e] = num;
        return e;
    }

    public static void main(String[] args) {
        int[] arr = {8,8,3,1,3,65,4,5,9,12,7};
        sort(arr, 0, arr.length-1);
        Arrays.stream(arr).forEach(System.out::println);
    }
}
