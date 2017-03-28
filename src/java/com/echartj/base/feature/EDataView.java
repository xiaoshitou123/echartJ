/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.echartj.base.feature;

import com.echartj.base.EBase;
import com.echartj.base.style.EIconStyle;
import java.util.List;

/**
 *
 * @author 小黑
 */
public class EDataView extends EBase {

    private Boolean title;
    private Boolean readOnly;
    private String icon;
    private EIconStyle iconStyle;
    private String optionToContent;
    private String contentToOption;
    private List<String> lang;
    private String backgroundColor;
    private String textareaColor;
    private String textareaBorderColor;
    private String textColor;
    private String buttonColor;
    private String buttonTextColor;

    public Boolean getTitle() {
        return title;
    }

    public void setTitle(Boolean title) {
        this.title = title;
    }

    public Boolean getReadOnly() {
        return readOnly;
    }

    public void setReadOnly(Boolean readOnly) {
        this.readOnly = readOnly;
    }

    public String getIcon() {
        return icon;
    }

    public void setIcon(String icon) {
        this.icon = icon;
    }

    public EIconStyle getIconStyle() {
        return iconStyle;
    }

    public void setIconStyle(EIconStyle iconStyle) {
        this.iconStyle = iconStyle;
    }

    public String getOptionToContent() {
        return optionToContent;
    }

    public void setOptionToContent(String optionToContent) {
        this.optionToContent = optionToContent;
    }

    public String getContentToOption() {
        return contentToOption;
    }

    public void setContentToOption(String contentToOption) {
        this.contentToOption = contentToOption;
    }

    public List<String> getLang() {
        return lang;
    }

    public void setLang(List<String> lang) {
        this.lang = lang;
    }

    public String getBackgroundColor() {
        return backgroundColor;
    }

    public void setBackgroundColor(String backgroundColor) {
        this.backgroundColor = backgroundColor;
    }

    public String getTextareaColor() {
        return textareaColor;
    }

    public void setTextareaColor(String textareaColor) {
        this.textareaColor = textareaColor;
    }

    public String getTextareaBorderColor() {
        return textareaBorderColor;
    }

    public void setTextareaBorderColor(String textareaBorderColor) {
        this.textareaBorderColor = textareaBorderColor;
    }

    public String getTextColor() {
        return textColor;
    }

    public void setTextColor(String textColor) {
        this.textColor = textColor;
    }

    public String getButtonColor() {
        return buttonColor;
    }

    public void setButtonColor(String buttonColor) {
        this.buttonColor = buttonColor;
    }

    public String getButtonTextColor() {
        return buttonTextColor;
    }

    public void setButtonTextColor(String buttonTextColor) {
        this.buttonTextColor = buttonTextColor;
    }

}
