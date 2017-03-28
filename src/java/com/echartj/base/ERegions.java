/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.echartj.base;

import com.echartj.base.style.EItemStyle;

/**
 *
 * @author 小黑
 */
public class ERegions {

    private String name;
    private Boolean selected;
    private EItemStyle itemStyle;
    private ELabel label;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Boolean getSelected() {
        return selected;
    }

    public void setSelected(Boolean selected) {
        this.selected = selected;
    }

    public EItemStyle getItemStyle() {
        return itemStyle;
    }

    public void setItemStyle(EItemStyle itemStyle) {
        this.itemStyle = itemStyle;
    }

    public ELabel getLabel() {
        return label;
    }

    public void setLabel(ELabel label) {
        this.label = label;
    }

}
