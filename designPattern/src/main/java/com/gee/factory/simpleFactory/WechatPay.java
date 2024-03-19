package com.gee.factory.simpleFactory;

/**
 * 简单工厂模式-微信支付
 */
public class WechatPay implements IPay {

    @Override
    public void pay() {
        System.out.println("简单工厂模式-微信支付");
    }
}