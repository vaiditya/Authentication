package auth.pages;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HierarchyController {

	@RequestMapping("/home")
	public String getHome() {
		return "Hierarchy";
	}
}
