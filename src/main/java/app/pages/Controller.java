package app.pages;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import app.pages.ServiceClass;

@RestController
public class Controller {
	
	@Autowired
	private ServiceClass service;
	
	@RequestMapping(value = "/")
	private String homePage() {
		return "HomePage";
	}
	
	@RequestMapping(value = "/home" )
	private List<Hierarchy> getDetails() {
		return service.getDetails();
	}
	
	@RequestMapping(value = "/home/{id}" ,method = RequestMethod.GET )
	private List<Hierarchy> getDetailbyId(@PathVariable String id) {
		return service.getDetailbyId(id);
	}
	
	@RequestMapping(value = "/home" , method = RequestMethod.POST )
	private void postDetails(@RequestBody Hierarchy data) {
		service.postDetails(data);
	}
	
	@RequestMapping(value = "/home/{id}" ,method = RequestMethod.DELETE )
	private void deleteDetail(@PathVariable String id) {
		service.deleteDetail(id);
	}
	
}
