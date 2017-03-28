/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.echartj.component;

import com.echartj.base.feature.EFeature;
import com.echartj.base.style.EIconStyle;
import com.echartj.base.Eposition;

/**
 *
 * @author 小黑
 */
public class EToolbox extends Eposition {

    private Integer zlevel;
    private Integer z;
    private Integer itemGap;
    private Integer itemSize;
    private String width;
    private String height;
    private Boolean showTitle;
    private String orient;
    private EFeature feature ;
    private EIconStyle  iconStyle ;

    public Integer getZlevel() {
        return zlevel;
    }

    public void setZlevel(Integer zlevel) {
        this.zlevel = zlevel;
    }

    public Integer getZ() {
        return z;
    }

    public void setZ(Integer z) {
        this.z = z;
    }

    public Integer getItemGap() {
        return itemGap;
    }

    public void setItemGap(Integer itemGap) {
        this.itemGap = itemGap;
    }

    public Integer getItemSize() {
        return itemSize;
    }

    public void setItemSize(Integer itemSize) {
        this.itemSize = itemSize;
    }

    public String getWidth() {
        return width;
    }

    public void setWidth(String width) {
        this.width = width;
    }

    public String getHeight() {
        return height;
    }

    public void setHeight(String height) {
        this.height = height;
    }

    public Boolean getShowTitle() {
        return showTitle;
    }

    public void setShowTitle(Boolean showTitle) {
        this.showTitle = showTitle;
    }

    public String getOrient() {
        return orient;
    }

    public void setOrient(String orient) {
        this.orient = orient;
    }

    public EFeature getFeature() {
        return feature;
    }

    public void setFeature(EFeature feature) {
        this.feature = feature;
    }

    public EIconStyle getIconStyle() {
        return iconStyle;
    }

    public void setIconStyle(EIconStyle iconStyle) {
        this.iconStyle = iconStyle;
    }
    

}
