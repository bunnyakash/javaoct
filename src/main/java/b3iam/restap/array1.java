package b3iam.restap;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
@Path("ak")
public class array1 {

	
	@Produces(MediaType.TEXT_HTML)
	@GET
	@Path("array")
	public String getarray() {
		String a[]= {"hyd","sec","ap","aus","sa","nz"};
				String s="";
		for(int i=0;i<a.length;i++)
			s+=a[i]+"<br>";
			return s;
			
	}
@Produces(MediaType.TEXT_HTML)
@Path("GETSTUD")
@GET
public String getstudarray() {
	studs arr[]=new studs[6];
	int ids[]= {101,102,103,104,105,106};
	String names[]={"akash","arr","ish","ysys","sgw","rwt"};
	String courses[]= {"java","sp","py","rjs","iam","ds"};
	int ages[]= {23,24,25,26,27,28};
	
	String s="<table border=5><tr><th>Id</th><th>Name</th><th>Course</th><th>Age</th><th>College</th></tr>\";\r\n" + 
			"";
	for(int i=0;i<arr.length;i++) {
		arr[i]=new studs();
		arr[i].id=ids[i];
		arr[i].name=names[i];
		arr[i].course=courses[i];
		arr[i].age=ages[i];
		studs.college="iaas";
        s+="<tr><td>"+arr[i].id+"</td><td>"+arr[i].name+"</td><td>"+arr[i].course+"</td><td>"+arr[i].age+"</td><td>"+studs.college+"</tr>";

		
	}
	return s;
	
}
	@Produces(MediaType.TEXT_HTML)
	@GET
	@Path("em")
	public String getemployeearray() {
	employee arr[]=new employee[3];
	String names[]= {"AKASH","BUNNY","IRFAN"};
	int ids[]= {12,13,14};
	double salaries[]= {20334,53637,77733};
	String s="";
	for(int i=0;i<arr.length;i++) {
		arr[i]=new employee();
		arr[i].id=ids[i];
		arr[i].salary=salaries[i];
		arr[i].name=names[i];
		s+=arr[i].id+","+arr[i].salary+","+arr[i].name+"<br>";
	}
	return s;
	}
		
		
	@Produces(MediaType.TEXT_HTML)
	@GET
	@Path("mul")

	
	
public String getaray() {
int a[]=new int[5];	

a[0]=10;
a[1]=10*2;
a[2]=10*3;
a[3]=10*4;
a[4]=10*5;
String s="";
for(int i=0;i<a.length;i++) {
s+=a[i]+"<br>";	
}
	return s;
}}