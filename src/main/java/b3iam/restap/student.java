package b3iam.restap;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

@Path("stu")
public class student {
	public int id;
    public String name;
    public String course;
    public int age;
    public static String college;
    
    public String toString() {
        return id+","+name+","+course+","+age+","+college;
    }
    @GET
    @Produces(MediaType.TEXT_HTML)
    @Path("student")
     public String getstudent() {
        student s1= new student();
        student s2= new student();
        
        s1.id=101;
        s1.name="aamani";
        s1.course="M.sc";
        s1.age=25;
        
        s2.id=102;
        s2.name="sravss";
        s2.course="M-tech";
        s2.age=29;
        student.college="Maris stella college";
        
        return   s1 +" <br> "+s2;
        
}

}