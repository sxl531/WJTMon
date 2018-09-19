package com.WJTMon.controller;

import com.WJTMon.entity.AccountInfo;
import net.sf.json.JSONObject;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class AccountController {

    @ResponseBody
    @RequestMapping("/addAccount")
    public  String addAccount(AccountInfo accountInfo){
        JSONObject jsonObject=new JSONObject();
        JSONObject json=new JSONObject();
        jsonObject.put("success",true);
        jsonObject.put("msg","添加成功");
        jsonObject.put("data",json);
        return jsonObject.toString();
    }

    @ResponseBody
    @RequestMapping("/login")
    public  String login(AccountInfo accountInfo){
        JSONObject jsonObject=new JSONObject();
        JSONObject json=new JSONObject();
        jsonObject.put("success",true);
        jsonObject.put("msg","登陆成功");
        jsonObject.put("data",json);
        return jsonObject.toString();
    }

    @ResponseBody
    @RequestMapping("/getFenjuAccountByMobileNumber")
    public  String getFenjuAccountByMobileNumber(String tele){
        System.out.println("tele="+tele);

        JSONObject jsonObject=new JSONObject();
        JSONObject json=new JSONObject();
        json.put("tele","15620001781");
        json.put("name","李勇");
        json.put("scope","河西");
        json.put("fenjuId","NWGHP0002");
        json.put("fenjuName","天津联通和平赤峰道分公司");
        jsonObject.put("account",json);
        return jsonObject.toString();
    }

    @ResponseBody
    @RequestMapping("/changePwd")
    public  String changePwd(String tele,String oldPwd,String newPwd){
        JSONObject jsonObject=new JSONObject();
        jsonObject.put("result","success");
        return jsonObject.toString();
    }

}
