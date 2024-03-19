package com.gee.factory.abstractFactory;

/**
 * 抽象工厂模式-支付宝支付
 */
public class AliPay implements IPay {

    @Override
    public void pay() {
        System.out.println("抽象工厂模式-支付宝支付");
    }
}