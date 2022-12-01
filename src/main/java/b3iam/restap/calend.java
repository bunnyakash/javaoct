package b3iam.restap;

import java.util.Calendar;
import java.util.StringTokenizer;
import java.util.TimeZone;

import javax.servlet.http.HttpServletRequest;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.Context;
import javax.ws.rs.core.MediaType;


@Path("calender")
public class calend {
	public String getDate() {
		Calendar cal=Calendar.getInstance();
		int doy=cal.get(Calendar.DAY_OF_WEEK);
		String dayName="";
		for(Day day:Day.values())
			if(day.ordinal()==doy-1)
				dayName=day.toString();
		
		/*cal.set(1997, 2, 16);
		doy=cal.get(Calendar.DAY_OF_WEEK);
		for(Day day:Day.values())
			if(day.ordinal()==doy-1)
				dayName=day.toString();*/
		
		cal.add(Calendar.YEAR, -100);
		doy=cal.get(Calendar.DAY_OF_WEEK);
		for(Day day:Day.values())
			if(day.ordinal()==doy-1)
				dayName=day.toString();
		
			
		return cal.getTime().toString()+"<br>"+doy+"<br>"+dayName;
	}




@GET
@Path("date")
@Produces(MediaType.TEXT_HTML)
public String getCurrentDate() {
	calend ex=new calend();
	return ex.getDate();
	
}

@GET
@Path("zone")
@Produces(MediaType.TEXT_HTML)
public String getZones() {
	String tz[]=TimeZone.getAvailableIDs();
	String zones="";
	for(String zone:tz)
		zones+=zone+"<br>";
	return zones;
}

@GET
@Path("zone_time/{zone}/{sub}")
@Produces(MediaType.TEXT_HTML)
public String getTime(@PathParam("zone")String zone,@PathParam("sub")String sub) {
	TimeZone tz=TimeZone.getTimeZone(zone+"/"+sub);
	TimeZone.setDefault(tz);
	Calendar cal=Calendar.getInstance(tz);
	return cal.getTime().toString();
}

@GET
@Path("tokens/{string}/{delim}")
@Produces(MediaType.TEXT_HTML)
public String tokens(@PathParam("string")String s,@PathParam("delim")String delim) {
	StringTokenizer tok=new StringTokenizer(s, delim);
	String toks="";
	int n=tok.countTokens();
	while(tok.hasMoreTokens())
		toks+=tok.nextToken()+"--tokens left:"+tok.countTokens()+"<br>";
	return "total number of tokens:"+n+"<br>"+toks;
}

@GET
@Path("bday")
@Produces(MediaType.TEXT_HTML)
public String bdayWish(@Context HttpServletRequest rq) {
	String name=rq.getParameter("uname");
	return "Happy Birthday to "+name;
}
}
