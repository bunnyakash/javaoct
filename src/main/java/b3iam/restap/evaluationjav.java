package b3iam.restap;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.sql.PreparedStatement;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Calendar;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

@Path("asv")
public class evaluationjav {
	
	@Produces(MediaType.TEXT_HTML)
	@GET
	@Path("ascrev")
	public String getascii() {
	
		
		String s="akash";
		String res="";
		String res1="";
		char[] ar=s.toCharArray();
		
		for(int i=0;i<ar.length;i++) {
			int n=(int)ar[i];
			
		
			
			
	int rev=0;
		while(n>0) {
			int digit=n % 10;
			rev=rev*10+digit;
			n/=10;
		}
		char c=(char)n;
	
	 res1+=rev+"<br>"+c+"<br>"+n;	

	}
		return res1;

	}	

	@Produces(MediaType.TEXT_HTML)
	@GET
	@Path("valchar")
public String ass2(String s) {
		String s1="akash";
	
	int [] frequency=new int[26];
	int len=s.length();

	for (int i = 0; i < len; i++){
	char ch = s.charAt(i);
	
	if (ch >= 'a' && ch <= 'z') {
frequency[ch - 'a']++;
	}

	else if (ch >= 'A' && ch <= 'Z') {
	frequency[ch - 'A']++;
	}
	}
	Arrays.sort(frequency);
	int val = 0;
	for (int i = 25; i >= 0; i--) {
		
		if (frequency[i] > 0) {
		val= val + frequency[i] * (i + 1);}
		
		else
	break;
		}

	return val+"<br>"+ass2("s1");
	}

@Produces(MediaType.TEXT_HTML)
@GET
@Path("filexvg/{filename}")
public String fileop1(@PathParam("filename")String fname) {

	try {
		FileReader fr = new FileReader("D:\\akashworkspace\\restap\\files\\"+fname);
	
				int i;
				while ((i = fr.read()) != -1)
		return (char)i+"";
			}
	catch(Exception e) {
		return e.getMessage();
	
				}
	return fname;
		
	}

@GET
@Path("mapsd")
@Produces(MediaType.TEXT_HTML)
public String getMap() {
	Map<Integer,Integer> map=new HashMap<>();
	int[] a= new int[999];
String s="";
	for(int b=100;b<=999;b++) {
        String i=Integer.toString(b);
        System.out.println(i);
        Integer c=Integer.parseInt(i.charAt(0)+"")+Integer.parseInt(i.charAt(1)+"")+Integer.parseInt(i.charAt(2)+"");
        
        map.put(b,c);
	}
	for(Map.Entry<Integer, Integer> entry:map.entrySet())
		s+=entry.getKey()+":"+entry.getValue()+"<br>";
		
	return s+"";
	
}

}
@GET
@Path("mapsd")
@Produces(MediaType.TEXT_HTML)
public String dateshave() {
	List<String> lines=new ArrayList<>();
	
	Calendar cal=Calendar.getInstance();
	int doy=cal.get(Calendar.DAY_OF_MONTH);
	String dayName="";
	for(Day day:Day.values())
		if(day.ordinal()==doy-1)
			dayName=day.toString();
	for(lines )
	




