package com.gee.factory.factoryMethod;

/**
 * 工厂方法模式-微信支付
 */
public class WechatPay implements IPay {

    @Override
    public void pay() {
        System.out.println("工厂方法模式-微信支付");
    }
}