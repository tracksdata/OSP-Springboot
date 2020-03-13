package com.cts.product.service;

import java.util.List;

import com.cts.product.entity.Review;

public interface ReviewService {
	public List<Review> find();
	public Review findById(int id);
	public Review saveReview(Review review);

}