/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.echartj.base.axis;

import com.echartj.base.EBase;
import com.echartj.component.ETextStyle;

/**
 *
 * @author 小黑
 */
public class EAxisLabel extends EBase {

    private String interval;
    private String formatter;
    private Boolean inside;
    private Integer rotate;
    private Integer margin;
    private ETextStyle textStyle;

    public String getInterval() {
        return interval;
    }

    public void setInterval(String interval) {
        this.interval = interval;
    }

    public String getFormatter() {
        return formatter;
    }

    public void setFormatter(String formatter) {
        this.formatter = formatter;
    }

    public Boolean isInside() {
        return inside;
    }

    public void setInside(Boolean inside) {
        this.inside = inside;
    }

    public Integer getRotate() {
        return rotate;
    }

    public void setRotate(Integer rotate) {
        this.rotate = rotate;
    }

    public Integer getMargin() {
        return margin;
    }

    public void setMargin(Integer margin) {
        this.margin = margin;
    }

    public ETextStyle getTextStyle() {
        return textStyle;
    }

    public void setTextStyle(ETextStyle textStyle) {
        this.textStyle = textStyle;
    }

}
