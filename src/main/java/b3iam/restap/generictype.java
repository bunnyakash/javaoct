package b3iam.restap;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

public class generictype<A> {
	A x;
	A ar[];
	public String getType() {
		if(x instanceof Integer)
			return "int";
		else if(x instanceof Float)
			return "decimal number";
		else if(x instanceof String)
			return "text";
		else
			return "---";
	}
	
	public void createArray(A... values) {
		ar=values;
	}
	
	public A[] readArray() {
		return ar;
	}
	@GET
	@Path("t_array")
	@Produces(MediaType.TEXT_HTML)
	public String getArrayValues() {
		generictype<Float> inst=new generictype<Float>();
		inst.createArray(56.8f,69.9f,58.4f,36.3f);
		String s="";
		for(Float i:inst.readArray())
			s+=i+",";
		return s;
		
	}
	
	@GET
	@Path("type")
	@Produces(MediaType.TEXT_HTML)
	public String type() {
		generictype<Float> inst=new generictype<Float>();
		//inst.x=0.0f;
		return inst.getType();
	}
}
	



