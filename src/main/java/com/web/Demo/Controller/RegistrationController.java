package com.web.Demo.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

import com.web.Demo.Entity.Registration;
import com.web.Demo.Service.RegistrationService;

@Controller
public class RegistrationController {
	
	@Autowired
	private RegistrationService registrationService;
	@RequestMapping("/viewPage")
	public String openViewsPage()
	{
		return "registration";
		
	}
	@RequestMapping("/saveRegi")
	public String savedata(@ModelAttribute Registration registration)
	{
		registrationService.addReg(registration);
		return "registration";
		
		
	}

}
