/**
 * @author (c) 2018, Chen_9g 陈刚 (80588183@qq.com).
 * @date 2018-10-22  下午11:09
 *
 * <p>
 * Find a way for success and not make excuses for failure.
 * </p>
 */

package hibernate.test;

import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.query.Query;
import org.jleopard.SessionFactoryUtils;
import org.junit.Test;

public class HQLTest {

    @Test
    public void hqlTest(){
        SessionFactory sessionFactory = null;
        Session session = null;
        Transaction transaction = null;
       // String hql = "from Role role where role.id =?0 ";
        String hql = "from Role";
        try {
            sessionFactory = SessionFactoryUtils.getSessionFactory();
            session = sessionFactory.openSession();
            transaction = session.beginTransaction();
            Query query = session.createQuery(hql);
            //query.setInteger(0,2);
            query.setFirstResult(1);
            query.setMaxResults(3);
            query.list().stream().forEach(System.out::println);
            transaction.commit();
        } catch (HibernateException e) {
            e.printStackTrace();
            transaction.rollback();
        } finally {
            session.close();
            sessionFactory.close();
        }
    }
}
