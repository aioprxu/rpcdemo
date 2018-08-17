package com.aiopr.rpcdemo;

public class TestServiceImpl implements TestService {
    @Override
    public String test() {
        return "hello world";
    }
}
