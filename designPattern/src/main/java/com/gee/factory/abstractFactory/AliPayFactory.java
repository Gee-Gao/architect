package com.gee.factory.abstractFactory;

/**
 * 抽象工厂模式-支付宝工厂
 */
public class AliPayFactory extends AbstractPayFactory {

    // 创建支付宝付款
    @Override
    public IPay createPay() {
        super.init();
        return new AliPay();
    }

    // 创建支付宝退款
    @Override
    public IBackPay creatBackPay() {
        super.init();
        return new AiliBackPay();
    }
}