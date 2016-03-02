package tw.com.jersey.app;

import org.glassfish.jersey.server.ResourceConfig;
import org.glassfish.jersey.server.mvc.jsp.JspMvcFeature;

public class MyApplication extends ResourceConfig {

  public MyApplication() {

    // Resources.
    packages("tw.com.rest");
    // MVC.
    register(JspMvcFeature.class);
    // JSP
    property(JspMvcFeature.TEMPLATE_BASE_PATH, "/WEB-INF/jsp");
  }
}
