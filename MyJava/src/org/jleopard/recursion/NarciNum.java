package org.jleopard.recursion;

import java.util.ArrayList;
import java.util.List;

/**
 * @Copyright (c) 2018, Chen_9g 陈刚 (80588183@qq.com).
 * @DateTime 2018-09-01  下午9:55
 *
 * <p>
 * 众里寻他千百度，蓦然回首，那人却在，灯火阑珊处。
 * Find a way for success and not make excuses for failure.
 * </p>
 * <p>
 * 水仙花数
 */
public class NarciNum {

    public static List<Integer> narciNum(int start, int end) {
        List<Integer> list = new ArrayList<>();
        for (int i = start; i < end; i++) {
            int firstNum = i / 100;
            int secondNum = i / 10 % 10;
            int thirdNum = i % 10;
            if (Math.pow(firstNum, 3) + Math.pow(secondNum, 3) + Math.pow(thirdNum, 3) == i) {
                list.add(i);
            }
        }
        return list;
    }


    public static void main(String[] args) {
        narciNum(100,1000).stream().forEach(System.out::println);
    }

}
