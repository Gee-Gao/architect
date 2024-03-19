package com.gee.factory.factoryMethod;

/**
 * 工厂方法模式-测试类
 */
public class FactoryMethodTest {

    public static void main(String[] args) {
        // 初始化一个支付宝工厂
        IPayFactory aliIPayFactory = new AliIPayFactory();
        // 获取支付宝进行支付
        IPay aliPay = aliIPayFactory.createPay();
        aliPay.pay();

        // 初始化一个微信工厂
        IPayFactory wechatIPayFactory = new WeChatFactory();
        // 获取微信进行支付
        IPay wechatPay = wechatIPayFactory.createPay();
        wechatPay.pay();
    }
}
