package com.observer.v1;

public class Client {
    public static void main(String[] args) throws InterruptedException {
        LiSi liSi = new LiSi();
        HanFeiZi hanFeiZi = new HanFeiZi();
        Spy spyBreakfast = new Spy(hanFeiZi,liSi,"breakfast");
        spyBreakfast.start();
        Spy spyFun = new Spy(hanFeiZi,liSi,"fun");
        spyFun.start();
        Thread.sleep(5000);
        hanFeiZi.haveBreakfast();
        Thread.sleep(5000);
        hanFeiZi.haveFun();
    }
}
