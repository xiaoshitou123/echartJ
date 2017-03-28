/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.echartj.component;

import com.echartj.base.*;
import com.echartj.base.style.ECheckpointStyle;
import com.echartj.base.style.EControlStyle;
import com.echartj.base.style.EItemStyle;
import com.echartj.base.style.ELineStyle;
import java.util.List;

/**
 * 提供了在多个 ECharts option 间进行切换、播放等操作的功能。
 *
 * @author 小黑
 */
public class ETimeline extends Esymbol {

    private Integer zlevel;
    private Integer z;
    private String type;
    private String axisType;
    private String controlPosition;
    private Integer currentIndex;
    private Integer playInterval;
    private Boolean autoPlay;
    private Boolean rewind;
    private Boolean loop;
    private Boolean realtime;
    private String padding;
    private String orient;
    private Boolean inverse;
    private ELineStyle lineStyle;
    private ELabel label;
    private EItemStyle itemStyle;
    private ECheckpointStyle checkpointStyle;
    private EControlStyle controlStyle;
    private List<String> data;

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

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getAxisType() {
        return axisType;
    }

    public void setAxisType(String axisType) {
        this.axisType = axisType;
    }

    public String getControlPosition() {
        return controlPosition;
    }

    public void setControlPosition(String controlPosition) {
        this.controlPosition = controlPosition;
    }

    public Integer getCurrentIndex() {
        return currentIndex;
    }

    public void setCurrentIndex(Integer currentIndex) {
        this.currentIndex = currentIndex;
    }

    public Integer getPlayInterval() {
        return playInterval;
    }

    public void setPlayInterval(Integer playInterval) {
        this.playInterval = playInterval;
    }

    public Boolean getAutoPlay() {
        return autoPlay;
    }

    public void setAutoPlay(Boolean autoPlay) {
        this.autoPlay = autoPlay;
    }

    public Boolean getRewind() {
        return rewind;
    }

    public void setRewind(Boolean rewind) {
        this.rewind = rewind;
    }

    public Boolean getLoop() {
        return loop;
    }

    public void setLoop(Boolean loop) {
        this.loop = loop;
    }

    public Boolean getRealtime() {
        return realtime;
    }

    public void setRealtime(Boolean realtime) {
        this.realtime = realtime;
    }

    public String getPadding() {
        return padding;
    }

    public void setPadding(String padding) {
        this.padding = padding;
    }

    public String getOrient() {
        return orient;
    }

    public void setOrient(String orient) {
        this.orient = orient;
    }

    public Boolean getInverse() {
        return inverse;
    }

    public void setInverse(Boolean inverse) {
        this.inverse = inverse;
    }

    public ELineStyle getLineStyle() {
        return lineStyle;
    }

    public void setLineStyle(ELineStyle lineStyle) {
        this.lineStyle = lineStyle;
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

    public ECheckpointStyle getCheckpointStyle() {
        return checkpointStyle;
    }

    public void setCheckpointStyle(ECheckpointStyle checkpointStyle) {
        this.checkpointStyle = checkpointStyle;
    }

    public EControlStyle getControlStyle() {
        return controlStyle;
    }

    public void setControlStyle(EControlStyle controlStyle) {
        this.controlStyle = controlStyle;
    }

    public List<String> getData() {
        return data;
    }

    public void setData(List<String> data) {
        this.data = data;
    }

}
