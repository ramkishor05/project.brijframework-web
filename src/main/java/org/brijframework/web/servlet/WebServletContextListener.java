package org.brijframework.web.servlet;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;
import javax.servlet.annotation.WebListener;

import org.brijframework.web.app.WebContext;
import org.brijframework.web.app.WebContextListener;
import org.brijframework.web.util.ReflectUtil;

@WebListener
public final class WebServletContextListener implements ServletContextListener {

  private Map<Class<?>,WebContext> webServletContexts;
  
  private Map<Class<?>,WebContextListener> webServletListener;

  public WebServletContextListener() {
    this.initialized();
  }

  private void initialized() {
    this.webServletContexts = new HashMap<>();
    this.webServletListener = new HashMap<>();
    try {
      ReflectUtil.getAssignableList(WebContext.class).forEach(cls -> {
          this.webServletContexts.put(cls,getAssignable(cls));
      });
      ReflectUtil.getAssignableList(WebContextListener.class).forEach(cls -> {
        this.webServletListener.put(cls,getAssignable(cls));
      });
    } catch (Exception e) {
      e.printStackTrace();
    }
  }

  @Override
  public void contextInitialized(ServletContextEvent contextEvent) {
    for(Entry<Class<?>,WebContext> entry:webServletContexts.entrySet()){
      WebContext context = getAssignable(entry.getKey());
      entry.setValue(context);
      if(context==null){
        continue;
      }
      initialized(context);
      context.start(contextEvent.getServletContext());
    }
  }
  
  @SuppressWarnings("unchecked")
  private <T>T getAssignable(Class<?> cls){
    try {
      return (T)cls.newInstance();
    } catch (InstantiationException | IllegalAccessException e) {
      e.printStackTrace();
    }
    return null;
  }
  
  private void initialized(WebContext context){
    for(Entry<Class<?>,WebContextListener> entry:webServletListener.entrySet()){
      WebContextListener listener = getAssignable(entry.getKey());
      entry.setValue(listener);
      if(listener==null){
        continue;
      }
      listener.initialized(context);
    }
  }
  
  private void destroyed(WebContext context){
    for(Entry<Class<?>,WebContextListener> entry:webServletListener.entrySet()){
      WebContextListener listener = entry.getValue();
      if(listener!=null){
       listener.destroyed(context);
      }
    }
  }

  @Override
  public void contextDestroyed(ServletContextEvent contextEvent) {
    for(Entry<Class<?>,WebContext> entry:webServletContexts.entrySet()){
      WebContext context = entry.getValue();
      if(context==null){
        continue;
      }
      destroyed(context);
      context.stop(contextEvent.getServletContext());
    }
  }

}
