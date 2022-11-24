package b3iam.restap;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

public abstract class shape {

	public abstract float area(float x);
	public String drawnBy(String name) {
		return "drawn by "+name;
	}

	
@GET
@Path("area/{x}/{name}")
@Produces(MediaType.TEXT_HTML)
public String accessAbstract(@PathParam("x")float x,@PathParam("name")String name) {
	shape circle=new shape() {
		
		@Override
		public float area(float x) {
			// TODO Auto-generated method stub
			return 3.14f*x*x;
		}
	};
	
	shape square = new shape() {
		
		@Override
		public float area(float x) {
			// TODO Auto-generated method stub
			return x*x;
		}
	};
	
	String res="circle area:"+circle.area(x)+"<br>"+"square area:"+square.area(x)+"<br>"+circle.drawnBy(name)+"<br>"+square.drawnBy(name);
	return res;
}
}
