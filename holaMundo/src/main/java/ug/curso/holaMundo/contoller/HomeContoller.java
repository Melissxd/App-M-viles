package ug.curso.holaMundo.contoller;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HomeContoller {
	@GetMapping("/")
	public String mostrarHome() {
	return "home";
	}


}
