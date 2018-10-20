/**
 * @author (c) 2018, Chen_9g 陈刚 (80588183@qq.com).
 * @date 2018-10-20  下午9:13
 *
 * <p>
 * Find a way for success and not make excuses for failure.
 * </p>
 */

package org.jleopard;

public class DemoTest {

    public static int switchTest(int arg) {
        int temp = 0;
        switch (arg) {
            case 1:
                temp += 1;
                break;
            case 2:
                temp += 2;
                break;
            case 3:
            temp += 3;
            default:
                temp +=10;
        }
        return temp;
    }


    public static int finallyTest() {
        int temp = 0;
       try {
           temp +=1;
           //int a = 1/0;
       }catch (Exception e){
           temp +=2;
       }finally {
           temp +=1;
       }
        return temp;
    }


    public static void main(String[] args) throws Throwable {
        System.out.println(switchTest(2));
        System.out.println(finallyTest());
    }

}
