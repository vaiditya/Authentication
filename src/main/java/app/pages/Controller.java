package app.pages;

import java.util.List;
import java.util.Map;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
public class Controller {
	
	@Autowired
	private ServiceClass service;

//
	@RequestMapping(value = "/home" )
	private List<Hierarchy> getDetails() {
		return service.getDetails();
	}
	@CrossOrigin
	@RequestMapping(value = "/home/{id}" ,method = RequestMethod.GET )
	private Hierarchy getDetailbyId(@PathVariable String id) {
		return service.getDetailbyId(id);
	}
	@CrossOrigin
	@RequestMapping(value = "/home/search/{name}" ,method = RequestMethod.GET )
	private List<Hierarchy> findByNameContaining(@PathVariable String name) {
		return service.findByNameContaining(name);
	}

	@RequestMapping(value = "/home" , method = RequestMethod.POST )
	private Hierarchy postDetails(@RequestBody Hierarchy data) {
		return service.postDetails(data);
	}
//
//	@RequestMapping(value = "/home/{id}" ,method = RequestMethod.DELETE )
//	private void deleteDetail(@PathVariable String id) {
//		service.deleteDetail(id);
//	}
	
}
