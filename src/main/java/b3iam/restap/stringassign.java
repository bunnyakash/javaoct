package b3iam.restap;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

@Path("uca")
public class stringassign {


@Produces(MediaType.TEXT_HTML)
@GET
@Path("{str}")
public String firstworduc(@PathParam("str")String s) {
String words[]=s.split("\\s");	
String s1="";
for(String w:words) {
String S1=w.substring(0,1);
String S2=w.substring(1);
s1+=S1.toUpperCase()+S2+" ";
}
return s1;
}

    @Produces(MediaType.TEXT_HTML)
    @GET
    @Path("wc/{string}")
    public String getWC(@PathParam("string")String c) {
        @SuppressWarnings("unused")
		int length=c.length();
        int count =1;
         for (int i = 0; i < c.length() - 1; i++) {
               if ((c.charAt(i) == ' ') && (c.charAt(i + 1) != ' ')) {
        count=count+1;
               }
}
        return count+"";
    }
} 
        
        
