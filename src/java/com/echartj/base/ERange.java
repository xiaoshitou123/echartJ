/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.echartj.base;

/**
 * 包含 outOfRange  inRange  inBrush outOfBrush 
 * @author 小黑
 */
public class ERange {

    private String symbol;
    private String color;
    private String colorAlpha;
    private String colorSaturation;
    private String colorHue;
    private Integer symbolSize;
    private Integer opacity;
    private String colorLightness;

    public String getSymbol() {
        return symbol;
    }

    public void setSymbol(String symbol) {
        this.symbol = symbol;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getColorAlpha() {
        return colorAlpha;
    }

    public void setColorAlpha(String colorAlpha) {
        this.colorAlpha = colorAlpha;
    }

    public String getColorSaturation() {
        return colorSaturation;
    }

    public void setColorSaturation(String colorSaturation) {
        this.colorSaturation = colorSaturation;
    }

    public String getColorHue() {
        return colorHue;
    }

    public void setColorHue(String colorHue) {
        this.colorHue = colorHue;
    }

    public Integer getSymbolSize() {
        return symbolSize;
    }

    public void setSymbolSize(Integer symbolSize) {
        this.symbolSize = symbolSize;
    }

    public Integer getOpacity() {
        return opacity;
    }

    public void setOpacity(Integer opacity) {
        this.opacity = opacity;
    }

    public String getColorLightness() {
        return colorLightness;
    }

    public void setColorLightness(String colorLightness) {
        this.colorLightness = colorLightness;
    }

}
