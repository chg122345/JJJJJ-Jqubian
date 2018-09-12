package org.jleopard.lock;

import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

/**
 * @Copyright (c) 2018, Chen_9g 陈刚 (80588183@qq.com).
 * @DateTime 2018-09-12  下午6:33
 *
 * <p>
 * 众里寻他千百度，蓦然回首，那人却在，灯火阑珊处。
 * Find a way for success and not make excuses for failure.
 * </p>
 */
public class LockTest {

    private Lock lock = new ReentrantLock();

    private Integer count=0;
    public void method(Thread thread){
//        count ++;
//        System.out.println(count);
        lock.lock();
        count ++;
        try {
            System.out.println("线程名： " + thread.getName() +"获得了锁"+" ->"+count);
        }catch (Exception e){
            e.printStackTrace();
        }finally {
            System.out.println("线程名： " + thread.getName() +"解锁");
            lock.unlock();
        }
    }

    public void method2(Thread thread) throws InterruptedException {
        //如果2秒内获取不到锁 那就放弃
        if (lock.tryLock(2, TimeUnit.SECONDS)){
            count ++;
            try {
                System.out.println("线程名： " + thread.getName() +"获得了锁"+" ->"+count);
            }catch (Exception e){
                e.printStackTrace();
            }finally {
                System.out.println("线程名： " + thread.getName() +"解锁");
                lock.unlock();
            }
        }

    }


    public static void main(String[] args) {
        LockTest lockTest = new LockTest();
        long start = System.currentTimeMillis();
        for (int i = 0; i <15 ; i++) {
            new Thread(()-> {
                try {
                    lockTest.method2(Thread.currentThread());
                    Thread.sleep(3);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }).start();
            new Thread(()-> {
                try {
                    lockTest.method2(Thread.currentThread());
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }).start();
            new Thread(()-> {
                try {
                    lockTest.method2(Thread.currentThread());
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }).start();
            new Thread(()-> {
                try {
                    lockTest.method2(Thread.currentThread());
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }).start();
        }
        long end = System.currentTimeMillis();
        System.err.println("结束时间-->" + (end - start));
    }
}
