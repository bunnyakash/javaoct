package b3iam.restap;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

@Path("lv")
public class generictype<A> {
	A x;
	A ar[];
	public String getType() {
		if(x instanceof Integer)
			return "int";
		else if(x instanceof Float||x instanceof Double)
			return "decimal number";
		else if(x instanceof String)
			return "text";
		else
			return "---";
	}
	
	public void createArray(@SuppressWarnings("unchecked") A... values) {
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
		generictype<Object> inst=new generictype<Object>();
		inst.x=123.23f;
		return inst.getType();
	}
}
	



