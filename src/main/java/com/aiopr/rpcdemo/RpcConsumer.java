package com.aiopr.rpcdemo;

public class RpcConsumer {

    public static void main(String[] args) throws Exception {
        TestService service = RpcFramework.refer(TestService.class, "127.0.0.1", 1234);
        for (int i = 0; i < Integer.MAX_VALUE; i ++) {
            String hello = service.test();
            System.out.println(hello);
            Thread.sleep(1000);
        }
    }

}

