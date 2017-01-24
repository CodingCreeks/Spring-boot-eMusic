package com.codingKnowledge.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import com.codingKnowledge.entity.Product;
import com.codingKnowledge.service.ProductService;

@Controller
@RequestMapping("/eMusicStore")
public class eMusicStoreController {

	@Autowired
	private ProductService theProductService;
	
	@RequestMapping("/home")
	public String home() {
		return "index";
	}
	
	@RequestMapping("/productList")
	public String productlist(Model themodel) {
		
		List<Product> productlist=theProductService.getProudcts();
		themodel.addAttribute("products", productlist);
		return "productList";
	}
	
	@RequestMapping("productList/viewProduct/{productId}")
	public String viewproduct(@PathVariable("productId") Long id, Model theModel){
		theModel.addAttribute("product", theProductService.getProduct(id));
		return "viewProduct";
	}
	
}