package com.aiopr.rpcdemo;

public class RpcProvider {

    public static void main(String[] args) throws Exception {
        TestService service = new TestServiceImpl();
        RpcFramework.export(service, 1234);
    }

}