/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.echartj.component;

import com.echartj.base.EData;
import com.echartj.base.EName;
import com.echartj.base.axis.EAxisLabel;
import com.echartj.base.axis.EAxisLine;
import com.echartj.base.axis.EAxisTick;
import com.echartj.base.axis.ESplitArea;
import com.echartj.base.axis.ESplitLine;
import java.util.List;

/**
 *
 * @author 小黑
 */
public class ERadar {

    private EAxisLine axisLine;
    private EAxisTick axisTick;
    private EAxisLabel axisLabel;
    private ESplitLine splitLine;
    private ESplitArea splitArea;
    private List<EData> data;

    private Integer zlevel;
    private Integer z;
    List<String> center;
    private Integer startAngle;
    private String radius;
    private EName name;
    private Integer nameGap;
    private Integer splitNumber;
    private Boolean scale;
    private Boolean silent;
    private Boolean triggerEvent;
    /**
     * 'polygon' 和 'circle'
     */
    private String shape;

    private List<String> indicator;

    public EAxisLine getAxisLine() {
        return axisLine;
    }

    public void setAxisLine(EAxisLine axisLine) {
        this.axisLine = axisLine;
    }

    public EAxisTick getAxisTick() {
        return axisTick;
    }

    public void setAxisTick(EAxisTick axisTick) {
        this.axisTick = axisTick;
    }

    public EAxisLabel getAxisLabel() {
        return axisLabel;
    }

    public void setAxisLabel(EAxisLabel axisLabel) {
        this.axisLabel = axisLabel;
    }

    public ESplitLine getSplitLine() {
        return splitLine;
    }

    public void setSplitLine(ESplitLine splitLine) {
        this.splitLine = splitLine;
    }

    public ESplitArea getSplitArea() {
        return splitArea;
    }

    public void setSplitArea(ESplitArea splitArea) {
        this.splitArea = splitArea;
    }

    public List<EData> getData() {
        return data;
    }

    public void setData(List<EData> data) {
        this.data = data;
    }

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

    public List<String> getCenter() {
        return center;
    }

    public void setCenter(List<String> center) {
        this.center = center;
    }

    public Integer getStartAngle() {
        return startAngle;
    }

    public void setStartAngle(Integer startAngle) {
        this.startAngle = startAngle;
    }

    public String getRadius() {
        return radius;
    }

    public void setRadius(String radius) {
        this.radius = radius;
    }

    public EName getName() {
        return name;
    }

    public void setName(EName name) {
        this.name = name;
    }

    public Integer getNameGap() {
        return nameGap;
    }

    public void setNameGap(Integer nameGap) {
        this.nameGap = nameGap;
    }

    public Integer getSplitNumber() {
        return splitNumber;
    }

    public void setSplitNumber(Integer splitNumber) {
        this.splitNumber = splitNumber;
    }

    public Boolean isScale() {
        return scale;
    }

    public void setScale(Boolean scale) {
        this.scale = scale;
    }

    public Boolean isSilent() {
        return silent;
    }

    public void setSilent(Boolean silent) {
        this.silent = silent;
    }

    public Boolean isTriggerEvent() {
        return triggerEvent;
    }

    public void setTriggerEvent(Boolean triggerEvent) {
        this.triggerEvent = triggerEvent;
    }

    public String getShape() {
        return shape;
    }

    public void setShape(String shape) {
        this.shape = shape;
    }

    public List<String> getIndicator() {
        return indicator;
    }

    public void setIndicator(List<String> indicator) {
        this.indicator = indicator;
    }

}
