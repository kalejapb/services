package com.zemoga.profile.service;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.zemoga.profile.model.pojo.PortfolioPojo;

/**
 * This class provides a service for managing the portfolio information.
 * @author Alejandra Prieto
 *
 */
@Service
public class ProfileServiceImpl implements ProfileService {

	@PersistenceContext
	EntityManager em;

	/**
	 * This method find the portfolio information by id
	 * @param idPortfolio
	 * @return PortfolioPojo with the information of the object found.
	 */
	@Override
	public PortfolioPojo findById(Long idPortfolio) {
		String query = "SELECT NEW com.zemoga.profile.model.pojo.PortfolioPojo("
				+ "p.idPortfolio,p.imageUrl,p.title,p.description, p.twitterUserName) "
				+ "FROM Portfolio p WHERE p.idPortfolio = :idPortfolio";
		return em.createQuery(query, PortfolioPojo.class)
				.setParameter("idPortfolio", idPortfolio).getSingleResult();
	}

	/**
	 * This method receives portfolio information like the name, description or image and update it in the database.
	 * @return true or false acording with the final transaction status.
	 */
	@Override
	@Transactional
	public boolean update(PortfolioPojo portfolio) {
		if(portfolio != null){
			String sql = "UPDATE Portfolio SET";
			HashMap<String, Object> parameters = new HashMap<>();
			
			if(portfolio.getDescription() != null && portfolio.getDescription().length() > 0){
				sql += " description = :description, ";
				parameters.put("description", portfolio.getDescription());
			}
			if(portfolio.getImageUrl() != null && portfolio.getImageUrl().length() > 0){
				sql += " imageUrl = :imageUrl, ";
				parameters.put("imageUrl", portfolio.getImageUrl());
			}
			if(portfolio.getTitle() != null && portfolio.getTitle().length() >0){
				sql += " title = :name, ";
				parameters.put("name", portfolio.getTitle());
			}
			
			if(parameters.size() > 0){
				sql = sql.substring(0,sql.length()-2) + " WHERE idPortfolio = :id";
				parameters.put("id", 0L);
				Query query = em.createQuery(sql);
				this.setParametersFromMap(query, parameters);
				query.executeUpdate();
				
				return true;
			}
		}
		
		return false;
	}

	/**
	 * With the information found in the map add the parameters to the query received.
	 * @param query
	 * @param parameters
	 */
	private void setParametersFromMap(Query query,
			Map<String, Object> parameters) {
		
		Iterator<Entry<String, Object>> itr = parameters.entrySet().iterator();
		while(itr.hasNext()){
			Entry<String, Object> e = itr.next();
			query.setParameter(e.getKey(), e.getValue());
		}
	}
}
