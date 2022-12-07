package b3iam.restap;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

@Path("xyz")
public class assignvaluesub implements assignvalueinter {
int val=30;

@GET
@Produces(MediaType.TEXT_HTML)
@Path("supsub")
public String getassignvalsub() {
	assignvaluesub sa=new assignvaluesub();
	assignvalueinter ai=sa;
	return sa.val+"<br>"+ai.val;
}
}