package com.gee.factory.factoryMethod;

/**
 * 工厂方法模式-支付工厂
 */
public interface IPayFactory {

    // 创建一个支付
    IPay createPay();
}