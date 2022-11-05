package b3iam.restap;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;


@Path("lch")
public class stringas {
	
			
	
	
	
@Produces(MediaType.TEXT_HTML)
@GET
@Path("lsch/{string}")
public String getlastchar(@PathParam("string")String a) {
  a=a+" ";
  String b =" ";
	for(int i=0;i<a.length();i++) {
		if(a.charAt(i) == ' ') {
		
	b+=a.charAt(i-1)+' '+"";
		}
	}
	return b;
}
}	
	
        
   
