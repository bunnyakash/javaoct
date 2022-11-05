package b3iam.restap;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
@Path("tc")
public class typecasting {
	
	
	
@Produces("text/plain")
@GET
@Path("typecast/{y}")
public String cast(@PathParam("y")float b) {
	  int a=(int)b ;
	return a+"";
	
}

}
