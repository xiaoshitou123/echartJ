/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.echartj.component;

import com.echartj.base.ESeries;
import com.echartj.animation.Eanimation;
import java.util.List;
import java.util.Map;

/**
 *
 * @author 小黑
 */
public class EOption extends Eanimation {

    private ETitle title;
    private ELegend legend;
    private EGrid grid;
    private EXAxis xAxis;
    private EYAxis yAxis;
    private EPolar polar;
    private ERadiusAxis radiusAxis;
    private EAngleAxis angleAxis;
    private ERadar radar;
    private List<EDataZoom> datazoom;
    private List<EVisualMap> visualMap;

    private ETooltip tooltip;
    private EToolbox toolbox;
    private EBrush brush;
    private EGeo geo;
    private EParallel parallel;
    private EParallelAxis parallelAxis;
    private ESingleAxis singleAxis;
    private ETimeline timeline;
    private EGraphic graphic;
    private List<ESeries> series;
    private List<String> color;
    private List<String> backgroundColor;
    private ETextStyle textStyle;
    private Integer progressive;
    private Integer progressiveThreshold;
    private Integer hoverLayerThreshold;
    private String blendMode;

    private List<Map<String, String>> map;

    public ETitle getTitle() {
        return title;
    }

    public void setTitle(ETitle title) {
        this.title = title;
    }

    public ELegend getLegend() {
        return legend;
    }

    public void setLegend(ELegend legend) {
        this.legend = legend;
    }

    public EGrid getGrid() {
        return grid;
    }

    public void setGrid(EGrid grid) {
        this.grid = grid;
    }

    public EXAxis getxAxis() {
        return xAxis;
    }

    public void setxAxis(EXAxis xAxis) {
        this.xAxis = xAxis;
    }

    public EYAxis getyAxis() {
        return yAxis;
    }

    public void setyAxis(EYAxis yAxis) {
        this.yAxis = yAxis;
    }

    public EPolar getPolar() {
        return polar;
    }

    public void setPolar(EPolar polar) {
        this.polar = polar;
    }

    public ERadiusAxis getRadiusAxis() {
        return radiusAxis;
    }

    public void setRadiusAxis(ERadiusAxis radiusAxis) {
        this.radiusAxis = radiusAxis;
    }

    public EAngleAxis getAngleAxis() {
        return angleAxis;
    }

    public void setAngleAxis(EAngleAxis angleAxis) {
        this.angleAxis = angleAxis;
    }

    public ERadar getRadar() {
        return radar;
    }

    public void setRadar(ERadar radar) {
        this.radar = radar;
    }

    public List<EDataZoom> getDatazoom() {
        return datazoom;
    }

    public void setDatazoom(List<EDataZoom> datazoom) {
        this.datazoom = datazoom;
    }

    public List<EVisualMap> getVisualMap() {
        return visualMap;
    }

    public void setVisualMap(List<EVisualMap> visualMap) {
        this.visualMap = visualMap;
    }

    public ETooltip getTooltip() {
        return tooltip;
    }

    public void setTooltip(ETooltip tooltip) {
        this.tooltip = tooltip;
    }

    public EToolbox getToolbox() {
        return toolbox;
    }

    public void setToolbox(EToolbox toolbox) {
        this.toolbox = toolbox;
    }

    public EBrush getBrush() {
        return brush;
    }

    public void setBrush(EBrush brush) {
        this.brush = brush;
    }

    public EGeo getGeo() {
        return geo;
    }

    public void setGeo(EGeo geo) {
        this.geo = geo;
    }

    public EParallel getParallel() {
        return parallel;
    }

    public void setParallel(EParallel parallel) {
        this.parallel = parallel;
    }

    public EParallelAxis getParallelAxis() {
        return parallelAxis;
    }

    public void setParallelAxis(EParallelAxis parallelAxis) {
        this.parallelAxis = parallelAxis;
    }

    public ESingleAxis getSingleAxis() {
        return singleAxis;
    }

    public void setSingleAxis(ESingleAxis singleAxis) {
        this.singleAxis = singleAxis;
    }

    public ETimeline getTimeline() {
        return timeline;
    }

    public void setTimeline(ETimeline timeline) {
        this.timeline = timeline;
    }

    public EGraphic getGraphic() {
        return graphic;
    }

    public void setGraphic(EGraphic graphic) {
        this.graphic = graphic;
    }

    public List<ESeries> getSeries() {
        return series;
    }

    public void setSeries(List<ESeries> series) {
        this.series = series;
    }

    public List<String> getColor() {
        return color;
    }

    public void setColor(List<String> color) {
        this.color = color;
    }

    public List<String> getBackgroundColor() {
        return backgroundColor;
    }

    public void setBackgroundColor(List<String> backgroundColor) {
        this.backgroundColor = backgroundColor;
    }

    public ETextStyle getTextStyle() {
        return textStyle;
    }

    public void setTextStyle(ETextStyle textStyle) {
        this.textStyle = textStyle;
    }

    public Integer getProgressive() {
        return progressive;
    }

    public void setProgressive(Integer progressive) {
        this.progressive = progressive;
    }

    public Integer getProgressiveThreshold() {
        return progressiveThreshold;
    }

    public void setProgressiveThreshold(Integer progressiveThreshold) {
        this.progressiveThreshold = progressiveThreshold;
    }

    public Integer getHoverLayerThreshold() {
        return hoverLayerThreshold;
    }

    public void setHoverLayerThreshold(Integer hoverLayerThreshold) {
        this.hoverLayerThreshold = hoverLayerThreshold;
    }

    public String getBlendMode() {
        return blendMode;
    }

    public void setBlendMode(String blendMode) {
        this.blendMode = blendMode;
    }

    public List<Map<String, String>> getMap() {
        return map;
    }

    public void setMap(List<Map<String, String>> map) {
        this.map = map;
    }

}
