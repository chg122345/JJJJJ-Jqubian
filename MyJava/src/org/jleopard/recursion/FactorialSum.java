/**
 * @author (c) 2018, Chen_9g 陈刚 (80588183@qq.com).
 * @date 2018-10-17  上午9:29
 *
 * <p>
 * Find a way for success and not make excuses for failure.
 * </p>
 */

package org.jleopard.recursion;

/**
 * 阶乘累加
 */
public class FactorialSum {

    public static Integer factorial(Integer num){
        if (num == 1){
            return 1;
        }
        int temp = 1;
        if (num > 1){
            for (int i = num; i >1; i-=2) {
                temp *= (i * (i- 1));
            }
        }
        return temp;
    }

    public static Integer factorial02(Integer num){
        if (num == 1){
            return 1;
        }
        int temp = 1;
        if (num > 1){
            for (int i = 1; i <=num; i++) {
                temp *= i;
            }
        }
        return temp;
    }

    public static Integer sum(Integer num){
        Integer sum = 0;
        for (int i = 1; i <= num; i++) {
            sum += factorial02(i);
        }
        return sum;
    }

    public static void main(String[] args) {
        System.out.println(sum(5));
    }
}
