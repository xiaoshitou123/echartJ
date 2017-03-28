/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.echartj.component;

import com.echartj.base.EController;
import com.echartj.base.Eposition;
import com.echartj.base.ERange;
import java.util.List;

/**
 *
 * @author 小黑
 */
public class EVisualMap extends Eposition {

    private String type;

    private Integer min;
    private Integer max;
    private List<Integer> range;
    private List<String> text;
    private List<Integer> textGap;
    private Boolean calculable;
    private Boolean realtime;
    private Boolean inverse;
    private Boolean hoverLink;
    private Boolean minOpen;
    private Boolean maxOpen;
    private Integer precision;
    private Integer itemWidth;
    private Integer itemHeight;
    private String align;
    private String seriesIndex;
    private String orient;
    private Integer dimension;
    private Integer borderWidth;
    private String padding;
    private String backgroundColor;
    private ERange inRange;
    private ERange outOfRange;
    private EController controller;
    private Integer zlevel;
    private List<String> color;
    private Integer z;
    private ETextStyle textStyle;
    private String formatter;
    private Integer splitNumber;
    private List<String> pieces;
    private List<String> categories;
    private String selectedMode;
    private String borderColor;

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public Integer getMin() {
        return min;
    }

    public void setMin(Integer min) {
        this.min = min;
    }

    public Integer getMax() {
        return max;
    }

    public void setMax(Integer max) {
        this.max = max;
    }

    public List<Integer> getRange() {
        return range;
    }

    public void setRange(List<Integer> range) {
        this.range = range;
    }

    public List<String> getText() {
        return text;
    }

    public void setText(List<String> text) {
        this.text = text;
    }

    public List<Integer> getTextGap() {
        return textGap;
    }

    public void setTextGap(List<Integer> textGap) {
        this.textGap = textGap;
    }

    public Boolean getCalculable() {
        return calculable;
    }

    public void setCalculable(Boolean calculable) {
        this.calculable = calculable;
    }

    public Boolean getRealtime() {
        return realtime;
    }

    public void setRealtime(Boolean realtime) {
        this.realtime = realtime;
    }

    public Boolean getInverse() {
        return inverse;
    }

    public void setInverse(Boolean inverse) {
        this.inverse = inverse;
    }

    public Boolean getHoverLink() {
        return hoverLink;
    }

    public void setHoverLink(Boolean hoverLink) {
        this.hoverLink = hoverLink;
    }

    public Boolean getMinOpen() {
        return minOpen;
    }

    public void setMinOpen(Boolean minOpen) {
        this.minOpen = minOpen;
    }

    public Boolean getMaxOpen() {
        return maxOpen;
    }

    public void setMaxOpen(Boolean maxOpen) {
        this.maxOpen = maxOpen;
    }

    public Integer getPrecision() {
        return precision;
    }

    public void setPrecision(Integer precision) {
        this.precision = precision;
    }

    public Integer getItemWidth() {
        return itemWidth;
    }

    public void setItemWidth(Integer itemWidth) {
        this.itemWidth = itemWidth;
    }

    public Integer getItemHeight() {
        return itemHeight;
    }

    public void setItemHeight(Integer itemHeight) {
        this.itemHeight = itemHeight;
    }

    public String getAlign() {
        return align;
    }

    public void setAlign(String align) {
        this.align = align;
    }

    public String getSeriesIndex() {
        return seriesIndex;
    }

    public void setSeriesIndex(String seriesIndex) {
        this.seriesIndex = seriesIndex;
    }

    public String getOrient() {
        return orient;
    }

    public void setOrient(String orient) {
        this.orient = orient;
    }

    public Integer getDimension() {
        return dimension;
    }

    public void setDimension(Integer dimension) {
        this.dimension = dimension;
    }

    public Integer getBorderWidth() {
        return borderWidth;
    }

    public void setBorderWidth(Integer borderWidth) {
        this.borderWidth = borderWidth;
    }

    public String getPadding() {
        return padding;
    }

    public void setPadding(String padding) {
        this.padding = padding;
    }

    public String getBackgroundColor() {
        return backgroundColor;
    }

    public void setBackgroundColor(String backgroundColor) {
        this.backgroundColor = backgroundColor;
    }

    public ERange getInRange() {
        return inRange;
    }

    public void setInRange(ERange inRange) {
        this.inRange = inRange;
    }

    public ERange getOutOfRange() {
        return outOfRange;
    }

    public void setOutOfRange(ERange outOfRange) {
        this.outOfRange = outOfRange;
    }

    public EController getController() {
        return controller;
    }

    public void setController(EController controller) {
        this.controller = controller;
    }

    public Integer getZlevel() {
        return zlevel;
    }

    public void setZlevel(Integer zlevel) {
        this.zlevel = zlevel;
    }

    public List<String> getColor() {
        return color;
    }

    public void setColor(List<String> color) {
        this.color = color;
    }

    public Integer getZ() {
        return z;
    }

    public void setZ(Integer z) {
        this.z = z;
    }

    public ETextStyle getTextStyle() {
        return textStyle;
    }

    public void setTextStyle(ETextStyle textStyle) {
        this.textStyle = textStyle;
    }

    public String getFormatter() {
        return formatter;
    }

    public void setFormatter(String formatter) {
        this.formatter = formatter;
    }

    public Integer getSplitNumber() {
        return splitNumber;
    }

    public void setSplitNumber(Integer splitNumber) {
        this.splitNumber = splitNumber;
    }

    public List<String> getPieces() {
        return pieces;
    }

    public void setPieces(List<String> pieces) {
        this.pieces = pieces;
    }

    public List<String> getCategories() {
        return categories;
    }

    public void setCategories(List<String> categories) {
        this.categories = categories;
    }

    public String getSelectedMode() {
        return selectedMode;
    }

    public void setSelectedMode(String selectedMode) {
        this.selectedMode = selectedMode;
    }

    public String getBorderColor() {
        return borderColor;
    }

    public void setBorderColor(String borderColor) {
        this.borderColor = borderColor;
    }

}
