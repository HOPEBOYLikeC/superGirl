package com.wcapp.manage.base;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class NavigationController extends BaseController {

    @RequestMapping("/index")
    public String indexPage() {
        return "index";
    }

    @RequestMapping("/about-us")
    public String aboutusPage() {
        return "about-us";
    }

    @RequestMapping("/case-inform")
    public String caseinformPage() {
        return "case-inform";
    }

    @RequestMapping("/customer-case")
    public String customercasePage() {
        return "customer-case";
    }

    @RequestMapping("/news")
    public String newsPage() {
        return "news";
    }

    @RequestMapping("/news-inform")
    public String newsinformPage() {
        return "news-inform";
    }

    @RequestMapping("/product-show")
    public String productshowPage() {
        return "product-show";
    }

    @RequestMapping("/recruit")
    public String recruitPage() {
        return "recruit";
    }

    @RequestMapping("/service-center")
    public String servicecenterPage() {
        return "service-center";
    }

    @RequestMapping("/solutions")
    public String solutionsPage() {
        return "solutions";
    }

    @RequestMapping("/solutions-inform")
    public String solutionsinformPage() {
        return "solutions-inform";
    }

    @RequestMapping("/superwomen")
    public String superPage(){
        return "superwomen.html";
    }
}
