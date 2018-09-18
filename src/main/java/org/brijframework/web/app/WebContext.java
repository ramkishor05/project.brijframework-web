package org.brijframework.web.app;

import javax.servlet.ServletContext;
import javax.servlet.ServletRegistration;

public class WebContext{

  public void start(ServletContext context) {
    WebController controller = new WebController();
    ServletRegistration.Dynamic dispatcher = context.addServlet("controller", controller);
    dispatcher.addMapping("/");
    dispatcher.setLoadOnStartup(1);
    System.out.println("start colled");
  }
  
  public void stop(ServletContext context) {
    System.out.println("stop colled");
  }
}
