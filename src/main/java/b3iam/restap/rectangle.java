package b3iam.restap;

import javax.ws.rs.GET;
import javax.ws.rs.Path;

import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

@Path("recarea")
public class rectangle extends shapearea {
	double  area(double s1,double s2) {
		return  s1*s2;
	}
@Produces(MediaType.TEXT_HTML)
@GET
@Path("recta")
	public String rectanglearea(){
		rectangle rec=new rectangle();
	
	return rec.area(10,20)+"";
}
}