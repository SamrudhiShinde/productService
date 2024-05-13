package org.example.productservice.controller;

import org.example.productservice.dto.ProductDTO;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/products")
public class ProductController {

    @GetMapping("/products")
    public String getAllProducts(){
        return "Products are returned";
    }
    @GetMapping("/products/{productId}")
    public String getASingleProduct(@PathVariable ("productId") Long productId){
        return "A single product is returned with id : " + productId;
    }

    @PostMapping("/products")
    public String addNewProduct(@RequestBody ProductDTO productDTO){
        return "Product is created" + productDTO;
    }
    @PutMapping("/products/{productId}")
    public String updateProduct(@PathVariable ("productId") Long productId){
        return "Product is updated with id : " + productId ;
    }

    @DeleteMapping("/products/{productId}")
    public String deleteProduct(@PathVariable ("productId") Long productId){
        return "Product is deleted with id " + productId;
    }
}
