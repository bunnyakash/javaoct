package b3iam.restap;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;


@Path("sl")
public class overriding {
@Produces("text/plain")
@GET
@Path("{sal}")
	public String getsavings(@PathParam("sal")double sal) { 
    child ch=new child();
    return ch.getsavings(sal)+"";
   
}




@Produces("text/plain")
@GET
@Path("{bjh}")
	public String getint(@PathParam("bjh")int x) { 
    child1 ch1=new child1();
    return ch1.getin(x)+"";
   
}
}