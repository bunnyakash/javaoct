package b3iam.restap;

import java.io.File;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
@Path("lifile")
public class filist {
	

	@GET
	@Path("scan_file/{fileName}")
	@Produces(MediaType.TEXT_HTML)
	public String readFileScan(@PathParam("fileName")String fileName) {
		List<String> lines=new ArrayList<>();
		try {
			Scanner sc=new Scanner(new File("D:\\akashworkspace\\restap\\files\\"+fileName));
			while(sc.hasNextLine())
				lines.add(sc.nextLine());
			return lines.toString();
		}
		catch(Exception e) {
			return e.getMessage();
		}
		
	}
	
}
  







