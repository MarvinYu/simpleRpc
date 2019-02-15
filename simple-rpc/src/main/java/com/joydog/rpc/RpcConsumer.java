/**
 * yinghuo.com Inc.
 * Copyright (c) 2013-2019 All Rights Reserved.
 */
package com.joydog.rpc;

/**
 * 引用服务
 * @author marvinYu
 * @version : RpcConsumer.java, v 0.1 2019-02-15 11:39 Exp $
 */
public class RpcConsumer {
    public static void main(String[] args) throws Exception {

        RpcHelloService service = RpcFramework.refer(RpcHelloService.class, "127.0.0.1", 1234);
        for (int i = 0; i < Integer.MAX_VALUE; i ++) {
            String hello = service.sayHello("World" + i);

            System.out.println(hello);
            Thread.sleep(1000);
        }
    }
}
