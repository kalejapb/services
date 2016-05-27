package com.zemoga.profile.model.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * This entity represents the table Portfolio from the database
 * @author Alejandra Prieto
 *
 */
@Entity
@Table(name="portfolio")
public class Portfolio {

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="idportfolio")
	private Long idPortfolio;
	
	@Column(name="imageURL")
	private String imageUrl;
	
	@Column(name="title")
	private String title;
	
	@Column(name="description")
	private String description;
	
	@Column(name="twitterUserName")
	private String twitterUserName;
	
	public Portfolio(){}
	
	public Portfolio(Long idPortfolio){
		this.idPortfolio = idPortfolio;
	}

	public Long getIdportfolio() {
		return idPortfolio;
	}

	public void setIdportfolio(Long idPortfolio) {
		this.idPortfolio = idPortfolio;
	}

	public String getImageUrl() {
		return imageUrl;
	}

	public void setImageUrl(String imageUrl) {
		this.imageUrl = imageUrl;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public String getTwitterUserName() {
		return twitterUserName;
	}

	public void setTwitterUserName(String twitterUserName) {
		this.twitterUserName = twitterUserName;
	}
}
