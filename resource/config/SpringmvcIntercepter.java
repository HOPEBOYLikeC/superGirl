package config;

import org.springframework.web.method.HandlerMethod;
import org.springframework.web.servlet.handler.HandlerInterceptorAdapter;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.util.Enumeration;

public class SpringmvcIntercepter extends HandlerInterceptorAdapter {
    @Override
    public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler) throws Exception {
        String url = request.getRequestURI().toString();
        System.out.println(System.getProperty("line.separator") + "* 请求路径 *：" + url);
        /************************************ 调试【获取参数，值】 ***********************************/
        if (url.indexOf("127.0.0.1") != -1 || url.indexOf("localhost") != -1) {
            if (handler instanceof HandlerMethod) {
                HandlerMethod method = (HandlerMethod) handler;
                String clsName = method.getBean().getClass().getName();
                String clsMethod = method.getMethod().getName();
                System.out.println(clsName + " : " + clsMethod);
                Enumeration<String> enu = request.getParameterNames();
                int k = 0;
                while (enu.hasMoreElements()) {
                    k += 1;
                    if (k == 1) {
                        System.out.println("**********************请求参数名及值***********************");
                    }
                    String name = (String) enu.nextElement();
                    System.out.println(name + ": " + request.getParameter(name));
                }
            }
        }
        return true;
    }
}
