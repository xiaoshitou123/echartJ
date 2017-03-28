/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.echartj.component;

import com.echartj.base.EAxisPointer;
import com.echartj.base.EBase;
import com.echartj.base.EData;
import java.util.List;

/**
 *
 * @author 小黑
 */
public class ETooltip extends EBase {

    private boolean showContent = true;
    private String trigger;
    private String triggerOn;
    private boolean alwaysShowContent;
    private boolean enterable;
    private Integer showDelay;
    private Integer hideDelay;
    private String position;
    private boolean confine;
    private Integer transitionDuration;
    private String formatter;
    private String backgroundColor;
    private String borderColor;
    private Integer borderWidth;
    private Integer padding;
    private ETextStyle textStyle;
    private String extraCssText;
    private EAxisPointer axisPointer;
    private List<EData> data;

    public boolean isShowContent() {
        return showContent;
    }

    public void setShowContent(boolean showContent) {
        this.showContent = showContent;
    }

    public String getTrigger() {
        return trigger;
    }

    public void setTrigger(String trigger) {
        this.trigger = trigger;
    }

    public String getTriggerOn() {
        return triggerOn;
    }

    public void setTriggerOn(String triggerOn) {
        this.triggerOn = triggerOn;
    }

    public boolean isAlwaysShowContent() {
        return alwaysShowContent;
    }

    public void setAlwaysShowContent(boolean alwaysShowContent) {
        this.alwaysShowContent = alwaysShowContent;
    }

    public boolean isEnterable() {
        return enterable;
    }

    public void setEnterable(boolean enterable) {
        this.enterable = enterable;
    }

    public Integer getShowDelay() {
        return showDelay;
    }

    public void setShowDelay(Integer showDelay) {
        this.showDelay = showDelay;
    }

    public Integer getHideDelay() {
        return hideDelay;
    }

    public void setHideDelay(Integer hideDelay) {
        this.hideDelay = hideDelay;
    }

    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position;
    }

    public boolean isConfine() {
        return confine;
    }

    public void setConfine(boolean confine) {
        this.confine = confine;
    }

    public Integer getTransitionDuration() {
        return transitionDuration;
    }

    public void setTransitionDuration(Integer transitionDuration) {
        this.transitionDuration = transitionDuration;
    }

    public String getFormatter() {
        return formatter;
    }

    public void setFormatter(String formatter) {
        this.formatter = formatter;
    }

    public String getBackgroundColor() {
        return backgroundColor;
    }

    public void setBackgroundColor(String backgroundColor) {
        this.backgroundColor = backgroundColor;
    }

    public String getBorderColor() {
        return borderColor;
    }

    public void setBorderColor(String borderColor) {
        this.borderColor = borderColor;
    }

    public Integer getBorderWidth() {
        return borderWidth;
    }

    public void setBorderWidth(Integer borderWidth) {
        this.borderWidth = borderWidth;
    }

    public Integer getPadding() {
        return padding;
    }

    public void setPadding(Integer padding) {
        this.padding = padding;
    }

    public ETextStyle getTextStyle() {
        return textStyle;
    }

    public void setTextStyle(ETextStyle textStyle) {
        this.textStyle = textStyle;
    }

    public String getExtraCssText() {
        return extraCssText;
    }

    public void setExtraCssText(String extraCssText) {
        this.extraCssText = extraCssText;
    }

    public EAxisPointer getAxisPointer() {
        return axisPointer;
    }

    public void setAxisPointer(EAxisPointer axisPointer) {
        this.axisPointer = axisPointer;
    }

    public List<EData> getData() {
        return data;
    }

    public void setData(List<EData> data) {
        this.data = data;
    }

}
