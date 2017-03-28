/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.echartj.base.style;

import com.echartj.base.EBase;
import com.echartj.base.ENormalAemphasis;

/**
 *
 * @author 小黑
 */
public class EControlStyle extends EBase {

    private Boolean showPlayBtn;
    private Boolean showPrevBtn;
    private Boolean showNextBtn;
    private Integer itemSize;
    private Integer itemGap;
    private String position;
    private String playIcon;
    private String stopIcon;
    private String prevIcon;
    private String nextIcon;
    private ENormalAemphasis normal;
    private ENormalAemphasis emphasis;

    public Boolean getShowPlayBtn() {
        return showPlayBtn;
    }

    public void setShowPlayBtn(Boolean showPlayBtn) {
        this.showPlayBtn = showPlayBtn;
    }

    public Boolean getShowPrevBtn() {
        return showPrevBtn;
    }

    public void setShowPrevBtn(Boolean showPrevBtn) {
        this.showPrevBtn = showPrevBtn;
    }

    public Boolean getShowNextBtn() {
        return showNextBtn;
    }

    public void setShowNextBtn(Boolean showNextBtn) {
        this.showNextBtn = showNextBtn;
    }

    public Integer getItemSize() {
        return itemSize;
    }

    public void setItemSize(Integer itemSize) {
        this.itemSize = itemSize;
    }

    public Integer getItemGap() {
        return itemGap;
    }

    public void setItemGap(Integer itemGap) {
        this.itemGap = itemGap;
    }

    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position;
    }

    public String getPlayIcon() {
        return playIcon;
    }

    public void setPlayIcon(String playIcon) {
        this.playIcon = playIcon;
    }

    public String getStopIcon() {
        return stopIcon;
    }

    public void setStopIcon(String stopIcon) {
        this.stopIcon = stopIcon;
    }

    public String getPrevIcon() {
        return prevIcon;
    }

    public void setPrevIcon(String prevIcon) {
        this.prevIcon = prevIcon;
    }

    public String getNextIcon() {
        return nextIcon;
    }

    public void setNextIcon(String nextIcon) {
        this.nextIcon = nextIcon;
    }

    public ENormalAemphasis getNormal() {
        return normal;
    }

    public void setNormal(ENormalAemphasis normal) {
        this.normal = normal;
    }

    public ENormalAemphasis getEmphasis() {
        return emphasis;
    }

    public void setEmphasis(ENormalAemphasis emphasis) {
        this.emphasis = emphasis;
    }

}
