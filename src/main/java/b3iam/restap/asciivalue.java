package b3iam.restap;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
@Path("aka")
public class asciivalue {
	@Produces("text/plain")
	@GET
	@Path("asc/{AB}")
	public String getascii(@PathParam("AB")String c) {
		char[] ar=c.toCharArray();
		String s="";
		for(int i=0;i<ar.length;i++) {
			int n=(int)ar[i];
			s+=n+" ";
		}
		
		return s;

}
}

