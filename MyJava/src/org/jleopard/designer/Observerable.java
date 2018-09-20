/**
 * @author (c) 2018, Chen_9g 陈刚 (80588183@qq.com).
 * @date 2018-09-20  下午7:20
 *
 * <p>
 * Find a way for success and not make excuses for failure.
 * </p>
 */

package org.jleopard.designer;

/**
 * 观察者模式
 */
public interface Observerable {

    /**
     * 注册
     * @param o
     */
    void registerObserver(Observer o);

    /**
     * 移除
     * @param o
     */
    void removeObserver(Observer o);

    /**
     * 通知
     */
    void notifyObserver();
}
