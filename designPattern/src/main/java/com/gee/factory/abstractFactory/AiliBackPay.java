package com.gee.factory.abstractFactory;

/**
 * 抽象工厂模式-支付宝退款
 */
public class AiliBackPay implements IBackPay {

    @Override
    public void backPay() {
        System.out.println("抽象工厂模式-支付宝退款");
    }
}