package com.cts.product.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

@Entity
public class Review {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int reviewId;
	private int stars;
	private String author;
	private String body;

	@ManyToOne
	@JoinColumn(name = "id")
	private Product product;

	public int getId() {
		return reviewId;
	}

	public void setId(int reviewId) {
		this.reviewId = reviewId;
	}

	public int getStars() {
		return stars;
	}

	public void setStars(int stars) {
		this.stars = stars;
	}

	public String getAuthor() {
		return author;
	}

	public void setAuthor(String author) {
		this.author = author;
	}

	public String getBody() {
		return body;
	}

	public void setBody(String body) {
		this.body = body;
	}

	public Product getProduct() {
		return product;
	}

	public void setProduct(Product product) {
		this.product = product;
	}

}
