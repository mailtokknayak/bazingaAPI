package com.bazinga.repository;

import com.bazinga.model.Product;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface ApplicationRepository extends MongoRepository<Product, Integer> {

}
