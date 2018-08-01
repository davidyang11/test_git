package jerry.example.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller("daControlla")
@CrossOrigin(origins = "http://localhost:4200")
public class DaControlla {

	@GetMapping("/tester.app")
	public @ResponseBody ResponseEntity<String> getHero(){
		return new ResponseEntity<>("It works!!!", HttpStatus.OK);
	}
}
