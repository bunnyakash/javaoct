package b3iam.restap;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

@Path("xh")
public class wrapperclass<intvalue> {
    @Produces(MediaType.TEXT_HTML)
    @GET
    @Path("{cu}")
    public String wrap(@PathParam("cu")int x) {
        Integer xob=new Integer(x);
        String res=xob.toString()+"<br>"+xob.floatValue()+"<br>"+Integer.toBinaryString(x)    ;
        return "<font size=10px>"+res+"</font>";
        
        }

   @Produces(MediaType.TEXT_HTML)
    @GET
    @Path("prim/{y1}")
    public String wrap1(@PathParam("y1")Integer y) {
    Integer yob=y.intValue();
    return yob.toBinaryString(y);
    }

   @Produces(MediaType.TEXT_HTML)
   @GET
   @Path("pars/{z}")
public String wrap2(@PathParam("z")String z) {
	int zob=Integer.parseInt("z");
	return zob+"";
}
}



