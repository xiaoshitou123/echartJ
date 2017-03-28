/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.echartj.base;

import com.echartj.base.style.ELineStyle;
import com.echartj.component.ETextStyle;

/**
 *
 * @author 小黑
 */
public class ENormalAemphasisLabel extends EBase {

    private Integer length;
    private Integer length2;
    private String smooth;
    private ETextStyle textStyle;
    private ELineStyle lineStyle;

    public Integer getLength() {
        return length;
    }

    public void setLength(Integer length) {
        this.length = length;
    }

    public Integer getLength2() {
        return length2;
    }

    public void setLength2(Integer length2) {
        this.length2 = length2;
    }

    public String getSmooth() {
        return smooth;
    }

    public void setSmooth(String smooth) {
        this.smooth = smooth;
    }

    public ELineStyle getLineStyle() {
        return lineStyle;
    }

    public void setLineStyle(ELineStyle lineStyle) {
        this.lineStyle = lineStyle;
    }

    public ETextStyle getTextStyle() {
        return textStyle;
    }

    public void setTextStyle(ETextStyle textStyle) {
        this.textStyle = textStyle;
    }

}
