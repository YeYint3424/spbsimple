package com.jwd36.spboot.demo.dao;

import com.jwd36.spboot.demo.models.Categories;

import org.springframework.data.jpa.repository.JpaRepository;

public interface CategoriesDao extends JpaRepository<Categories, Integer> {

}
