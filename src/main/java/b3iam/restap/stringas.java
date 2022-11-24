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
	
	String ar[]=a.split(" ");
String res="";
String r="";
	for(String s:ar) {
		String S1=s.substring(0,1).toUpperCase();
		String S2=s.substring(1);
		res+=s.charAt(s.length()-1);
		r+=S1+S2;
		
	}
	return res+"<br>"+r;

}
}

	
        
   
