/**
 * yinghuo.com Inc.
 * Copyright (c) 2013-2019 All Rights Reserved.
 */
package com.joydog.rpc;

/**
 * 暴露服务
 * @author marvinYu
 * @version : RpcProvider.java, v 0.1 2019-02-15 11:38 Exp $
 */
public class RpcProvider {
    public static void main(String[] args) throws Exception {
        RpcHelloService service = new RpcHelloServiceImpl();
        RpcFramework.export(service, 1234);
    }
}
