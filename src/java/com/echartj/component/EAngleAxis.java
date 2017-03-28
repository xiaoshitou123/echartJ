/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.echartj.component;

import com.echartj.base.EData;
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
public class EAngleAxis {

    private Integer polarIndex;
    private Integer startAngle;
    private Boolean clockwise;
    private String boundaryGap;

    private Integer splitNumber;
    private Integer minInterval;
    private Integer interval;
    private Integer logBase;
    /**
     * 'value' 'category' 'time' 'log'
     */
    private String type;

    private Boolean scale;
    private Boolean silent;
    private Boolean triggerEvent;
    private String min;
    private String max;

    private EAxisLine axisLine;
    private EAxisTick axisTick;
    private EAxisLabel axisLabel;
    private ESplitLine splitLine;
    private ESplitArea splitArea;
    private List<EData> data;
    private Integer zlevel;
    private Integer z;

    public Integer getPolarIndex() {
        return polarIndex;
    }

    public void setPolarIndex(Integer polarIndex) {
        this.polarIndex = polarIndex;
    }

    public Integer getSplitNumber() {
        return splitNumber;
    }

    public void setSplitNumber(Integer splitNumber) {
        this.splitNumber = splitNumber;
    }

    public Integer getMinInterval() {
        return minInterval;
    }

    public void setMinInterval(Integer minInterval) {
        this.minInterval = minInterval;
    }

    public Integer getInterval() {
        return interval;
    }

    public void setInterval(Integer interval) {
        this.interval = interval;
    }

    public Integer getLogBase() {
        return logBase;
    }

    public void setLogBase(Integer logBase) {
        this.logBase = logBase;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public Integer getStartAngle() {
        return startAngle;
    }

    public void setStartAngle(Integer startAngle) {
        this.startAngle = startAngle;
    }

    public Boolean isClockwise() {
        return clockwise;
    }

    public void setClockwise(Boolean clockwise) {
        this.clockwise = clockwise;
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

    public String getBoundaryGap() {
        return boundaryGap;
    }

    public void setBoundaryGap(String boundaryGap) {
        this.boundaryGap = boundaryGap;
    }

    public String getMin() {
        return min;
    }

    public void setMin(String min) {
        this.min = min;
    }

    public String getMax() {
        return max;
    }

    public void setMax(String max) {
        this.max = max;
    }

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

}
