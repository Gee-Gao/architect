package com.gee.factory.abstractFactory;

/**
 * 抽象工厂模式-微信支付
 */
public class WechatPay implements IPay {

    @Override
    public void pay() {
        System.out.println("抽象工厂模式-微信支付");
    }
}