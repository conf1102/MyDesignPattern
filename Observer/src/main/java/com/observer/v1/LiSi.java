package com.observer.v1;

public class LiSi implements ILiSi {

    @Override
    public void update(String context) {
        System.out.println("LiSi:Watched the activity from HanFeiZi, Start to report to Boss");
        this.reportToQinShiHuang(context);
        System.out.println("LiSi:Report Complete");
    }

    private void reportToQinShiHuang(String reportContext) {
        System.out.println("LiSi:Report,Boss Qin! There is activity from HanFeiZi --->" + reportContext);
    }
}
