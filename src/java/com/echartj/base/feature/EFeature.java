/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.echartj.base.feature;

import com.echartj.component.EDataZoom;

/**
 *
 * @author 小黑
 */
public class EFeature {

    private ESaveAsImage saveAsImage;
    private ERestore restore;
    private EDataView dataView;
    private EDataZoom dataZoom;
    private EMagicType magicType;
    private EFeatureBrush brush;

    public ESaveAsImage getSaveAsImage() {
        return saveAsImage;
    }

    public void setSaveAsImage(ESaveAsImage saveAsImage) {
        this.saveAsImage = saveAsImage;
    }

    public ERestore getRestore() {
        return restore;
    }

    public void setRestore(ERestore restore) {
        this.restore = restore;
    }

    public EDataView getDataView() {
        return dataView;
    }

    public void setDataView(EDataView dataView) {
        this.dataView = dataView;
    }

    public EDataZoom getDataZoom() {
        return dataZoom;
    }

    public void setDataZoom(EDataZoom dataZoom) {
        this.dataZoom = dataZoom;
    }

    public EMagicType getMagicType() {
        return magicType;
    }

    public void setMagicType(EMagicType magicType) {
        this.magicType = magicType;
    }

    public EFeatureBrush getBrush() {
        return brush;
    }

    public void setBrush(EFeatureBrush brush) {
        this.brush = brush;
    }

}
