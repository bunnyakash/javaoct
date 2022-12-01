package b3iam.restap;

import java.sql.Connection;
import java.util.ArrayList;
import java.util.List;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import java.sql.*;

@Path("conn")

public class connectingdatabse {
	        	public Connection c;
	        	public connectingdatabse() {
	        		try {
	        			Class.forName("com.mysql.jdbc.Driver");
	        			System.out.println("driver is ok");
	        			c=DriverManager.getConnection("jdbc:mysql://localhost:3306/javadb?enabledTLSProtocols=TLSv1.2", "root", "root7013");
	        			System.out.println("connected");
	        		} catch (Exception e) {
	        			// TODO Auto-generated catch block
	        			e.printStackTrace();
	        		}
	        	}
	        	@GET
	        	@Path("connect_db")
	        	@Produces(MediaType.TEXT_HTML)
	        	public String connectToDatabase() {
	        		try {
	        			connectingdatabse db=new connectingdatabse();
	        			return "connected";
	        		} catch (Exception e) {
	        			// TODO Auto-generated catch block
	        			return e.getMessage();
	        		}
	        	}
	        	

public void insert(int eid,String ename,int sal,int did,int managerid){
	int bonus=sal*15/100;
	String sql="insert into employee values(?,?,?,?,?,?)";
	PreparedStatement ps;
	try {
		ps = c.prepareStatement(sql);
		ps.setInt(1, eid);
		ps.setString(2, ename);
		ps.setInt(3, sal);
		ps.setInt(4, bonus);
		ps.setInt(5, did);
		ps.setInt(6, managerid);
		ps.execute();
	} catch (Exception e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
}

public List<Emps> readAllEmps(){
	PreparedStatement ps;
	try {
		ps = c.prepareStatement("select * from emp");
		ResultSet rs=ps.executeQuery();
		List<Emps> emps=new ArrayList<>();
		while(rs.next()) {
			emps.add(new Emps(rs.getInt(1), rs.getString(2), rs.getInt(3), rs.getInt(4), rs.getInt(5), rs.getInt(6)));
		}
		return emps;
	} catch (Exception e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
		return null;
	}
}
	
	public String readAllEmpsAsString(){
		PreparedStatement ps;
		try {
			ps = c.prepareStatement("select * from employee");
			ResultSet rs=ps.executeQuery();
			List<Emps> emps=new ArrayList<>();
			while(rs.next()) {
				emps.add(new Emps(rs.getInt(1), rs.getString(2), rs.getInt(3), rs.getInt(4), rs.getInt(5), rs.getInt(6)));
			}
			return emps.toString();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			return null;
		}
	
}



@GET
@Path("insert/{id},{name},{sal},{dep},{mgr}")
@Produces(MediaType.TEXT_HTML)
public String insert1(@PathParam("id")int eid,@PathParam("name")String ename,@PathParam("sal")int sal,@PathParam("dep")int did,@PathParam("mgr")int managerid) throws SQLException {
	connectingdatabse daba=new connectingdatabse();
	if(daba.c==null)
		return "not connected";
	else {
		daba.insert(eid, ename, sal, did, managerid);
		return "data saved";
	}
	/**/
}

@GET
@Path("read_all_emps")
@Produces(MediaType.APPLICATION_JSON)
public List<Emps> getAllEmps(){
	connectingdatabse db=new connectingdatabse();
	return db.readAllEmps();
}

@GET
@Path("read_all_emps_string")
@Produces(MediaType.TEXT_HTML)
public String getAllEmpsAsString(){
	connectingdatabse db=new connectingdatabse();
	return db.readAllEmpsAsString();
}


public void insert11(int id,String name,int marks){

	String sql="insert into studs values(?,?,?)";
	PreparedStatement ps;
	try {
		ps=c.prepareStatement(sql);
		ps.setInt(1, id);
		ps.setString(2, name);
		ps.setInt(3, marks);
		
		
		ps.execute();
		
	} catch (Exception e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
}
@GET
@Path("insert_student/{id}/{name}/{marks}")
@Produces(MediaType.TEXT_HTML)
public String insert2(@PathParam("id")int id,@PathParam("name")String name,@PathParam("marks")int marks) throws SQLException {
	connectingdatabse db=new connectingdatabse();
	if(db.c==null)
		return "not connected";
	else {
		db.insert11(id,name,marks);
		return "data saved";
	}
}

}
    