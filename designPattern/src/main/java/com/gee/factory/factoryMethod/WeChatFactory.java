package com.gee.factory.factoryMethod;

/**
 * 工厂方法模式-微信支付工厂
 */
public class WeChatFactory implements IPayFactory {

    // 创建微信支付
    @Override
    public IPay createPay() {
        return new WechatPay();
    }
}