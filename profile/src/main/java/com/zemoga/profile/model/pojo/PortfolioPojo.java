package com.zemoga.profile.model.pojo;

/**
 * This class represents in a plain object the entity Portfolio
 * @author Alejandra Prieto
 *
 */
public class PortfolioPojo {

	private Long idPortfolio;
	private String imageUrl;
	private String title;
	private String description;
	private String twitterUserName;
	
	public PortfolioPojo() {
		super();
	}

	/**
	 * Constructor expression used in com.zemoga.profile.service.ProfileServiceImpl.findById(Long)
	 * @param idPortfolio
	 * @param imageUrl
	 * @param title
	 * @param description
	 * @param twitterUserName
	 */
	public PortfolioPojo(Long idPortfolio, String imageUrl, String title,
			String description, String twitterUserName) {
		super();
		this.idPortfolio = idPortfolio;
		this.imageUrl = imageUrl;
		this.title = title;
		this.description = description;
		this.twitterUserName = twitterUserName;
	}

	public Long getIdPortfolio() {
		return idPortfolio;
	}

	public void setIdPortfolio(Long idPortfolio) {
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
