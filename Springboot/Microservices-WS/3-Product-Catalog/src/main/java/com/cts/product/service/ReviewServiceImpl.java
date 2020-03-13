package com.cts.product.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cts.product.dao.ReviewRepository;
import com.cts.product.entity.Review;

@Service
public class ReviewServiceImpl implements ReviewService {
	
	@Autowired
	private ReviewRepository rr;
	
	
	 public List<Review> find(){
		 return rr.findAll();
	 }
	 
	 public Review findById(int id) {
		return  rr.findById(id).orElse(null);
	 }

	@Override
	public Review saveReview(Review review) {
		return rr.save(review);
		
	}

}
