package com.java.springboot;

import java.util.Arrays;
import java.util.List;

import org.springframework.http.HttpStatus;
import org.springframework.http.HttpStatusCode;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/product")
public class ProductController {
	@GetMapping("/products")
	public ResponseEntity<List<String>> getProducts() {
		
		return  new ResponseEntity(Arrays.asList("Phone","Pen","TV","Books"),HttpStatus.CREATED);
	}
}
