/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.echartj.util;

import com.echartj.base.EData;
import com.echartj.component.ELegend;
import com.echartj.component.EOption;
import com.echartj.base.ESeries;
import com.echartj.component.ETitle;
import com.echartj.component.EXAxis;
import com.echartj.component.EYAxis;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.reflect.TypeToken;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 *
 * @author 小黑
 */
public class JsonUtil {

    private static Gson gson;
    private static Gson gsonWithExpose;

    static {
        gson = new GsonBuilder().create();
        // 没有@Expose注解的属性将不会被序列化  
        gsonWithExpose = new GsonBuilder().excludeFieldsWithoutExposeAnnotation().create();
    }

    private JsonUtil() {
    }

    /**
     * 将对象转换成json
     *
     * @param obj
     * @return
     */
    public static String toJson(final Object obj) {
        return gson.toJson(obj);
    }

    /**
     * 将对象中被@Expose注解的属性转换成json
     *
     * @param obj
     * @return
     */
    public static String toJsonWithExpose(final Object obj) {
        return gsonWithExpose.toJson(obj);
    }

    public static <T> T jsonToBean(final String json, final Class<T> clazz) {
        return gson.fromJson(json, clazz);
    }

    /**
     * 将json转换成任意对象
     *
     * @param json
     * @return
     */
    public static <T> T jsonToObject(final String json) {
        Type type = new TypeToken<T>() {
        }.getType();
        return gson.fromJson(json, type);
    }

    /**
     * 在json字符串中，根据key值找到value
     *
     * @param json
     * @param key
     * @return
     */
    public static Object getValue(final String json, final String key) {
        return jsonToMap(json).get(key);
    }

    /**
     * 将json转换成map对象
     *
     * @param json
     * @return
     */
    public static Map<Object, Object> jsonToMap(final String json) {
        Map<Object, Object> map = null;
        Type type = new TypeToken<Map<Object, Object>>() {
        }.getType();
        map = gson.fromJson(json, type);
        if (map == null) {
            map = new HashMap<Object, Object>();
        }
        return map;
    }

    /**
     * 将json转换成List对象
     *
     * @param json
     * @return
     */
    public static <T> List<T> jsonToList(final String json) {
        List<T> list = null;
        Type type = new TypeToken<List<T>>() {
        }.getType();
        list = gson.fromJson(json, type);
        if (list == null) {
            list = new ArrayList<T>();
        }
        return list;
    }

    public static void main(String[] argo) {

        EOption o = new EOption();
        ETitle title = new ETitle();
        title.setText("五分钟入门echart实例");
        o.setTitle(title);

        ELegend legend = new ELegend();
        List<EData> datas = new ArrayList<>();
        EData data = new EData();
        data.setName("销量");
        data.setIcon("circle");
        datas.add(data);
        legend.setData(datas);
        o.setLegend(legend);

        EXAxis xAxis = new EXAxis();
        List<EData> datas1 = new ArrayList<>();
        EData data1 = new EData();
        data1.setValue("衬衫");
        EData data2 = new EData();
        data2.setValue("羊毛衫");
        EData data3 = new EData();
        data3.setValue("雪纺衫");
        datas1.add(data1);
        datas1.add(data2);
        datas1.add(data3);
        xAxis.setData(datas1);
        o.setxAxis(xAxis);
        List<ESeries> seriess = new ArrayList<>();
        ESeries series = new ESeries();
        series.setType("bar");
        series.setName("销量");
        List<EData> datas2 = new ArrayList<>();
        EData data4 = new EData();
        data4.setValue("5");
        EData data5 = new EData();
        data5.setValue("20");
        EData data6 = new EData();
        data6.setValue("36");
        datas2.add(data4);
        datas2.add(data5);
        datas2.add(data6);
        series.setData(datas2);
        seriess.add(series);
        o.setSeries(seriess);
         EYAxis yAxis =new EYAxis();
        o.setyAxis(yAxis);
        String aaa = JsonUtil.toJson(o);
        System.out.print(aaa);

    }

}
