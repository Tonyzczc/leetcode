package com.proxy.strategy;

import com.proxy.strategy.starategyInterface.V1VIP;

/**
 * @Author:Zhangchi
 * @date:2021-09-09 5:17 下午
 **/
public class ContextApplication {
    public static void main(String[] args) {
        V1VIP v1VIP = new V1VIP();
        Context v1VIPContext = new Context(v1VIP);
        v1VIPContext.contextInterface();
    }
}
