package spring_mvc.controller;

import java.time.LocalDateTime;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import spring_mvc.model.HelloWorldModal;

@Controller
@ResponseBody
public class HelloWord {
	@RequestMapping("/helloWord")
	public String handler(Model model) {
		HelloWorldModal hwm = new HelloWorldModal();
		hwm.setDateTime(LocalDateTime.now().toString());
		hwm.setMessage("message for him");
		model.addAttribute("helloword", hwm);
		return "helloworld";
	}

}
