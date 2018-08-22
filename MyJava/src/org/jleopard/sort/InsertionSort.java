package org.jleopard.sort;

import java.util.Arrays;

/**
 * @Copyright (c) 2018, Chen_9g 陈刚 (80588183@qq.com).
 * @DateTime 2018-08-22  上午11:23
 *
 * <p>
 * 众里寻他千百度，蓦然回首，那人却在，灯火阑珊处。
 * Find a way for success and not make excuses for failure.
 * </p>
 *
 * 直接插入排序
 */
public class InsertionSort {

    public static void  sort(int[] arr){

        for (int i = 0; i < arr.length - 1 ; i++) {
            int temp = arr[i];
            for (int j = i - 1; j >= 0 ; j--) {
                if (temp < arr[j]){
                    arr[j+1] = arr[j];
                    arr[j] = temp;
                }else {
                    arr[j+1] = temp;
                    break;
                }
            }
        }
    }

    public static void main(String[] args) {
        int[] arr = {10,4,12,7,45,32,2,4,5,78};
        sort(arr);
        Arrays.stream(arr).forEach(System.out::println);
    }
}
