package b3iam.restap;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;

@Path("/ad")
public class add {
	
	
	@GET
	@Produces("text/plain")
	@Path("add/{x}/{y}")
public String addition(@PathParam("x")int a,@PathParam("y")int b) {
		return "add:"+(a+b);
	}

}
