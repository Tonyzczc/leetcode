package com.proxy.strategy.starategyInterface;

import com.proxy.strategy.Strategy;

/**
 * @Author:Zhangchi
 * @date:2021-09-09 5:12 下午
 **/
public class BasicVIP implements Strategy {
    @Override
    public void strategyInterface() {
        System.out.println("BasicVIP");
    }
}
