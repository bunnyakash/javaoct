package b3iam.restap;

import java.sql.DriverManager;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import java.sql.Connection;
@Path("enu")
public class trainne {
	@GET
	@Produces(MediaType.TEXT_HTML)
	@Path("signal/{color}")
	public String getsignal(@PathParam("color")String color) {
		
			int code=0;
		 String text="";
		 String result="";
	 signal sign=signal.valueOf(color.toUpperCase());
			try{
				for(int i=0;i<4;i++) {
				code+=(int)color.toUpperCase().charAt(i);
			}
		switch(sign){
		case RED:
			text="<font color='red' size=10px>";
			break;
		case GREEN:
			text="<font color='green' size=10px>";
					break;
		case YELLOW:
			text="<font color='yellow' size=10px>";
			break;
		default:
			text="<font color='green' size=10px>";
		}
		
		result=text+sign.toString()+":"+sign.action+":"+sign.time+":"+code+"</font>";
		return result;
	}
	catch(IllegalArgumentException ex) {
		result="<font color='"+color+"' size=10px>The given signal color is not valid</font>";
		return result;
	}
	catch(StringIndexOutOfBoundsException ex) {
		text="<font color='"+color+"' size=10px>";
		result=text+sign.toString()+":"+sign.action+":"+sign.time+":"+code+"</font>";
		return result;
		
	}
	catch(Exception ex) {
		return "";
	}
	/*finally {
		text="<font color='"+color+"' size=10px>";
		result=text+"thank u"+"</font>";
		return result;
	}*/
	
}

@GET
@Path("all_signals")
@Produces(MediaType.TEXT_HTML)
public String getAllSignals() {
	String allSig="";
	for(signal sig:signal.values())
		allSig+=sig.toString()+"<br>";
	return allSig;
}




@GET
@Produces(MediaType.TEXT_HTML)
@Path("temp/{seasons}")
public String getseasons(@PathParam("seasons")String seasons) {
	String deg="";
	seasontemp set=seasontemp.valueOf(seasons);
	switch(set) {
	case SUMMER:
		deg="40";
		break;
	case WINTER:
		deg="18";
		break;
	case RAINY:
		deg="30";
		break;
		default:
			deg="0";
	}		
	return set.toString()+"<br>"+set.degrees;		
			
			
}

/*@GET
@Produces(MediaType.TEXT_HTML)
@Path("ary/{lambda}")
public String doIT(@PathParam("lambda")int x,int y) {
	arith add=(a,b)->{
		return a+b;
	};
String result=add.dooperation(x,y)+"";
return result;
}
}*/

@GET
@Path("connect_db")
@Produces(MediaType.TEXT_HTML)

public String connectToDatabase() {
    try {
        Class.forName("com.mysql.jdbc.Driver");
        Connection c=DriverManager.getConnection("jdbc:mysql://localhost:3306/javadb", "root", "root7013");
        return "connected";
    } catch (Exception e) {
        // TODO Auto-generated catch block
        return e.getMessage();
    }
}
    
}










