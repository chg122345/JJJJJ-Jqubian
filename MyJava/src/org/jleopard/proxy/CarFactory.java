package org.jleopard.proxy;

/**
 * @Copyright (c) 2018, Chen_9g 陈刚 (80588183@qq.com).
 * @DateTime 2018-09-10  下午11:04
 *
 * <p>
 * 众里寻他千百度，蓦然回首，那人却在，灯火阑珊处。
 * Find a way for success and not make excuses for failure.
 * </p>
 */
public class CarFactory implements Factory {
    @Override
    public String provide() {

        System.out.println("汽车工厂");
        return "生成汽车";
    }
}
