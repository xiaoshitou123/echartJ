/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.echartj.base.axis;

import com.echartj.base.style.EAreaStyle;
import com.echartj.base.EBase;

/**
 *
 * @author 小黑
 */
public class ESplitArea extends EBase {

    private String interval;
    private EAreaStyle areaStyle;

    public String getInterval() {
        return interval;
    }

    public void setInterval(String interval) {
        this.interval = interval;
    }

    public EAreaStyle getAreaStyle() {
        return areaStyle;
    }

    public void setAreaStyle(EAreaStyle areaStyle) {
        this.areaStyle = areaStyle;
    }

}
