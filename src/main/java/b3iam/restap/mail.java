package b3iam.restap;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;


@Path("mal")
public class mail {
	String email(String email) {
		if(email.contains(".") && email.contains("@")) {
			return "email is valid";
		}
		else
			return "email is not valid";
			
	}


@GET
@Produces(MediaType.TEXT_HTML)
@Path("{mail}")
public String getmail(@PathParam("mail")String gmail) {
String mail="";
try {
mail Mail=new mail();
if(gmail.contains(".") && gmail.contains("@"))
	mail="email is valid";

else 
	throw new Exception("email is not  valid");
return mail;
}
catch(Exception e) {
	mail=e.getMessage();
	return mail;
}
}}
