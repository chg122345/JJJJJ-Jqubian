package org.jleopard.sort;

import java.util.Arrays;

/**
 * @Copyright (c) 2018, Chen_9g 陈刚 (80588183@qq.com).
 * @DateTime 2018-08-16  上午10:29
 *
 * <p>
 * 众里寻他千百度，蓦然回首，那人却在，灯火阑珊处。
 * Find a way for success and not make excuses for failure.
 * </p>
 *
 * 堆排序 二叉树
 */
public class HeapSort {

    /**
     *  堆排序  最大堆 二叉树原理
     * @param arr
     */
    public static void sort(int[] arr){
        int size = arr.length;
        while(size > 1){
            // 循环所有父节点  从后向前循环
            for (int i = (size - 1)/2; i >= 1; i--){
                int maxIndex = i * 2; // 左儿子 假设他的值最大
                int rightIndex = maxIndex + 1; //右儿子
                // 右儿子存在 并且右儿子 大于左儿子
                if (size > rightIndex && arr[rightIndex] > arr[maxIndex]){
                    maxIndex =rightIndex;
                }
                // 最大的儿子与父节点比较 儿子比父亲大 则交换位置
                if (arr[maxIndex] > arr[i]){
                    int temp = arr[maxIndex];
                    arr[maxIndex] = arr[i];
                    arr[i] = temp;
                }
            }
            // 最大的数冒泡到最后的节点
            int temp = arr[1];
            arr[1] = arr[size - 1];
            arr[size - 1] = temp;
            size --;
        }
    }

    /**
     * 建小堆
     * @param arr
     */
    public static void sort2(int[] arr){
        int size = arr.length;
        while(size > 1){
            // 循环所有父节点  从后向前循环
            for (int i = (size - 1)/2; i >= 1; i--){
                int minIndex = i * 2; // 左儿子 假设他的值最小
                int rightIndex = minIndex + 1; //右儿子
                // 右儿子存在 并且右儿子 小于左儿子
                if (size > rightIndex && arr[rightIndex] < arr[minIndex]){
                    minIndex =rightIndex;
                }
                // 最大的儿子与父节点比较 儿子比父亲小 则交换位置
                if (arr[minIndex] < arr[i]){
                    int temp = arr[minIndex];
                    arr[minIndex] = arr[i];
                    arr[i] = temp;
                }
            }
            // 最小的数冒泡到最后一个节点 依次次循环
            int temp = arr[1];
            arr[1] = arr[size - 1];
            arr[size - 1] = temp;
            size --;
        }
    }

    public static void main(String[] args) {
        int[] arr = {265,4,5,6,7,8,5,21,25,14};
        sort2(arr);
        Arrays.stream(arr).forEach(System.out::println);
    }
}
