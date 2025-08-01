package family.com.family.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
@Controller
public class pagecontroller {
	
	@GetMapping("/")
	public String home() {
		return "home";
	}
	@GetMapping("/gallery")
	public String gallery() {
		return "gallery";
	}

	@GetMapping("/video")
	public String video() {
		return "video";
	}
	@GetMapping("/travel")
	public String travel() {
		return "travel";
	}
	
	
}
