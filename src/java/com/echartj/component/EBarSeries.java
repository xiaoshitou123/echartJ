/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.echartj.component;

import com.echartj.base.ELabel;
import com.echartj.base.ESeries;
import com.echartj.base.style.EItemStyle;

/**
 *
 * @author 小黑
 */
public class EBarSeries extends ESeries {

    private String coordinateSystem;
    private String stack;
    private Integer xAxisIndex;
    private Integer yAxisIndex;
    private ELabel label;
    private EItemStyle itemStyle;
    private Boolean silent;
    private Integer z;
    private Integer zlevel;
    private String barWidth;
    private String barMaxWidth;
    private Integer barMinHeight;
    private String barGap;
    private String barCategoryGap;
    private Boolean legendHoverLink;

    public String getCoordinateSystem() {
        return coordinateSystem;
    }

    public void setCoordinateSystem(String coordinateSystem) {
        this.coordinateSystem = coordinateSystem;
    }

    public String getStack() {
        return stack;
    }

    public void setStack(String stack) {
        this.stack = stack;
    }

    public Integer getxAxisIndex() {
        return xAxisIndex;
    }

    public void setxAxisIndex(Integer xAxisIndex) {
        this.xAxisIndex = xAxisIndex;
    }

    public Integer getyAxisIndex() {
        return yAxisIndex;
    }

    public void setyAxisIndex(Integer yAxisIndex) {
        this.yAxisIndex = yAxisIndex;
    }

    public ELabel getLabel() {
        return label;
    }

    public void setLabel(ELabel label) {
        this.label = label;
    }

    public EItemStyle getItemStyle() {
        return itemStyle;
    }

    public void setItemStyle(EItemStyle itemStyle) {
        this.itemStyle = itemStyle;
    }

    public Boolean getSilent() {
        return silent;
    }

    public void setSilent(Boolean silent) {
        this.silent = silent;
    }

    public Integer getZ() {
        return z;
    }

    public void setZ(Integer z) {
        this.z = z;
    }

    public Integer getZlevel() {
        return zlevel;
    }

    public void setZlevel(Integer zlevel) {
        this.zlevel = zlevel;
    }

    public String getBarWidth() {
        return barWidth;
    }

    public void setBarWidth(String barWidth) {
        this.barWidth = barWidth;
    }

    public String getBarMaxWidth() {
        return barMaxWidth;
    }

    public void setBarMaxWidth(String barMaxWidth) {
        this.barMaxWidth = barMaxWidth;
    }

    public Integer getBarMinHeight() {
        return barMinHeight;
    }

    public void setBarMinHeight(Integer barMinHeight) {
        this.barMinHeight = barMinHeight;
    }

    public String getBarGap() {
        return barGap;
    }

    public void setBarGap(String barGap) {
        this.barGap = barGap;
    }

    public String getBarCategoryGap() {
        return barCategoryGap;
    }

    public void setBarCategoryGap(String barCategoryGap) {
        this.barCategoryGap = barCategoryGap;
    }

    public Boolean getLegendHoverLink() {
        return legendHoverLink;
    }

    public void setLegendHoverLink(Boolean legendHoverLink) {
        this.legendHoverLink = legendHoverLink;
    }

}
