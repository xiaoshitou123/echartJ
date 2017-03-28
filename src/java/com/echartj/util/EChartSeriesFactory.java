/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.echartj.util;

import com.echartj.base.ESeries;
import com.echartj.component.EBarSeries;
import com.echartj.component.ELineSeries;
import com.echartj.component.EPieSeries;

/**
 * 生产系列的工厂类
 * @author 小黑
 */
public class EChartSeriesFactory {
    
    public static ESeries getSeriesByType(String type){
        ESeries series ;
        if(EChartConstant.SERIES_TYPE_LINE.equalsIgnoreCase(type)){
            series = new ELineSeries();
            series.setType(type);
            return series; 
        }else if(EChartConstant.SERIES_TYPE_BAR.equalsIgnoreCase(type)){
            series = new EBarSeries();
            series.setType(type);
            return series; 
        }else if(EChartConstant.SERIES_TYPE_PIE.equalsIgnoreCase(type)){
            series = new EPieSeries();
            series.setType(type);
            return series; 
        }
        return null;
    }
}
