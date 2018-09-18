package org.brijframework.web.servlet;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.brijframework.web.enums.HttpMethod;

public abstract class WebHttpServlet extends HttpServlet {

  /**
   * 
   */
  private static final long serialVersionUID = 1L;

  @Override
  protected void doHead(HttpServletRequest request, HttpServletResponse response)
      throws ServletException, IOException {
      this.doHandler(request, response,HttpMethod.HEAD);
  }
  
  @Override
  protected void doGet(HttpServletRequest request, HttpServletResponse response)
      throws ServletException, IOException {
    this.doHandler(request, response,HttpMethod.GET);
  }

  @Override
  protected void doPost(HttpServletRequest request, HttpServletResponse response)
      throws ServletException, IOException {
    this.doHandler(request, response,HttpMethod.POST);
  }
  
  @Override
  protected void doPut(HttpServletRequest request, HttpServletResponse response)
      throws ServletException, IOException {
    this.doHandler(request, response,HttpMethod.PUT);
  }
  
  @Override
  protected void doDelete(HttpServletRequest request, HttpServletResponse response)
      throws ServletException, IOException {
    this.doHandler(request, response,HttpMethod.DELETE);
  }

  @Override
  protected void doTrace(HttpServletRequest request, HttpServletResponse response)
      throws ServletException, IOException {
      this.doHandler(request, response,HttpMethod.TRACE);
  }
  
  @Override
  protected void doOptions(HttpServletRequest request, HttpServletResponse response)
      throws ServletException, IOException {
    this.doHandler(request, response,HttpMethod.OPTIONS);
  }

  public abstract void doHandler(HttpServletRequest request, HttpServletResponse response,HttpMethod method);
}
