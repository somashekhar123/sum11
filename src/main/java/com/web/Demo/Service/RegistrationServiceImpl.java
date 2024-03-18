package com.web.Demo.Service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.web.Demo.Entity.Registration;
import com.web.Demo.Repository.RegistrationRepository;
@Service
public class RegistrationServiceImpl implements RegistrationService {
@Autowired
private RegistrationRepository registrationRepository;
	@Override
	public void addReg(Registration registration) {
	
		registrationRepository.save(registration);
	}

}
