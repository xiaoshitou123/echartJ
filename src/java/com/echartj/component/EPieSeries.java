/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.echartj.component;

import com.echartj.base.ELabel;
import com.echartj.base.ESeries;
import com.echartj.base.feature.ELabelLine;
import com.echartj.base.style.EItemStyle;
import java.util.List;

/**
 *
 * @author 小黑
 */
public class EPieSeries extends ESeries {

    private String selectedMode;
    private String startAngle;
    private String roseType;
    private Integer selectedOffset;
    private Integer minAngle;
    private ELabel label;
    private EItemStyle itemStyle;
    private ELabelLine labelLine;
    private List<String> center;
    private List<String> radius;
    private Boolean silent;
    private Boolean avoidLabelOverlap;
    private Boolean stillShowZeroSum;
    private Boolean clockwise;
    private Boolean hoverAnimation;
    private Integer z;
    private Integer zlevel;
    private Boolean legendHoverLink;

    public String getSelectedMode() {
        return selectedMode;
    }

    public void setSelectedMode(String selectedMode) {
        this.selectedMode = selectedMode;
    }

    public String getStartAngle() {
        return startAngle;
    }

    public void setStartAngle(String startAngle) {
        this.startAngle = startAngle;
    }

    public String getRoseType() {
        return roseType;
    }

    public void setRoseType(String roseType) {
        this.roseType = roseType;
    }

    public Integer getSelectedOffset() {
        return selectedOffset;
    }

    public void setSelectedOffset(Integer selectedOffset) {
        this.selectedOffset = selectedOffset;
    }

    public Integer getMinAngle() {
        return minAngle;
    }

    public void setMinAngle(Integer minAngle) {
        this.minAngle = minAngle;
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

    public ELabelLine getLabelLine() {
        return labelLine;
    }

    public void setLabelLine(ELabelLine labelLine) {
        this.labelLine = labelLine;
    }

    public List<String> getCenter() {
        return center;
    }

    public void setCenter(List<String> center) {
        this.center = center;
    }

    public List<String> getRadius() {
        return radius;
    }

    public void setRadius(List<String> radius) {
        this.radius = radius;
    }

    public Boolean getSilent() {
        return silent;
    }

    public void setSilent(Boolean silent) {
        this.silent = silent;
    }

    public Boolean getAvoidLabelOverlap() {
        return avoidLabelOverlap;
    }

    public void setAvoidLabelOverlap(Boolean avoidLabelOverlap) {
        this.avoidLabelOverlap = avoidLabelOverlap;
    }

    public Boolean getStillShowZeroSum() {
        return stillShowZeroSum;
    }

    public void setStillShowZeroSum(Boolean stillShowZeroSum) {
        this.stillShowZeroSum = stillShowZeroSum;
    }

    public Boolean getClockwise() {
        return clockwise;
    }

    public void setClockwise(Boolean clockwise) {
        this.clockwise = clockwise;
    }

    public Boolean getHoverAnimation() {
        return hoverAnimation;
    }

    public void setHoverAnimation(Boolean hoverAnimation) {
        this.hoverAnimation = hoverAnimation;
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

    public Boolean getLegendHoverLink() {
        return legendHoverLink;
    }

    public void setLegendHoverLink(Boolean legendHoverLink) {
        this.legendHoverLink = legendHoverLink;
    }

}
