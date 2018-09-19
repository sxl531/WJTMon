package com.WJTMon.controller;

import net.sf.json.JSONArray;
import net.sf.json.JSONObject;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@ResponseBody
public class RoleController {

    @RequestMapping("/getRoles")
    public  String getRoleList(){
        JSONArray array=new JSONArray();
        JSONObject json=new JSONObject();
        json.put("roleId","1");
        json.put("roleName","分局局长");
        array.add(json);
        return array.toString();
    }
}
