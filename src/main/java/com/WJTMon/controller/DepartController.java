package com.WJTMon.controller;

import net.sf.json.JSONArray;
import net.sf.json.JSONObject;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class DepartController {

    @ResponseBody
    @RequestMapping("/getDeparts")
    public String getDepartList() {
        JSONArray array=new JSONArray();
        JSONObject json=new JSONObject();
        json.put("departId","101");
        json.put("departCode","NWGHP0002");
        json.put("departName","赤峰道分公司");
        array.add(json);
        json=new JSONObject();
        json.put("departId","99");
        json.put("departCode","NWGHP0004");
        json.put("departName","河北路分公司");
        array.add(json);
        return array.toString();
    }
}
