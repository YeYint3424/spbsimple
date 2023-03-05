package com.jwd36.spboot.demo.controllers;

import com.jwd36.spboot.demo.dao.CategoriesDao;
import com.jwd36.spboot.demo.models.Categories;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;

@Controller
@RequestMapping(value = "/categories")
public class CategoriesController {

    @Autowired
    CategoriesDao categoriesDao;

    @GetMapping(value = "/create")
    public String createCategories(){
        List<Categories> categories=categoriesDao.findAll();
        for(int i=0;i<categories.size();i++){
            System.out.println(categories.get(i).getCatName());
        }
        return "categories/create";
    }

    @PostMapping(value = "/create")
    public String createCategoriesPost(@RequestParam String category){
        Categories categories=new Categories();
        System.out.println(category);
        categories.setCatName(category);
        categoriesDao.save(categories);
        return "categories/create";
    }
}
