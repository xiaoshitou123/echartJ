/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.echartj.component;

import com.echartj.base.ERange;
import com.echartj.base.style.EBrushStyle;
import java.util.List;

/**
 *
 * @author 小黑
 */
public class EBrush {

    private List<String> toolbox;
    private String brushLink;
    /**
     * 'all': 所有 series 'Array': series index 列表 'number': 某个 series index
     */
    private String seriesIndex;
    private String geoIndex;
    private String xAxisIndex;
    private String yAxisIndex;
    private String brushType;
    /**
     * 'single'：单选。 'multiple'：多选。
     */
    private String brushMode;
    private Boolean transformable;
    private EBrushStyle brushStyle;
    private String throttleType;
    private Integer throttleDelay;
    private String removeOnClick;
    private ERange inBrush;
    private ERange outOfBrush;

    public List<String> getToolbox() {
        return toolbox;
    }

    public void setToolbox(List<String> toolbox) {
        this.toolbox = toolbox;
    }

    public String getBrushLink() {
        return brushLink;
    }

    public void setBrushLink(String brushLink) {
        this.brushLink = brushLink;
    }

    public String getSeriesIndex() {
        return seriesIndex;
    }

    public void setSeriesIndex(String seriesIndex) {
        this.seriesIndex = seriesIndex;
    }

    public String getGeoIndex() {
        return geoIndex;
    }

    public void setGeoIndex(String geoIndex) {
        this.geoIndex = geoIndex;
    }

    public String getxAxisIndex() {
        return xAxisIndex;
    }

    public void setxAxisIndex(String xAxisIndex) {
        this.xAxisIndex = xAxisIndex;
    }

    public String getyAxisIndex() {
        return yAxisIndex;
    }

    public void setyAxisIndex(String yAxisIndex) {
        this.yAxisIndex = yAxisIndex;
    }

    public String getBrushType() {
        return brushType;
    }

    public void setBrushType(String brushType) {
        this.brushType = brushType;
    }

    public String getBrushMode() {
        return brushMode;
    }

    public void setBrushMode(String brushMode) {
        this.brushMode = brushMode;
    }

    public Boolean getTransformable() {
        return transformable;
    }

    public void setTransformable(Boolean transformable) {
        this.transformable = transformable;
    }

    public EBrushStyle getBrushStyle() {
        return brushStyle;
    }

    public void setBrushStyle(EBrushStyle brushStyle) {
        this.brushStyle = brushStyle;
    }

    public String getThrottleType() {
        return throttleType;
    }

    public void setThrottleType(String throttleType) {
        this.throttleType = throttleType;
    }

    public Integer getThrottleDelay() {
        return throttleDelay;
    }

    public void setThrottleDelay(Integer throttleDelay) {
        this.throttleDelay = throttleDelay;
    }

    public String getRemoveOnClick() {
        return removeOnClick;
    }

    public void setRemoveOnClick(String removeOnClick) {
        this.removeOnClick = removeOnClick;
    }

    public ERange getInBrush() {
        return inBrush;
    }

    public void setInBrush(ERange inBrush) {
        this.inBrush = inBrush;
    }

    public ERange getOutOfBrush() {
        return outOfBrush;
    }

    public void setOutOfBrush(ERange outOfBrush) {
        this.outOfBrush = outOfBrush;
    }

}
