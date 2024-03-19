package com.gee.factory.simpleFactory;

/**
 * 简单工厂模式-支付工厂
 */
public class PaySimpleFactory {

    //根据类名创建一个工厂
    IPay createPay(Class<? extends IPay> className) {
        // 根据传递的值获取对应的实例
        try {
            return className.newInstance();
        } catch (InstantiationException | IllegalAccessException e) {
            throw new RuntimeException(e);
        }
    }
}