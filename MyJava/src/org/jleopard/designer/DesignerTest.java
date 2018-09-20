/**
 * @author (c) 2018, Chen_9g 陈刚 (80588183@qq.com).
 * @date 2018-09-17  下午8:12
 *
 * <p>
 * Find a way for success and not make excuses for failure.
 * </p>
 */

package org.jleopard.designer;

public class DesignerTest {

    public static void main(String[] args) {
        //单列模式
        /*Singleton singleton = Singleton.getInstance();
        new Thread(()-> System.out.println(singleton.say("JL0"))).start();
        new Thread(()-> System.out.println(singleton.say("JL1"))).start();
        new Thread(()-> System.out.println(singleton.say("JL2"))).start();
        new Thread(()-> System.out.println(singleton.say("JL3"))).start();
        new Thread(()-> System.out.println(singleton.say("JL4"))).start();
        new Thread(()-> System.out.println(singleton.say("JL5"))).start();*/

        // 观察者模式
        Server server = new Server();
        Observer zs = new UserObserver("张三");
        Observer ls = new UserObserver("李四");
        Observer  wml= new UserObserver("王美丽");
        server.registerObserver(zs);
        server.registerObserver(ls);
        server.registerObserver(wml);
        server.setInfomation("Java是世界上最好用的语言！");

        server.removeObserver(zs);
        server.setInfomation("明天放假！");

    }
}
