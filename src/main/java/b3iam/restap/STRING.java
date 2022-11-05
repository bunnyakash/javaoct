package b3iam.restap;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
@Path("br")
public class STRING {




	@Produces(MediaType.TEXT_HTML)
	@GET
	@Path("{str}")
	public String stringOp(@PathParam("str")String s) {
		int length=s.length(); //number of chars
		String cap=s.toUpperCase(); //to cap

	String low=s.toLowerCase();
		int ind=7;
		char d='*';
		if(ind<length)
			d=s.charAt(7);
		
		char c=s.charAt(0);
		String res=(c+"").toUpperCase()+s.substring(1);
		int start=3,end=6;
		String s4="";
	if(start<length&&end<length)
		s4=s.substring(start,end);
String s2=(c+"")+s.substring(3,6);
String s3=(c+"")+s.substring(length-3,length).toUpperCase();
String replace=s.replace("bad", "nagar");
String s5="identity and access solutions";
String ar[]=s5.split("");
String split="";
for(int i=0;i<ar.length;i++) {
	if(i==ar.length-1)
		split+=ar[i];
	else
		split+=ar[i]+",";
}
String inp="ah";
String inds="";
for(int i=0;i<inp.length();i++)
    inds+=s.indexOf(inp.charAt(i))+" "; //to get index of given char

 return "<br>"+s2+"<br>"+length+"<br>"+cap+"<br>"+low+"<br>"+s3+"<br>"+res+"<br>"+s4+"<br>"+inds+"<br>"+d+"<br>"+inp+"<br>"+replace+"<br>"+split;	
		
	}

@Produces(MediaType.TEXT_HTML)
@GET
@Path("st/{string}")
public String getvowels(@PathParam("string")String s) {
    
    String in="oieua";
    String inds="";
    int count=0;
    for(int i=0;i<in.length();i++) {
        inds+=s.indexOf(in.charAt(i))+"";
    }
    for(int i=0;i<s.length();i++) {
        char c=s.charAt(i);
        if(c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u') {
            count++;
        }
            
    }
    
    return "index of vowels: "+inds+"<br>"+"number of vowels in the given string is: "+count;
}
@Produces("text/plain")
@GET
@Path("vw/{str}")
public String getvow(@PathParam("str")String s) {
String vowels="";
for(int i=0;i<s.length();i++) {
    char c=s.charAt(i);
    if(c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u') {
        
        vowels+=Character.toUpperCase(s.charAt(i));
    }
    
    else
        vowels+=s.charAt(i);
            
}
return vowels;        
}
}
    





