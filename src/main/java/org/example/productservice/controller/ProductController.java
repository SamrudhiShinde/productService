package org.example.productservice.controller;

import org.example.productservice.dto.GetSingleProductResponseDTO;
import org.example.productservice.dto.ProductDTO;
import org.example.productservice.models.Product;
import org.example.productservice.service.ProductService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/products")
public class ProductController {

    private ProductService productService;

    public ProductController(ProductService productService){
        this.productService = productService;
    }

    @GetMapping()
    public List<Product> getAllProducts(){

        return productService.getAllProducts();
    }
    @GetMapping("/{productId}")
    public GetSingleProductResponseDTO getASingleProduct(@PathVariable ("productId") Long productId){
        GetSingleProductResponseDTO responseDTO = new GetSingleProductResponseDTO();
        responseDTO.setProduct(productService.getASingleProduct(productId));
        return responseDTO;

       // To set headers and response code for the response

//        MultiValueMap<String,String> headers = new LinkedMultiValueMap<>();
//
//        headers.add("auth-token","noaccess4uheyhey");
//
//
//        ResponseEntity<Product> response = new
//                ResponseEntity(productService.getASingleProduct(productId),
//                headers,HttpStatus.NOT_FOUND);
//
//        return response;





    }

    @PostMapping()
    public ResponseEntity<Product> addNewProduct(@RequestBody ProductDTO product){
        Product newProduct = productService.addNewProduct(product);

        ResponseEntity<Product> response = new ResponseEntity<>(newProduct,HttpStatus.OK);
        return response;
    }
    @PutMapping("/{productId}")
    public String updateProduct(@PathVariable ("productId") Long productId,@RequestBody ProductDTO productDTO){
        return "Product is updated with id : " + productId ;
    }

    @DeleteMapping("/{productId}")
    public String deleteProduct(@PathVariable ("productId") Long productId){
        return "Product is deleted with id " + productId;
    }
}
