package com.observer.v2;

import com.observer.v1.IHanFeiZi;
import com.observer.v1.ILiSi;
import com.observer.v1.LiSi;

public class HanFeiZi implements IHanFeiZi {
    private ILiSi lisi = new LiSi();

    @Override
    public void haveBreakfast() {
        System.out.println("HanFeiZi Start Eating");
        this.lisi.update("HanFeiZi is having breakfast");
    }

    @Override
    public void haveFun() {
        System.out.println("HanFeiZi Start Fun");
        this.lisi.update("HanFeiZi is having fun");
    }
}
