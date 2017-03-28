/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.echartj.component;

import com.echartj.base.EParallelAxisDefault;
import com.echartj.base.Eposition;

/**
 *
 * @author 小黑
 */
public class EParallel extends Eposition {

    private Integer zlevel;
    private Integer z;
    private String height;
    private String width;
    private String layout;
    private Boolean axisExpandable;
    private String axisExpandCenter;
    private Integer axisExpandCount;
    private Integer axisExpandWidth;
    private EParallelAxisDefault parallelAxisDefault;

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

    public String getHeight() {
        return height;
    }

    public void setHeight(String height) {
        this.height = height;
    }

    public String getWidth() {
        return width;
    }

    public void setWidth(String width) {
        this.width = width;
    }

    public String getLayout() {
        return layout;
    }

    public void setLayout(String layout) {
        this.layout = layout;
    }

    public Boolean getAxisExpandable() {
        return axisExpandable;
    }

    public void setAxisExpandable(Boolean axisExpandable) {
        this.axisExpandable = axisExpandable;
    }

    public String getAxisExpandCenter() {
        return axisExpandCenter;
    }

    public void setAxisExpandCenter(String axisExpandCenter) {
        this.axisExpandCenter = axisExpandCenter;
    }

    public Integer getAxisExpandCount() {
        return axisExpandCount;
    }

    public void setAxisExpandCount(Integer axisExpandCount) {
        this.axisExpandCount = axisExpandCount;
    }

    public Integer getAxisExpandWidth() {
        return axisExpandWidth;
    }

    public void setAxisExpandWidth(Integer axisExpandWidth) {
        this.axisExpandWidth = axisExpandWidth;
    }

    public EParallelAxisDefault getParallelAxisDefault() {
        return parallelAxisDefault;
    }

    public void setParallelAxisDefault(EParallelAxisDefault parallelAxisDefault) {
        this.parallelAxisDefault = parallelAxisDefault;
    }

}
