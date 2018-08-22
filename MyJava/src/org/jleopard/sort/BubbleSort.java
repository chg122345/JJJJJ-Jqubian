package org.jleopard.sort;

import java.util.Arrays;

/**
 * @Copyright (c) 2018, Chen_9g 陈刚 (80588183@qq.com).
 * @DateTime 2018-08-16  下午4:18
 *
 * <p>
 * 众里寻他千百度，蓦然回首，那人却在，灯火阑珊处。
 * Find a way for success and not make excuses for failure.
 * </p>
 * 
 * 冒泡排序
 */
public class BubbleSort {
    
    
    private static void sort(int[] arr){
        for (int i = 0; i <arr.length -1; i++) {
            for (int j = 0; j < arr.length - 1 - i; j++) {
                // 最大的 冒泡到最右边
                if (arr[j] > arr[j + 1]){
                    arr[j] = arr[j] + arr[j+1];
                    arr[j+1] = arr[j] - arr[j+1];
                    arr[j] = arr[j] - arr[j+1];
                }
            }
        }
    }

    public static void main(String[] args) {
        int[] arr = {1,4,2,56,4,23,15,7};
        sort(arr);
        Arrays.stream(arr).forEach(System.out::println);
    }
}
