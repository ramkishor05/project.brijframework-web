package org.brijframework.web.util;

import java.util.Enumeration;
import java.util.LinkedHashMap;
import java.util.Map;

import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServletRequest;

public class HttpUtil {
  
  public static Map<String,Object> getParamaterMap(HttpServletRequest request){
    Map<String,Object> paramaters=new LinkedHashMap<>();
    Enumeration<String> enumuration =request.getParameterNames();
    while (enumuration.hasMoreElements()) {
      String key = enumuration.nextElement();
      paramaters.put(key, request.getParameter(key));
    }
    return paramaters;
  }
  
  public static Map<String,Object> getAttributeMap(HttpServletRequest request){
    Map<String,Object> attributes=new LinkedHashMap<>();
    Enumeration<String> enumuration =request.getAttributeNames();
    while (enumuration.hasMoreElements()) {
      String key = enumuration.nextElement();
      attributes.put(key, request.getAttribute(key));
    }
    return attributes;
  }
  
  public static Cookie findCookie(HttpServletRequest request, String key){
    for (Cookie cookie:request.getCookies()) {
      if(cookie.getName().equals(key)){
        return cookie;
      }
    }
    return null;
  }
}
