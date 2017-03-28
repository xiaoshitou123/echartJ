/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.echartj.base;

import java.util.List;

/**
 *
 * @author 小黑
 */
public class Esymbol extends Eposition{
    
    private String symbol ;
    private String symbolSize  ;
    private Integer symbolRotate   ;
    private List<String> symbolOffset    ;

    public String getSymbol() {
        return symbol;
    }

    public void setSymbol(String symbol) {
        this.symbol = symbol;
    }

    public String getSymbolSize() {
        return symbolSize;
    }

    public void setSymbolSize(String symbolSize) {
        this.symbolSize = symbolSize;
    }

    public Integer getSymbolRotate() {
        return symbolRotate;
    }

    public void setSymbolRotate(Integer symbolRotate) {
        this.symbolRotate = symbolRotate;
    }

    public List<String> getSymbolOffset() {
        return symbolOffset;
    }

    public void setSymbolOffset(List<String> symbolOffset) {
        this.symbolOffset = symbolOffset;
    }
    
    
    
}
