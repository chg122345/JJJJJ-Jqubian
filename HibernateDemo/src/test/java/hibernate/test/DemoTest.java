/**
 * @author (c) 2018, Chen_9g 陈刚 (80588183@qq.com).
 * @date 2018-10-20  下午10:22
 *
 * <p>
 * Find a way for success and not make excuses for failure.
 * </p>
 */

package hibernate.test;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.jleopard.SessionFactoryUtils;
import org.jleopard.entity.User;
import org.junit.Test;

public class DemoTest {

    @Test
    public void saveTest(){
        User user = new User();
        user.setAddress("China");
        user.setName("JL03");
        user.setPhone("10086");
        SessionFactory sessionFactory = SessionFactoryUtils.getSessionFactory();
        Session session = sessionFactory.openSession();
        Transaction transaction = session.beginTransaction();
        session.save(user);
        transaction.commit();
        session.close();
        sessionFactory.close();
    }

    @Test
    public void getTest(){

        SessionFactory sessionFactory = SessionFactoryUtils.getSessionFactory();
        Session session = sessionFactory.openSession();
        Transaction transaction = session.beginTransaction();
        User user = session.get(User.class, 1);
        user.setPhone("10010");
        System.out.println(user);
        transaction.commit();
        session.close();
        sessionFactory.close();
    }
}
