package b3iam.restap;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

@Path("incl")
public class innerclasses {
	int kk=77;
	class Inner{
		int x=25;
	}
	static class Inner2{
		int n=555;
	}
	
	int getInt() {
		class Inner3{
			int p=150;
		}
		Inner3 in3=new Inner3();
		return in3.p;
	}


@GET
@Path("innercl")
@Produces(MediaType.TEXT_HTML)
public String getInnerVar() {
	innerclasses out=new innerclasses();
	innerclasses.Inner in=out.new Inner();//for non-static inner class
	innerclasses.Inner2 in2=new innerclasses.Inner2();//for static inner class
	Iouter.inner iin=new Iouter.inner();//inner class in interface is by default static
	return in.x+"<br>"+in2.n+"<br>"+out.getInt()+"<br>"+iin.x;
}
}
