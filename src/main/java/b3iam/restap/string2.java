package b3iam.restap;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;


@Path("/hm")
public class string2 {
	
	
	
@Produces(MediaType.TEXT_HTML)
@GET
@Path("upcase/{str}")
public String ak(@PathParam("str")String name) {
	String capi=name.toUpperCase();
	return capi;
}


@Produces("text/plain")
@GET
@Path("lowcase/{str}")
public String low(@PathParam("str")String name) {
String lowe=name.toLowerCase();
return lowe;
}


@Produces("text/plain")
@GET
@Path("len/{str}")
public String leng(@PathParam("str")String name) {
	String len=name.length()+"";
	return len;
}

@Produces("text/plain")
@GET
@Path("subs/{str}")
public String sub(@PathParam("str")String name) {
	String subs=name.substring(name.length()-1);
return subs;
}

@Produces(MediaType.TEXT_HTML)
@GET
@Path("replace/{s},{s1},{s2}")
public String replace(@PathParam("s")String s,@PathParam("s1")String s1,@PathParam("s2")String s2) {
	return "<font size=10px>"+s.replace(s1, s2)+"</font>";
}

@Produces(MediaType.TEXT_HTML)
	@GET
	@Path("index/{string}")
public String getindexof(@PathParam("string")String name) {
	String in="abcdefghijklmnopqrstuvwxyz";
    String inds="";
    @SuppressWarnings("unused")
	int count=0;
    for(int i=0;i<in.length();i++) {
        inds+=name.indexOf(in.charAt(i))+"";
    }
    return inds;
}

 
@Produces(MediaType.TEXT_HTML)
@GET
@Path("split/{string}|{by}")
public String getsplitof(@PathParam("string")String name,@PathParam("by")String by) {
	String ar[]=name.split(by);
	String split="";
	for(int i=0;i<ar.length;i++) {
		if(i==ar.length-1)
			split+=ar[i];
		else
			split+=ar[i]+"<br>";
	}
	return split;
}
}