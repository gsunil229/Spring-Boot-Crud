package com.sunil.crudoperationusingspringboot;

import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductRepository extends JpaRepository<Product, Long> {
	
	
}
