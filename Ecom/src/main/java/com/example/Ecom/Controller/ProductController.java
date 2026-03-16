package com.example.Ecom.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.Ecom.entity.Product;
import com.example.Ecom.security.JwtUtil;
import com.example.Ecom.service.ProductService;

@RestController
@RequestMapping("/api/products")
public class ProductController {

	@Autowired
    private ProductService productService;

    @Autowired
    private JwtUtil jwtUtil;

    @PostMapping("/add")
    public Product addProduct(@RequestHeader("Authorization") String token,
                              @RequestBody Product product) {

        // JWT verify
        String email = jwtUtil.extractEmail(token.replace("Bearer ", ""));
        // Optionally: check if admin
        return productService.addProduct(product);
    }

    @GetMapping("/all")
    public List<Product> getAllProducts() {
        return productService.getAllProducts();
    }
}
