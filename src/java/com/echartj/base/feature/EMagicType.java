/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.echartj.base.feature;

import com.echartj.base.EBase;
import com.echartj.base.style.EIconStyle;
import java.util.List;

/**
 * not include 【option 、seriesIndex】
 *
 * @author 小黑
 */
public class EMagicType extends EBase {

    private List<String> type;
    private EIconStyle iconStyle;
    private EMagicTypeTitleAndIcon title;
    private EMagicTypeTitleAndIcon icon;

    public List<String> getType() {
        return type;
    }

    public void setType(List<String> type) {
        this.type = type;
    }

    public EIconStyle getIconStyle() {
        return iconStyle;
    }

    public void setIconStyle(EIconStyle iconStyle) {
        this.iconStyle = iconStyle;
    }

    public EMagicTypeTitleAndIcon getTitle() {
        return title;
    }

    public void setTitle(EMagicTypeTitleAndIcon title) {
        this.title = title;
    }

    public EMagicTypeTitleAndIcon getIcon() {
        return icon;
    }

    public void setIcon(EMagicTypeTitleAndIcon icon) {
        this.icon = icon;
    }

}
