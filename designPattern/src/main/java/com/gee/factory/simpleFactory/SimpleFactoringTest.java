package com.gee.factory.simpleFactory;

/**
 * 简单工厂模式-测试类
 */
public class SimpleFactoringTest {

    public static void main(String[] args) {
        // 初始化一个支付工厂
        PaySimpleFactory paySimpleFactory = new PaySimpleFactory();

        // 获取支付宝进行支付
        IPay aliPay = paySimpleFactory.createPay(AliPay.class);
        aliPay.pay();

        // 获取微信进行支付
        IPay wechatPay = paySimpleFactory.createPay(WechatPay.class);
        wechatPay.pay();
    }
}