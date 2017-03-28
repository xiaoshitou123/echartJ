/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.echartj.component;

import com.echartj.base.ELabel;
import com.echartj.base.Eposition;
import com.echartj.base.ERegions;
import com.echartj.base.EScaleLimit;
import com.echartj.base.style.EItemStyle;
import java.util.List;
import java.util.Map;

/**
 *
 * @author 小黑
 */
public class EGeo extends Eposition {

    private String map;

    private String roam;

    private List<String> center;

    private String aspectScale;
    private Integer zoom;
    private EScaleLimit scaleLimit;
    private Map<String, String> nameMap;
    private String selectedMode;
    private ELabel label;
    private EItemStyle itemStyle;
    private Integer zlevel;
    private Integer z;
    private List<String> layoutCenter;
    private String layoutSize;
    private List<ERegions> regions;
    private Boolean silent;

    public String getMap() {
        return map;
    }

    public void setMap(String map) {
        this.map = map;
    }

    public String getRoam() {
        return roam;
    }

    public void setRoam(String roam) {
        this.roam = roam;
    }

    public List<String> getCenter() {
        return center;
    }

    public void setCenter(List<String> center) {
        this.center = center;
    }

    public String getAspectScale() {
        return aspectScale;
    }

    public void setAspectScale(String aspectScale) {
        this.aspectScale = aspectScale;
    }

    public Integer getZoom() {
        return zoom;
    }

    public void setZoom(Integer zoom) {
        this.zoom = zoom;
    }

    public EScaleLimit getScaleLimit() {
        return scaleLimit;
    }

    public void setScaleLimit(EScaleLimit scaleLimit) {
        this.scaleLimit = scaleLimit;
    }

    public Map<String, String> getNameMap() {
        return nameMap;
    }

    public void setNameMap(Map<String, String> nameMap) {
        this.nameMap = nameMap;
    }

    public String getSelectedMode() {
        return selectedMode;
    }

    public void setSelectedMode(String selectedMode) {
        this.selectedMode = selectedMode;
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

    public List<String> getLayoutCenter() {
        return layoutCenter;
    }

    public void setLayoutCenter(List<String> layoutCenter) {
        this.layoutCenter = layoutCenter;
    }

    public String getLayoutSize() {
        return layoutSize;
    }

    public void setLayoutSize(String layoutSize) {
        this.layoutSize = layoutSize;
    }

    public List<ERegions> getRegions() {
        return regions;
    }

    public void setRegions(List<ERegions> regions) {
        this.regions = regions;
    }

    public Boolean getSilent() {
        return silent;
    }

    public void setSilent(Boolean silent) {
        this.silent = silent;
    }

}
