package com.observer.v1;

public class HanFeiZi implements IHanFeiZi {
    private boolean isHavingBreakfast = false;
    private boolean isHavingFun = false;

    @Override
    public void haveBreakfast() {
        System.out.println("HanFeiZi Start Eating");
        this.isHavingBreakfast = true;
    }

    @Override
    public void haveFun() {
        System.out.println("HanFeiZi Start Having Fun");
        this.isHavingFun = true;
    }

    public boolean isHavingBreakfast() {
        return isHavingBreakfast;
    }

    public void setHavingBreakfast(boolean havingBreakfast) {
        isHavingBreakfast = havingBreakfast;
    }

    public boolean isHavingFun() {
        return isHavingFun;
    }

    public void setHavingFun(boolean havingFun) {
        isHavingFun = havingFun;
    }


}
