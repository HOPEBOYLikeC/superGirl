package com.wcapp.manage.user.controller;

import com.alibaba.fastjson.JSONObject;
import com.wcapp.manage.base.BaseController;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;
import java.util.Map;
import org.apache.log4j.Logger;
import util.Contant;

@Controller
@RequestMapping("/user")
public class UserController extends BaseController{
    private static Logger logger = Logger.getLogger(UserController.class);

    /**
     * 用户列表接口
     * @return
     */
    @RequestMapping("/list")
    @ResponseBody
    public String listController(){
        JSONObject result=new JSONObject();
        try {
            List<Map<?, ?>> maps = userService.selectAll();
            result.put("userList", maps);
        }catch (Exception e){
            result.put("message",Contant.OPT_FAIL_MSG);
            e.printStackTrace();
            logger.error("user列表出错[UserController.listController()].", e);
        }
        return tojsonString(result);
    }

    /**
     * person接口
     */
    @RequestMapping("/person")
    @ResponseBody
    public String personShowController(){
        JSONObject result = new JSONObject();
        try{
            List<Map<?, ?>> personShow = userService.personShow();
            result.put("personList",personShow);
        }catch (Exception e){
            result.put("message", Contant.OPT_FAIL_MSG);
            e.printStackTrace();
            logger.error("person接口出错[UserController.personShowController()].", e);
        }

        return tojsonString(result);
    }


}
