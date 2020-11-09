package com.polarBear.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class SignupController {

	@RequestMapping(value="/signup")
	public String signupPage() {
		return "signup";
	}
	
}
