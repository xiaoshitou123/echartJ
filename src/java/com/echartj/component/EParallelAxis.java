/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.echartj.component;

import com.echartj.base.*;
import com.echartj.base.axis.EAxisLabel;
import com.echartj.base.axis.EAxisLine;
import com.echartj.base.axis.EAxisTick;
import com.echartj.base.style.EAreaSelectStyle;
import java.util.List;

/**
 * 这个组件是平行坐标系中的坐标轴。
 *
 * @author 小黑
 */
public class EParallelAxis {

    private Integer dim;
    private Integer parallelIndex;
    private Boolean realtime;
    private EAreaSelectStyle areaSelectStyle;
    private String type;
    private String name;
    private String nameLocation;
    private ETextStyle nameTextStyle;
    private Integer nameGap;
    private Integer namnameRotate;
    private Boolean inverse;
    private String boundaryGap;
    private String min;
    private String max;
    private Integer splitNumber;
    private Integer minInterval;
    private Integer interval;
    private Integer logBase;
    private Boolean scale;
    private Boolean silent;
    private Boolean triggerEvent;
    private EAxisLine axisLine;
    private EAxisTick axisTick;
    private EAxisLabel axisLabel;
    private List<EData> data;

    public Integer getDim() {
        return dim;
    }

    public void setDim(Integer dim) {
        this.dim = dim;
    }

    public Integer getParallelIndex() {
        return parallelIndex;
    }

    public void setParallelIndex(Integer parallelIndex) {
        this.parallelIndex = parallelIndex;
    }

    public Boolean getRealtime() {
        return realtime;
    }

    public void setRealtime(Boolean realtime) {
        this.realtime = realtime;
    }

    public EAreaSelectStyle getAreaSelectStyle() {
        return areaSelectStyle;
    }

    public void setAreaSelectStyle(EAreaSelectStyle areaSelectStyle) {
        this.areaSelectStyle = areaSelectStyle;
    }

    
    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getNameLocation() {
        return nameLocation;
    }

    public void setNameLocation(String nameLocation) {
        this.nameLocation = nameLocation;
    }

    public ETextStyle getNameTextStyle() {
        return nameTextStyle;
    }

    public void setNameTextStyle(ETextStyle nameTextStyle) {
        this.nameTextStyle = nameTextStyle;
    }

    public Integer getNameGap() {
        return nameGap;
    }

    public void setNameGap(Integer nameGap) {
        this.nameGap = nameGap;
    }

    public Integer getNamnameRotate() {
        return namnameRotate;
    }

    public void setNamnameRotate(Integer namnameRotate) {
        this.namnameRotate = namnameRotate;
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

    public Boolean getInverse() {
        return inverse;
    }

    public void setInverse(Boolean inverse) {
        this.inverse = inverse;
    }

    public Boolean getScale() {
        return scale;
    }

    public void setScale(Boolean scale) {
        this.scale = scale;
    }

    public Boolean getSilent() {
        return silent;
    }

    public void setSilent(Boolean silent) {
        this.silent = silent;
    }

    public Boolean getTriggerEvent() {
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

    public List<EData> getData() {
        return data;
    }

    public void setData(List<EData> data) {
        this.data = data;
    }

}
