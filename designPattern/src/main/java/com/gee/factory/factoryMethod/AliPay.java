package com.gee.factory.factoryMethod;

/**
 * 工厂方法模式-支付宝支付
 */
public class AliPay implements IPay {

    @Override
    public void pay() {
        System.out.println("工厂方法模式-支付宝支付");
    }
}