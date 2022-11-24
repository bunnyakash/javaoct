package b3iam.restap;

import java.util.ArrayList;
import java.util.Arrays;


import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
@Path("dup")
public class listduplicates {
	
public static <Integer> ArrayList<Integer> removeDuplicates(ArrayList<Integer> list){
	ArrayList<Integer> newList=new ArrayList<Integer>();
	for(Integer I:list) {
		if(!newList.contains(I)) {
			
			newList.add(I);
		}
	}
	return newList;
}


@GET
@Produces(MediaType.TEXT_HTML)
@Path("duplicates")
public String getlist2(){
ArrayList<Integer> list=new ArrayList<>(Arrays.asList(1,10,8,7,3,3,1,67,35,67,10));
	ArrayList<Integer> newlist=removeDuplicates(list);
	return list+"<br>"+newlist;
}


}
