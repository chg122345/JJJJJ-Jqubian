package org.jleopard.lambda;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

/**
 * @Copyright (c) 2018, Chen_9g 陈刚 (80588183@qq.com).
 * @DateTime 2018-09-11  下午8:15
 *
 * <p>
 * 众里寻他千百度，蓦然回首，那人却在，灯火阑珊处。
 * Find a way for success and not make excuses for failure.
 * </p>
 */
public class LambdaTest{

    public static void main(String[] args) {

       /* for (int i = 0; i < 5; i++) {
            new Thread(()->System.out.println("线程1")).start();
            new Thread(()->System.out.println("线程2")).start();
            new Thread(()->System.out.println("线程3")).start();
        }
*/
       /* String a = "GG";
        Stream.of(a).map(i-> i+"JJ").forEach(System.out::println);*/

        List<Integer> list = Arrays.asList(1,2,2,2,8,5,6,7,6,9);
      //  list.stream().distinct().forEach(System.out::println);
      //  list.stream().filter(i->i>5).forEach(System.out::println);
        list.stream().flatMap(i->Arrays.asList(i).stream()).forEach(System.out::println);
    }

    public static String sayHello(String arg){
       return arg + ": Hello World";
    }
}
