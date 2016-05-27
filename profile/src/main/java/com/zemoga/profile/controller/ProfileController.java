package com.zemoga.profile.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.zemoga.profile.model.pojo.PortfolioPojo;
import com.zemoga.profile.service.ProfileService;

/**
 * Service exposed with the functionalities for getting a profile information or update a register from the database.
 * @author Alejandra Prieto
 *
 */
@RestController
@RequestMapping(value = "zemoga_portfolio_api/")
public class ProfileController {

	@Autowired
	ProfileService profileService;
	
	@RequestMapping(value = "/user_info")
	public PortfolioPojo getProfile(){
		return profileService.findById(0L);
	}
	
	@RequestMapping(value = "/modify_user_info", method=RequestMethod.POST)
	public boolean updatePortfolio(@RequestBody PortfolioPojo portfolio){
		return profileService.update(portfolio);
	}
}
