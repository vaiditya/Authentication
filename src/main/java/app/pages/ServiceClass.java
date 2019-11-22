package app.pages;


import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

import app.pages.Hierarchy;

import org.springframework.stereotype.Service;

@Service
public class ServiceClass {	
	
	List<Hierarchy> list = new ArrayList<Hierarchy>(Arrays.asList(new Hierarchy("1","ABC")));
		public List<Hierarchy> getDetails(){
			return list;
		}
		
		public List<Hierarchy> getDetailbyId(String id){
			return list.stream().filter( detail -> detail.getId().equals(id)).collect(Collectors.toList());
		}
		
		public void postDetails(Hierarchy data){
			list.add(data);
		}
		
		public void deleteDetail(String id){
			list.removeIf(detail -> detail.getId().equals(id));
		}
		

	
	
}
