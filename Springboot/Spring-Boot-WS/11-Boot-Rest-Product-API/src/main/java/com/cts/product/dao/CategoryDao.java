package com.cts.product.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.cts.product.entity.Category;

public interface CategoryDao extends JpaRepository<Category, Integer>{

}
