/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.echartj.base;

/**
 *
 * @author 小黑
 */
public class ELabel {

    private String position ;
    private ENormalAemphasis normal;
    private ENormalAemphasis emphasis;

    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position;
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
