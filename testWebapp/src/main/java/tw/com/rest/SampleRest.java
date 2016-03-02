package tw.com.rest;

import javax.ws.rs.GET;
import javax.ws.rs.Path;

import org.glassfish.jersey.server.mvc.Viewable;

@Path("/sample")
public class SampleRest {


  @GET
  public Viewable init() {
    return new Viewable("/sample");
  }
}
