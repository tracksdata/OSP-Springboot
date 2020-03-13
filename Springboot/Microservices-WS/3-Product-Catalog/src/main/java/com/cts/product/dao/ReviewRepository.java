package com.cts.product.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.cts.product.entity.Review;

public interface ReviewRepository extends JpaRepository<Review, Integer> {


}
