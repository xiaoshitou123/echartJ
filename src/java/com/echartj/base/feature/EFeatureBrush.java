/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.echartj.base.feature;

import java.util.List;

/**
 *
 * @author 小黑
 */
public class EFeatureBrush {

    private List<String> type;
    private EBrushTitleAndIcon icon;
    private EBrushTitleAndIcon title;

    public List<String> getType() {
        return type;
    }

    public void setType(List<String> type) {
        this.type = type;
    }

    public EBrushTitleAndIcon getIcon() {
        return icon;
    }

    public void setIcon(EBrushTitleAndIcon icon) {
        this.icon = icon;
    }

    public EBrushTitleAndIcon getTitle() {
        return title;
    }

    public void setTitle(EBrushTitleAndIcon title) {
        this.title = title;
    }

}
