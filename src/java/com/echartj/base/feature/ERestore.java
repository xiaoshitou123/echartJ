/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.echartj.base.feature;

import com.echartj.base.EBase;
import com.echartj.base.style.EIconStyle;

/**
 *
 * @author 小黑
 */
public class ERestore extends EBase {

    private Boolean title;
    private String icon;
    private EIconStyle iconStyle;

    public Boolean getTitle() {
        return title;
    }

    public void setTitle(Boolean title) {
        this.title = title;
    }

    public String getIcon() {
        return icon;
    }

    public void setIcon(String icon) {
        this.icon = icon;
    }

    public EIconStyle getIconStyle() {
        return iconStyle;
    }

    public void setIconStyle(EIconStyle iconStyle) {
        this.iconStyle = iconStyle;
    }

}
