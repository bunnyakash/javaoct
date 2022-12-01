package b3iam.restap;


import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

@Path("lsd")
public class Listexample {
public List<Integer>addvalues(Integer...integers){
	List<Integer> list=Arrays.asList(integers);
	return list;
}

@GET
@Produces(MediaType.TEXT_HTML)
@Path("list")
public List<Integer> getlist() {
List<Integer> list=new ArrayList<>();
list.add(10);
list.add(20);
list.add(30);
list.add(40);
list.add(50);
List <Integer> list2=new ArrayList<>();
list2.add(60);
list2.add(70);
list2.add(80);
list2.add(10);
list2.add(20);
String res="";
for(Integer i:list)
res+=i+"<br>";
List<Integer> list3=new ArrayList<Integer>(list2);
list3.retainAll(list);
return list3;

}

@GET
@Path("lst")
@Produces(MediaType.TEXT_HTML)
public String getList() {
	List<Integer> list=new ArrayList<>();
	list.add(10);
	list.add(20);
	list.add(-30);
	list.add(40);
	list.remove(1);
	list.add(2, 50);
	List<Integer> list2=new LinkedList<>();
	list2.add(100);
	list2.add(70);
	list2.add(90);
	list2.add(30);
	list.addAll(list2);
	list.removeAll(list2);
	list.set(2, 85);
	Integer n=22;
	list.remove(n);
	Collections.sort(list);
	Collections.reverse(list);
	int x=list.get(2);//get value from given index
	String res="";
	for(Integer i:list)
		res+=i+"<br>";
	res+="----<br>";
	res+=x+"<br>";
	int i=list.indexOf(500);
	res+=i+"<br>";
	boolean b=list.contains(40);
	res+=b+"<br>";
	return res;
}
}
	






