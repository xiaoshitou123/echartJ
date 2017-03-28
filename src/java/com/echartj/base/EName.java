/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.echartj.base;

import com.echartj.component.ETextStyle;

/**
 *
 * @author 小黑
 */
public class EName extends EBase{
    private String formatter ;
    private ETextStyle textStyle;

    public String getFormatter() {
        return formatter;
    }

    public void setFormatter(String formatter) {
        this.formatter = formatter;
    }

    public ETextStyle getTextStyle() {
        return textStyle;
    }

    public void setTextStyle(ETextStyle textStyle) {
        this.textStyle = textStyle;
    }
    
}
