package tw.com.rest;

import java.net.URI;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.core.Response;


@Path("/member")
public class MemberRest {


  /**
   * @return
   * @throws Exception
   */
  @GET
  public Response aaa() throws Exception {
    URI uri = URI.create("sample");
    return Response.seeOther( uri ).build();
  }
}
