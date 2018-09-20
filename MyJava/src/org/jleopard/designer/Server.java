/**
 * @author (c) 2018, Chen_9g 陈刚 (80588183@qq.com).
 * @date 2018-09-20  下午7:25
 *
 * <p>
 * Find a way for success and not make excuses for failure.
 * </p>
 */

package org.jleopard.designer;

import java.util.ArrayList;
import java.util.List;

/**
 * 具体服务
 */
public class Server implements Observerable {

    private List<Observer> list;

    private String message;

    public Server() {
        list = new ArrayList<Observer>();
    }

    @Override
    public void registerObserver(Observer o) {
        list.add(o);
    }

    @Override
    public void removeObserver(Observer o) {
        if (!list.isEmpty()){
            list.remove(o);
        }

    }

    @Override
    public void notifyObserver() {
        for(int i = 0; i < list.size(); i++) {
            Observer oberver = list.get(i);
            oberver.update(message);
        }
    }

    public void setInfomation(String s) {
        this.message = s;
        System.out.println("服务更新消息： " + s);
        //消息更新，通知所有观察者
        notifyObserver();
    }
}
