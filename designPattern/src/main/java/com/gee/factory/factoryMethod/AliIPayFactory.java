package com.gee.factory.factoryMethod;

/**
 * 工厂方法模式-支付宝支付工厂
 */
public class AliIPayFactory implements IPayFactory {

    // 创建支付宝支付
    @Override
    public IPay createPay() {
        return new AliPay();
    }
}