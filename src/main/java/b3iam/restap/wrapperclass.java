package b3iam.restap;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

@Path("xh")
public class wrapperclass {
    @Produces(MediaType.TEXT_HTML)
    @GET
    @Path("{cu}")
    public String wrap(@PathParam("cu")int x) {
        Integer xob=new Integer(x);
        String res=xob.toString()+"<br>"+xob.floatValue()+"<br>"+Integer.toBinaryString(x)    ;
        return "<font size=10px>"+res+"</font>";
        
        }



}



