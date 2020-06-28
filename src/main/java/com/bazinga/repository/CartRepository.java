package com.bazinga.repository;

import com.bazinga.model.Cart;
import org.springframework.data.repository.CrudRepository;

public interface CartRepository  extends CrudRepository<Cart, Integer> {
}
