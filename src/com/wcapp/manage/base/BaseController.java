package com.wcapp.manage.base;

import com.wcapp.manage.user.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import util.FastJsonUtil;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

public class BaseController extends FastJsonUtil{
    @Autowired
    protected UserService userService;

    @Autowired
    protected HttpServletRequest request;

    public void setReqAttribute(String name, Object value) {
        this.request.setAttribute(name, value);
    }

    public Object getReqValue(String name) {
        return this.request.getAttribute(name);
    }

    public String setSessionAttribute(String name, Object value) {
        HttpSession session = this.request.getSession();
        session.setAttribute(name, value);
        return session.getId();
    }

    public Object getSessionValue(String name) {
        HttpSession session = this.request.getSession(false);
        session = session == null ? this.request.getSession() : session;
        return session == null ? null : this.request.getSession().getAttribute(name);
    }


}
