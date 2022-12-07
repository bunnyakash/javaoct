/*package b3iam.restap;


import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
@Path("priv")
public class privatevar {
int id;
String name;
private double sal;

privatevar(){
	id=0;
	name="name";
	sal=0;
}
privatevar(int x,String y,int z){
	id=1;
	name="akash";
	sal=14566;
}
public double getsal() {
	return sal;
}
public void setsal(double sal) {
	this.sal=sal;
}
@GET
@Produces(MediaType.TEXT_HTML)
@Path("sala/{salll}")
public String getprivatevar(@PathParam("salll")String sal) {
	privatevar pv=new privatevar();
	return pv.getprivatevar(sal)+"<br>";
}
}*/