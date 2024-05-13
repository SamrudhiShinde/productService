package org.example.productservice.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/products/categories")
public class CategoryController {

    @GetMapping()
    public String getAllCategories(){
        return "Categories returned";
    }

    @GetMapping("/{categoryId}")
    public String getProductInCategory(@PathVariable ("categoryId") Long categoryId){
        return "Get Products in category";
    }

}
