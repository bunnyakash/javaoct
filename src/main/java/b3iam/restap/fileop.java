package b3iam.restap;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.util.Scanner;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
@Path("file")
public class fileop {
	
	
	@GET
	@Produces(MediaType.TEXT_HTML)
	@Path("write_file/{fname}/{a}/{b}")
	public String writeFile(@PathParam("fname")String fname,@PathParam("a")int a,@PathParam("b")int b) {
		try {
		FileOutputStream out=new FileOutputStream("D:\\akashworkspace\\restap\\files\\"+fname,true);
	String s="";
	s= (a+b)+"";
	byte x[]=s.getBytes();
	out.write(x);
	out.write(System.lineSeparator().getBytes());
	return s;
		}
		catch(Exception e) {
			return e.getMessage();
		}
	}



@GET
@Produces(MediaType.TEXT_HTML)
@Path("file_copy/{file1}/{file2}")
public String copydata(@PathParam("file1")String fname,@PathParam("file2")String fn) {
	FileInputStream ins=null;
	FileOutputStream outs=null;
	try {
		File input=new File("D:\\akashworkspace\\restap\\files\\add.txt");
		File output=new File("D:\\akashworkspace\\restap\\files\\data.txt");
		ins= new FileInputStream(input);
		outs=new FileOutputStream(output);
				byte[] buffer=new byte[(int) input.getTotalSpace()];
		int length;
		while((length= ins.read(buffer))>0) {
			outs.write(buffer, 0, length);
			
		}
		ins.close();
		outs.close();
		return "file copied successfully";
	}
	catch(Exception e) {
			return e.getMessage();
		
				
		
	}
}
}


	
