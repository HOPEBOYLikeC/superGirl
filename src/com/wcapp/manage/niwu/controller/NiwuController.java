package com.wcapp.manage.niwu.controller;

import com.alibaba.fastjson.JSONObject;
import com.wcapp.manage.base.BaseController;
import org.apache.log4j.Logger;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import util.IndustrySMS;


@Controller
@RequestMapping("/niwu")
public class NiwuController extends BaseController {
    private static Logger logger = Logger.getLogger(NiwuController.class);

    /**
     * 手机验证码接口
     */
    @RequestMapping("/checkPhone")
    @ResponseBody
    public String checkPhoneController(String phone){

        System.out.println("请求果老了");
        return tojsonString(IndustrySMS.execute(phone));
    }
}
