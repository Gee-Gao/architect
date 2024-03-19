package com.gee.factory.abstractFactory;

/**
 * 抽象工厂模式-微信工厂
 */
public class WechatFactory extends AbstractPayFactory {

    // 创建微信支付
    @Override
    public IPay createPay() {
        super.init();
        return new WechatPay();
    }

    // 创建微信退款
    @Override
    public IBackPay creatBackPay() {
        super.init();
        return new WechatBackPay();
    }
}