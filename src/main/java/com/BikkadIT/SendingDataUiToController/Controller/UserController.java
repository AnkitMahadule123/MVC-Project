package com.BikkadIT.SendingDataUiToController.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

import com.BikkadIT.SendingDataUiToController.model.User;


@Controller
public class UserController {

	
	@GetMapping("/loadForm")
	public String loadForm() {
	
		return "userReg";
	}
	
	@PostMapping("/saveUSer")
	public String saveUser( User user,Model model) {
	
		
		System.out.println(user);
		model.addAttribute("USER", user);
		
		return "userSuccess";
}
}