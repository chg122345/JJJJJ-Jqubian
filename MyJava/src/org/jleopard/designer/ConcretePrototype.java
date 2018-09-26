/**
 * @author (c) 2018, Chen_9g 陈刚 (80588183@qq.com).
 * @date 2018-09-26  下午9:38
 *
 * <p>
 * Find a way for success and not make excuses for failure.
 * </p>
 */

package org.jleopard.designer;

public class ConcretePrototype implements Prototype {

    @Override
    public Prototype clone() {
        Prototype prototype = new ConcretePrototype();
        return prototype;
    }
}
