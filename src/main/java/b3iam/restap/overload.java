package b3iam.restap;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
@Path("bn")
public class overload {
		public int add(int x,int y) {
			return x+y;
		}
		
		public float add(int x,float y) {
			return x+y;
		}
		
		public float add(float x,float y) {
			return x+y;
		}

	
@Produces(MediaType.TEXT_HTML)
@GET
@Path("sum_int/{x},{y}")
public String addNums(@PathParam("x")int x,@PathParam("y")int y) {
	overload ov=new overload();
	return ov.add(x, y)+"";
}

@Produces(MediaType.TEXT_HTML)
@GET
@Path("sum_int_float/{x},{y}")
public String addNums(@PathParam("x")int x,@PathParam("y")float y) {
	overload lo=new overload();
	return lo.add(x, y)+"";
}
@Produces(MediaType.TEXT_HTML)
@GET
@Path("sum_float/{x},{y}")
public String addNums(@PathParam("x")float x,@PathParam("y")float y) {
	overload vl=new overload();
	return vl.add(x, y)+"";
}
}