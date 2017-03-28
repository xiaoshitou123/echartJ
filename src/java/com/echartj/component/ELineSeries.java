/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.echartj.component;

import com.echartj.base.ELabel;
import com.echartj.base.ESeries;
import com.echartj.base.style.EAreaStyle;
import com.echartj.base.style.EItemStyle;
import com.echartj.base.style.ELineStyle;
import java.util.List;

/**
 * 
 * @author 小黑
 */
public class ELineSeries extends ESeries {

    private String coordinateSystem;
    private String symbol;
    private String symbolSize;
    private Integer symbolRotate;
    private List<String> symbolOffset;
    private Boolean showSymbol;
    private Boolean showAllSymbol;
    private Boolean hoverAnimation;
    private Boolean legendHoverLink;
    private Boolean connectNulls;
    private Boolean clipOverflow;
    private String stack;
    private String step;
    private Integer xAxisIndex;
    private Integer yAxisIndex;
    private Integer polarIndex;
    private ELabel label;
    private EItemStyle itemStyle;
    private ELineStyle lineStyle;
    private EAreaStyle areaStyle;
    private Boolean smooth;
    private Boolean silent;
    private String smoothMonotone;
    private String sampling;
    private Integer z;
    private Integer zlevel;

    public String getCoordinateSystem() {
        return coordinateSystem;
    }

    public void setCoordinateSystem(String coordinateSystem) {
        this.coordinateSystem = coordinateSystem;
    }

    public String getSymbol() {
        return symbol;
    }

    public void setSymbol(String symbol) {
        this.symbol = symbol;
    }

    public String getSymbolSize() {
        return symbolSize;
    }

    public void setSymbolSize(String symbolSize) {
        this.symbolSize = symbolSize;
    }

    public Integer getSymbolRotate() {
        return symbolRotate;
    }

    public void setSymbolRotate(Integer symbolRotate) {
        this.symbolRotate = symbolRotate;
    }

    public List<String> getSymbolOffset() {
        return symbolOffset;
    }

    public void setSymbolOffset(List<String> symbolOffset) {
        this.symbolOffset = symbolOffset;
    }

    public Boolean getShowSymbol() {
        return showSymbol;
    }

    public void setShowSymbol(Boolean showSymbol) {
        this.showSymbol = showSymbol;
    }

    public Boolean getShowAllSymbol() {
        return showAllSymbol;
    }

    public void setShowAllSymbol(Boolean showAllSymbol) {
        this.showAllSymbol = showAllSymbol;
    }

    public Boolean getHoverAnimation() {
        return hoverAnimation;
    }

    public void setHoverAnimation(Boolean hoverAnimation) {
        this.hoverAnimation = hoverAnimation;
    }

    public Boolean getLegendHoverLink() {
        return legendHoverLink;
    }

    public void setLegendHoverLink(Boolean legendHoverLink) {
        this.legendHoverLink = legendHoverLink;
    }

    public Boolean getConnectNulls() {
        return connectNulls;
    }

    public void setConnectNulls(Boolean connectNulls) {
        this.connectNulls = connectNulls;
    }

    public Boolean getClipOverflow() {
        return clipOverflow;
    }

    public void setClipOverflow(Boolean clipOverflow) {
        this.clipOverflow = clipOverflow;
    }

    public String getStack() {
        return stack;
    }

    public void setStack(String stack) {
        this.stack = stack;
    }

    public String getStep() {
        return step;
    }

    public void setStep(String step) {
        this.step = step;
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

    public Integer getPolarIndex() {
        return polarIndex;
    }

    public void setPolarIndex(Integer polarIndex) {
        this.polarIndex = polarIndex;
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

    public ELineStyle getLineStyle() {
        return lineStyle;
    }

    public void setLineStyle(ELineStyle lineStyle) {
        this.lineStyle = lineStyle;
    }

    public EAreaStyle getAreaStyle() {
        return areaStyle;
    }

    public void setAreaStyle(EAreaStyle areaStyle) {
        this.areaStyle = areaStyle;
    }

    public Boolean getSmooth() {
        return smooth;
    }

    public void setSmooth(Boolean smooth) {
        this.smooth = smooth;
    }

    public Boolean getSilent() {
        return silent;
    }

    public void setSilent(Boolean silent) {
        this.silent = silent;
    }

    public String getSmoothMonotone() {
        return smoothMonotone;
    }

    public void setSmoothMonotone(String smoothMonotone) {
        this.smoothMonotone = smoothMonotone;
    }

    public String getSampling() {
        return sampling;
    }

    public void setSampling(String sampling) {
        this.sampling = sampling;
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

}
