package com.cts.product.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.cts.product.entity.Product;
import com.cts.product.entity.Review;
import com.cts.product.service.ProductService;
import com.cts.product.service.ReviewService;

@CrossOrigin()
@RestController
@RequestMapping("api/products")
public class ProductController {

	@Autowired
	private ProductService ps;
	@Autowired
	private ReviewService rr;

	@GetMapping
	public List<Product> get() {
		return ps.findAll();
	}
	
	@GetMapping("/byName/{name}")
	public List<Product> getByName(@PathVariable String name) {
		return ps.findProductByNameLike("%"+name+"%");
	}
	

	@GetMapping("/{id}")
	public Product findbyId(@PathVariable int id) {
		return ps.finfById(id);
	}
	@GetMapping("/{id}/reviews")
	public List<Review> getReviews(@PathVariable int id) {
		return ps.findReviewsByProduct(id);
	}

	@PostMapping("/{id}/reviews")
	public Review saveReview(@PathVariable int id, @RequestBody Review review) {
		review.setProduct(ps.finfById(id));
		return rr.saveReview(review);
	}

}
