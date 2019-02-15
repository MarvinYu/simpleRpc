/**
 * yinghuo.com Inc.
 * Copyright (c) 2013-2019 All Rights Reserved.
 */
package com.joydog.rpc;

/**
 * @author marvinYu
 * @version : RpcHelloServiceImpl.java, v 0.1 2019-02-15 11:37 Exp $
 */
public class RpcHelloServiceImpl implements RpcHelloService {
    @Override
    public String sayHello(String name) {
        return "Hello " + name;
    }

}
