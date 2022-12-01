package b3iam.restap;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.TreeSet;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
@Path("limaty")
public class setdec{
	
	
	
	
	@GET
	@Path("set_city")
	@Produces(MediaType.TEXT_HTML)
	public String getSet(){
		Set<String> set=new TreeSet<>();
		String ar[]= {"hyd","blore","pune","mumbai","chennai","blore","Pune"};
		for(String city:ar) {
			set.add(city);
		}
		set.remove("mumbai");
		List<String> list=new ArrayList<>();
		for(String city:set)
			list.add(city);
		Collections.reverse(list);
		String s="";
		for(String city:set)
			s+=city+"<br>";
		return s;
	}
	
	
	@GET
	@Path("map")
	@Produces(MediaType.TEXT_HTML)
	public String getMap() {
		Map<Integer,String> map=new HashMap<>();
		String names[]= {"arathi","aamani","naser","irfan","vinayak","akash"};
		for(int i=101;i<=100+names.length;i++)
			map.put(i, names[i-101]);
		String s="";
		for(Map.Entry<Integer, String> entry:map.entrySet())
			if(entry.getKey()==103)
				s+=entry.getKey()+","+entry.getValue()+"<br>";
		//s+=map.get(103);
		return s;
	}
	
	@GET
	@Path("marks_map")
	@Produces(MediaType.TEXT_HTML)
	public String getMarks() {
		Map<Integer,List<Integer>> map=new HashMap<>();
		List<Integer> list1=Arrays.asList(67,78,98);
		List<Integer> list2=Arrays.asList(77,89,88);
		List<Integer> list3=Arrays.asList(67,77,98);
		map.put(101, list1);
		map.put(102, list2);
		map.put(103, list3);
		String s="";
		for(Map.Entry<Integer, List<Integer>> entry:map.entrySet())
			s+=entry.getKey()+":"+entry.getValue()+"<br>";
		return s;
		
	}
	
	@GET
	@Path("fam_map")
	@Produces(MediaType.TEXT_HTML)
	public String familyMap() {
		Map<String,Map<String,Object>> family=new LinkedHashMap<>();
		Map<String,Object> head=new LinkedHashMap<>();
		Map<String,Object> mem1=new LinkedHashMap<>();
		Map<String,Object> mem2=new LinkedHashMap<>();
		Map<String,Object> mem3=new LinkedHashMap<>();
		
		head.put("name", "ravi");
		head.put("age", 65);
		head.put("rel", "self");
		
		mem1.put("name", "malleshwari");
		mem1.put("age", 50);
		mem1.put("rel", "wife");
		
		mem2.put("name", "akash");
		mem2.put("age", 24);
		mem2.put("rel", "son");
		
		mem3.put("name", "tulasi");
		mem3.put("age", 19);
		mem3.put("rel", "daughter");
		
		family.put("head", head);
		family.put("mem1", mem1);
		family.put("mem2", mem2);
		family.put("mem3", mem3);
		
		String s="";
		for(Map.Entry<String, Map<String,Object>> entry:family.entrySet())
			s+=entry.getKey()+":"+entry.getValue()+"<br>";
		return s;
		
	}
	
	
	
	}
	


