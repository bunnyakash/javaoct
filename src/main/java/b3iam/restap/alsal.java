package b3iam.restap;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

@Path("al")
public class alsal extends employee {
public String alsa() {
 return salary*12+"";
}
@Produces(MediaType.TEXT_HTML)
@GET
@Path("anl")
public String getemployee() {
alsal al=new alsal();
al.salary=120000;
	
	return al.alsa();
	
	}
}
