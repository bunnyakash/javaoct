package b3iam.restap;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

@Path("sq")
public class constructors {

	int n;
	public constructors(){ 
		n=0;
	}
		public constructors(int n){
       this.n=n;	
	}
public  int square() {
	return n*n;
}
@Produces(MediaType.TEXT_HTML)
@GET
@Path("square/{n}")
public String getsquare(@PathParam("n")int n){
constructors num2=new constructors(n+10);
return num2.square()+"";
}
}

