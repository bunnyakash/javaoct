package b3iam.restap;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;


@Path("varar")
public class varargs {
	public int add(String... x) {
        int sum=0;
        for (String n:x) {
            sum+=Integer.parseInt(n);
             
    }
        return sum;
    



}

	
	@Produces(MediaType.TEXT_HTML)
	@GET
	@Path("z/{values}")
	public String getz(@PathParam("values")String values) {
	    String[] vals=values.split(",");
	varargs va=new varargs();
	return va.add(vals)+"";
	}
	}


