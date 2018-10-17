/**
 * @author (c) 2018, Chen_9g 陈刚 (80588183@qq.com).
 * @date 2018-10-17  上午9:21
 *
 * <p>
 * Find a way for success and not make excuses for failure.
 * </p>
 */

package org.jleopard.recursion;

import java.util.ArrayList;
import java.util.List;

/**
 * 完数
 */
public class PrefectNum {

    public static List<Integer> prefect(Integer size) {
        List<Integer> list = new ArrayList<>();
        for (int i = 1; i < size; i++) {
            int temp = 0;
            for (int j = 1; j < i; j++) {
                if (i % j == 0) {
                    temp += j;
                }
            }
            if (i == temp) {
                System.out.println("完数-->" + i);
                list.add(i);
            }
        }
        return list;
    }

    public static void main(String[] args) {
        List<Integer> list = prefect(1000);
        list.stream().forEach(System.out::println);
    }
}
