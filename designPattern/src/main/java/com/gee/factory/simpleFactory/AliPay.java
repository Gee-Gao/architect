package com.gee.factory.simpleFactory;

/**
 * 简单工厂模式-支付宝支付
 */
public class AliPay implements IPay {

    @Override
    public void pay() {
        System.out.println("简单工厂模式-支付宝支付");
    }
}