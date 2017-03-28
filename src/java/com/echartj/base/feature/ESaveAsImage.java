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
public class ESaveAsImage extends EBase {

    private EIconStyle iconStyle;
    private String type;
    private String name;
    private String backgroundColor;
    private List<String> excludeComponents;
    private Boolean title;
    private String icon;
    private Integer pixelRatio;

    public EIconStyle getIconStyle() {
        return iconStyle;
    }

    public void setIconStyle(EIconStyle iconStyle) {
        this.iconStyle = iconStyle;
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

    public String getBackgroundColor() {
        return backgroundColor;
    }

    public void setBackgroundColor(String backgroundColor) {
        this.backgroundColor = backgroundColor;
    }

    public List<String> getExcludeComponents() {
        return excludeComponents;
    }

    public void setExcludeComponents(List<String> excludeComponents) {
        this.excludeComponents = excludeComponents;
    }

    public Boolean getTitle() {
        return title;
    }

    public void setTitle(Boolean title) {
        this.title = title;
    }

    public String getIcon() {
        return icon;
    }

    public void setIcon(String icon) {
        this.icon = icon;
    }

    public Integer getPixelRatio() {
        return pixelRatio;
    }

    public void setPixelRatio(Integer pixelRatio) {
        this.pixelRatio = pixelRatio;
    }

}
