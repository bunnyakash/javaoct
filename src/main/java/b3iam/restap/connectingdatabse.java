package b3iam.restap;

import java.sql.Connection;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import java.sql.*;

@Path("conn")

public class connectingdatabse {
	 public static Connection connect() {
	        try {
	            Class.forName("com.mysql.jdbc.Driver");
	            Connection c=DriverManager.getConnection("jdbc:mysql://localhost:3306/Login", "root", "Arathi@123");
	            return c;
	        } catch (Exception e) {
	            // TODO Auto-generated catch block
	            e.printStackTrace();
	           return null;
	        }
	 }
  
@GET
@Path("connect_db")
@Produces(MediaType.TEXT_HTML)
public String connectToDatabase() {
        try {
            Connection c=connectingdatabse.connect();
            return "connected";
    } catch (Exception e) {
        // TODO Auto-generated catch block
        return e.getMessage();
}
}}

    