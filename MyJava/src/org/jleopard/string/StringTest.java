package org.jleopard.string;

/**
 * @Copyright (c) 2018, Chen_9g 陈刚 (80588183@qq.com).
 * @DateTime 2018-09-09  下午8:51
 *
 * <p>
 * 众里寻他千百度，蓦然回首，那人却在，灯火阑珊处。
 * Find a way for success and not make excuses for failure.
 * </p>
 */
public class StringTest {

    public static void main(String[] args) {
        String a = "abcde";
        String b = new String("abc");
        String c = new String(new char[]{'a','b','c'});
        String d = new String(new byte[]{97,98,99});
        System.out.println(a == b);
        System.out.println(a.equals(d));
        System.out.println(c == d);
        System.out.println(a.contains(b));
    }
}
