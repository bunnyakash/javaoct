package b3iam.restap;

import java.io.File;
import java.sql.PreparedStatement;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

public class eva1 {
	int rev(int n) {
        int rev=0;
        while(n!=0) {
            rev=rev*10+n%10;
            n/=10;
        }
        return rev;
    }
    
    @GET
    @Path("q1/{s}")
    @Produces(MediaType.TEXT_HTML)
    public String q1(@PathParam("s")String s) {
        char ar[]=s.toCharArray();
        String s1="";
        for(char c:ar) {
            int asc=(int)c;
            int rev=rev(asc);
            s1+=(char)rev;
        }
        return s1;
    }
    
    @GET
    @Path("q2/{s}")
    @Produces(MediaType.TEXT_HTML)
    public String q2(@PathParam("s")String s) {
        String alp="abcdefghijklmnopqrstuvwxyz";
        int sum=0;
        for(int i=0;i<s.length();i++)
            sum+=alp.indexOf(s.charAt(i))+1;
        return sum+"";
    }
    
    @GET
    @Path("q3/{s}")
    @Produces(MediaType.TEXT_HTML)
    public String q3(String fileName) {
        String filePath="C:\\ashwin\\classes\\java_iam_b3\\rest\\files\\"+fileName;
        try {
            Scanner in=new Scanner(new File(filePath));
            int line=1;
            connectingdatabse db=new connectingdatabse();
            PreparedStatement ps=db.c.prepareStatement("insert into names values(?,?)");
            while(in.hasNextLine()) {
                ps.setInt(1, line);
                ps.setString(2, in.nextLine());
                ps.execute();
                line++;
            }
            
            return "data saved";
            
        } catch (Exception e) {
            // TODO Auto-generated catch block
            return e.getMessage();
        }
    }
    
    @GET
    @Path("q4")
    @Produces(MediaType.TEXT_HTML)
    public String q4() {
        Map<Integer, Integer> map=new LinkedHashMap<>();
        String s="";
        for(int i=100;i<=999;i++) {
            int sum=0;
            int j=i;
            while(j!=0) {
                sum+=j%10;
                j/=10;
            }
            map.put(i, sum);
        }
        
        for(Map.Entry<Integer, Integer> entry:map.entrySet())
            s+=entry.getKey()+":"+entry.getValue()+"<br>";
        return s;
    }
    
    @GET
    @Path("q5")
    @Produces(MediaType.TEXT_HTML)
    public String q5() {
        Calendar c=Calendar.getInstance();
        c.set(2022, 0, 1);
        List<String> dates=new ArrayList<>();
        int i=1;
        while(i<=365) {
            String date=c.get(Calendar.DATE)+"";
            String month=(c.get(Calendar.MONTH)+1)+"";
            dates.add(date+"_"+month);
            c.add(Calendar.DATE, 1);
            i++;
        }
        
        String s="";
        for(String dt:dates)
            s+=dt+"<br>";
        return s;
        
    }

}
