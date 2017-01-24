package com.codingKnowledge.service;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.codingKnowledge.entity.Product;
import com.codingKnowledge.repository.ProductRepository;

@Service
@Transactional
public class ProductService {
	
	@Autowired
	private ProductRepository theProductRepository;

	
	public List<Product> getProudcts(){
		
		return (List<Product>) theProductRepository.findAll();
	}


	public Product getProduct(Long id) {
		return theProductRepository.findOne(id);
	}
}
