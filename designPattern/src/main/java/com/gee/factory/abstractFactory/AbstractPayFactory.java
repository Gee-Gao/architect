package com.gee.factory.abstractFactory;

/**
 * 抽象工厂模式-支付工厂
 */
public abstract class AbstractPayFactory {

    // 获取一个抽象工厂
    public static AbstractPayFactory getAbstractPayFactory(Class<? extends AbstractPayFactory> className) {
        try {
            return className.newInstance();
        } catch (InstantiationException | IllegalAccessException e) {
            throw new RuntimeException(e);
        }
    }

    // 初始化基础数据
    public void init() {
        System.out.println("初始化基础数据");
    }

    // 创建支付
    public abstract IPay createPay();

    // 创建退款
    public abstract IBackPay creatBackPay();
}
