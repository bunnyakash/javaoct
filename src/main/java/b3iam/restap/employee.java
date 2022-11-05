package b3iam.restap;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

@Path("em")
public class employee { 
	public String name;
	public int id;
	public double salary;
	public double annualsalary;
public String s;
public String toString() {
	return name+","+id+","+salary+","+annualsalary;

}
@GET
@Produces(MediaType.TEXT_HTML)
@Path("empsal")
public String iaas() {
 employee i1=new employee();
 employee i2=new employee();
  
 
 i1.name="akash";
 i1.id=101;
 i1.salary=400538;
 i1.annualsalary=i1.salary*12;
 
 i2.name="bunny";
 i2.id=102;
 i2.salary=639008;
 i2.annualsalary=i2.salary*12;
return i1+"<br>"+i2;
}
}
		 
 
 
 
 





