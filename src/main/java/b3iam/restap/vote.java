package b3iam.restap;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;


public class vote {
boolean canvote(int age) {
if(age<18)
	return false;
else
	return true;
	}
	@GET
	@Produces(MediaType.TEXT_HTML)
	@Path("{age}")
public String vote(@PathParam("age")int age) {
	String votingpage="";
	try {
	vote Vote=new vote();
	if(Vote.canvote(age))
		votingpage="<form><input type='radio' name='party'>BJP<br><input type='radio' name='party'>TRS";
	else 
		throw new Exception("u r not eligible");
	return votingpage;
}
	catch(Exception e) {
		votingpage=e.getMessage();
		return votingpage;
}
}}