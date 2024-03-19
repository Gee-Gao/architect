package com.gee.factory.abstractFactory;

/**
 * 抽象工厂模式-测试类
 */
public class AbstractFactoryTest {

    public static void main(String[] args) {
        // 创建一个支付宝工厂
        AbstractPayFactory aliPayFactory = AbstractPayFactory.getAbstractPayFactory(AliPayFactory.class);
        // 获取支付宝进行支付
        IPay aliPay = aliPayFactory.createPay();
        aliPay.pay();
        // 获取支付宝进行退款
        IBackPay aliBackPay = aliPayFactory.creatBackPay();
        aliBackPay.backPay();

        // 创建一个微信工厂
        AbstractPayFactory wechatFactory = AbstractPayFactory.getAbstractPayFactory(WechatFactory.class);
        // 获取微信进行支付
        IPay wechatPay = wechatFactory.createPay();
        wechatPay.pay();
        // 获取微信进行退款
        IBackPay wechatBackPay = wechatFactory.creatBackPay();
        wechatBackPay.backPay();
    }
}