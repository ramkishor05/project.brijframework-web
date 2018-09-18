package org.brijframework.web.app;

public class WebContextListener{
 
  public void initialized(WebContext context) {
       System.out.println("initialized - "+context);
  }
  public void destroyed(WebContext context) {
       System.out.println("destroyed - "+context);
  }
}
