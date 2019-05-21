package com.crk.controller;

import com.crk.pojo.Tree;
import com.crk.pojo.aaa;
import com.crk.service.IUserInfoService;
import net.sf.json.JSONArray;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import net.sf.json.JSON;
import net.sf.json.JSONObject;
import net.sf.json.xml.XMLSerializer;
import org.springframework.web.servlet.ModelAndView;

import javax.annotation.Resource;
import java.util.HashMap;
import java.util.List;

/**
 * @Author: 程荣凯
 * @Date: 2018/7/24 21:48
 */
@Controller
@RequestMapping("/demo")
public class DataDemoController {
    @Qualifier("userInfoServiceImpl")
    @Autowired
    IUserInfoService service;

    @RequestMapping("/getGril.do")
    @ResponseBody
    public List<HashMap<String,Object>> getGril(){
        return service.getGril();
    }

    @RequestMapping("/getTableInfo.do")
    @ResponseBody
        public String getTableInfo(){
        List<Tree> list = service.getTableInfo();
        HashMap map = new HashMap();
        map.put("list",list);
        JSONArray jsonObject = JSONArray.fromObject(list);
        String jsonString = jsonObject.toString();
        return jsonString;
    }
    @RequestMapping("/test.do")
    @ResponseBody
    public String test(){
        return "hello";
    }
    @RequestMapping("/goList.do")
    public ModelAndView goPage(){
        ModelAndView modle = new ModelAndView("/aa.html");
        return modle;
    }
}
