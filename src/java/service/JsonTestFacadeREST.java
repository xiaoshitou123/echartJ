/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package service;

import com.echartj.base.EData;
import com.echartj.component.ELegend;
import com.echartj.component.EOption;
import com.echartj.base.ESeries;
import com.echartj.component.ETitle;
import com.echartj.component.EXAxis;
import com.echartj.component.EYAxis;
import com.echartj.util.JsonUtil;
import java.util.ArrayList;
import java.util.List;
import javax.ejb.Stateless;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

/**
 *
 * @author 小黑
 */
@Stateless
@Path("service.jsontest")
public class JsonTestFacadeREST  {


    @GET
    @Path("count")
    @Produces(MediaType.TEXT_PLAIN)
    public String countREST() {
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
        String optionJson = JsonUtil.toJson(o);
        System.out.println(optionJson);
        return optionJson;
    }

    
}
