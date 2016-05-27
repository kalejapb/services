package com.zemoga.profile.service;

import com.zemoga.profile.model.pojo.PortfolioPojo;

/**
 * Interface created to be provided to the controller as entry point to the service.
 * @author Alejandra Prieto
 *
 */
public interface ProfileService {
	
	PortfolioPojo findById(Long idPortfolio);
	boolean update(PortfolioPojo portfolio);
}
