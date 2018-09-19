package com.WJTMon.controller;

import com.WJTMon.entity.MapInfo;
import net.sf.json.JSONObject;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class MapInfoController {

    @ResponseBody
    @RequestMapping("/getFenjuMapInfo")
    public String getMapInfo(String fenjuId,String fenjuName){

        JSONObject json=new JSONObject();
        json.put("lng","110.123");
        json.put("lat","36.123");

        JSONObject jsonObject=new JSONObject();
        jsonObject.put("center",json);
        jsonObject.put("zoom","15");


        return jsonObject.toString();
    }

    @ResponseBody
    @RequestMapping("/addMapInfo")
    public  String addMapInfo(MapInfo mapInfo){
        JSONObject jsonObject=new JSONObject();
        jsonObject.put("result","success");
        return jsonObject.toString();
    }
}
