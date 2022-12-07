package b3iam.restap;


import java.util.Arrays;
import java.util.Collections;
import java.util.List;


import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
@Path("arrlis")
public class listalpha {
	/*public List<String> addvalues(String...name){
	List<String> list=Arrays.asList(name);
	return list;
	}*/

	@GET
	@Produces(MediaType.TEXT_HTML)
	@Path("alpha/{list_name}")
	public String getlistalpha(@PathParam("list_name")String name) {
	        Character ch[]=new Character[name.length()];
	        int i=0;
	        for(char cha:name.toCharArray())
	        ch[i++]=cha;
	        List<Character> list=Arrays.asList(ch);
	        Collections.shuffle(list);
	      
	        String st="";
	        for(char cha:list)
	        	st+=cha;
	        return st;
}
 
	}



