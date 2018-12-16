package com.nisum.productcatalog.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.nisum.productcatalog.data.Product;

@RestController
@RequestMapping("/products")
public class ProductController {
	
	@GetMapping
	ResponseEntity<List<Product>> getProducts(){
		List<Product> list = new ArrayList<>();
		
		return new ResponseEntity<>(HttpStatus.OK);
		
	}
	

}
