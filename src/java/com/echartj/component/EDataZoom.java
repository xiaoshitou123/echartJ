/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.echartj.component;

import com.echartj.base.EDataBackground;
import com.echartj.base.style.EHandleStyle;
import com.echartj.base.style.EIconStyle;
import com.echartj.base.Eposition;
import com.echartj.base.feature.EDataZoomTitleAndIcon;

/**
 *
 * @author 小黑
 */
public class EDataZoom extends Eposition {

    private String type;
    private Boolean disabled;
    private String xAxisIndex;
    private String yAxisIndex;
    private String radiusAxisIndex;
    private String angleAxisIndex;
    private String filterMode;
    private Integer start;
    private Integer end;
    private String startValue;
    private String endValue;
    private String orient;
    private Boolean zoomLock;
    private Integer throttle;

    private String backgroundColor;
    private EDataBackground dataBackground;
    private String fillerColor;
    private String borderColor;
    private String handleIcon;
    private Integer handleSize;
    private EHandleStyle handleStyle;
    private Integer labelPrecision;
    private String labelFormatter;
    private String showDataShadow;
    private Integer zlevel;
    private Integer z;
    private Boolean showDetail;
    private Boolean realtime;
    private ETextStyle textStyle;
    
    private EDataZoomTitleAndIcon title;
    private EDataZoomTitleAndIcon icon;
    private EIconStyle  iconStyle ;

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public Boolean isDisabled() {
        return disabled;
    }

    public void setDisabled(Boolean disabled) {
        this.disabled = disabled;
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

    public String getRadiusAxisIndex() {
        return radiusAxisIndex;
    }

    public void setRadiusAxisIndex(String radiusAxisIndex) {
        this.radiusAxisIndex = radiusAxisIndex;
    }

    public String getAngleAxisIndex() {
        return angleAxisIndex;
    }

    public void setAngleAxisIndex(String angleAxisIndex) {
        this.angleAxisIndex = angleAxisIndex;
    }

    public String getFilterMode() {
        return filterMode;
    }

    public void setFilterMode(String filterMode) {
        this.filterMode = filterMode;
    }

    public Integer getStart() {
        return start;
    }

    public void setStart(Integer start) {
        this.start = start;
    }

    public Integer getEnd() {
        return end;
    }

    public void setEnd(Integer end) {
        this.end = end;
    }

    public String getStartValue() {
        return startValue;
    }

    public void setStartValue(String startValue) {
        this.startValue = startValue;
    }

    public String getEndValue() {
        return endValue;
    }

    public void setEndValue(String endValue) {
        this.endValue = endValue;
    }

    public String getOrient() {
        return orient;
    }

    public void setOrient(String orient) {
        this.orient = orient;
    }

    public Boolean isZoomLock() {
        return zoomLock;
    }

    public void setZoomLock(Boolean zoomLock) {
        this.zoomLock = zoomLock;
    }

    public Integer getThrottle() {
        return throttle;
    }

    public void setThrottle(Integer throttle) {
        this.throttle = throttle;
    }

    public String getBackgroundColor() {
        return backgroundColor;
    }

    public void setBackgroundColor(String backgroundColor) {
        this.backgroundColor = backgroundColor;
    }

    public EDataBackground getDataBackground() {
        return dataBackground;
    }

    public void setDataBackground(EDataBackground dataBackground) {
        this.dataBackground = dataBackground;
    }

    public String getFillerColor() {
        return fillerColor;
    }

    public void setFillerColor(String fillerColor) {
        this.fillerColor = fillerColor;
    }

    public String getBorderColor() {
        return borderColor;
    }

    public void setBorderColor(String borderColor) {
        this.borderColor = borderColor;
    }

    public String getHandleIcon() {
        return handleIcon;
    }

    public void setHandleIcon(String handleIcon) {
        this.handleIcon = handleIcon;
    }

    public Integer getHandleSize() {
        return handleSize;
    }

    public void setHandleSize(Integer handleSize) {
        this.handleSize = handleSize;
    }

    public EHandleStyle getHandleStyle() {
        return handleStyle;
    }

    public void setHandleStyle(EHandleStyle handleStyle) {
        this.handleStyle = handleStyle;
    }

    public Integer getLabelPrecision() {
        return labelPrecision;
    }

    public void setLabelPrecision(Integer labelPrecision) {
        this.labelPrecision = labelPrecision;
    }

    public String getLabelFormatter() {
        return labelFormatter;
    }

    public void setLabelFormatter(String labelFormatter) {
        this.labelFormatter = labelFormatter;
    }

    public String getShowDataShadow() {
        return showDataShadow;
    }

    public void setShowDataShadow(String showDataShadow) {
        this.showDataShadow = showDataShadow;
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

    public Boolean isShowDetail() {
        return showDetail;
    }

    public void setShowDetail(Boolean showDetail) {
        this.showDetail = showDetail;
    }

    public Boolean isRealtime() {
        return realtime;
    }

    public void setRealtime(Boolean realtime) {
        this.realtime = realtime;
    }

    public ETextStyle getTextStyle() {
        return textStyle;
    }

    public void setTextStyle(ETextStyle textStyle) {
        this.textStyle = textStyle;
    }

    public EDataZoomTitleAndIcon getTitle() {
        return title;
    }

    public void setTitle(EDataZoomTitleAndIcon title) {
        this.title = title;
    }

    public EDataZoomTitleAndIcon getIcon() {
        return icon;
    }

    public void setIcon(EDataZoomTitleAndIcon icon) {
        this.icon = icon;
    }

    public EIconStyle getIconStyle() {
        return iconStyle;
    }

    public void setIconStyle(EIconStyle iconStyle) {
        this.iconStyle = iconStyle;
    }


    

}
