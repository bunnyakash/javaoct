package b3iam.restap;


import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
@Path("map")
public class mapping {
	
@GET
@Produces(MediaType.TEXT_HTML)
@Path("marks_map")
	public String getmarks() {
int n1=((67+75+98)/3);
int n2=((62+79+86)/3);
int n3=((65+84+95)/3);
		Map<Integer,Float>map=new HashMap<>();
		
		
		map.put(101,(float)n1);
		map.put(102, (float)n2);
		map.put(103, (float)n3);
	
		String s="";
		for(Entry<Integer, Float> entry:map.entrySet())
			s+=entry.getKey()+":"+entry.getValue()+"<br>";
		return s;
		
	}
}
