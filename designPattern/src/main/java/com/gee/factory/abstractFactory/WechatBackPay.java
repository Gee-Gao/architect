package com.gee.factory.abstractFactory;

/**
 * 抽象工厂模式-微信退款
 */
public class WechatBackPay implements IBackPay {

    @Override
    public void backPay() {
        System.out.println("抽象工厂模式-微信退款");
    }
}