package com.bazinga.service;

import com.bazinga.model.Cart;
import com.bazinga.model.Product;
import com.bazinga.model.SelectedItem;
import com.bazinga.repository.ApplicationRepository;
import com.bazinga.repository.CartRepository;
import org.springframework.stereotype.Service;

import java.util.*;

@Service
public class ApplicationService {

    private final ApplicationRepository applicationRepository;
    private final CartRepository cartRepository;

    public ApplicationService(ApplicationRepository applicationRepository, CartRepository cartRepository) {
        this.applicationRepository = applicationRepository;
        this.cartRepository = cartRepository;
    }

    public List<Product> findAllProduct() {
        return applicationRepository.findAll();
    }

    public List<Product> saveProducts(List<Product> products) {
        return applicationRepository.saveAll(products);
    }

    public Cart cartCheckout(Cart cart) {
        int finalAmount = 0;
        for (SelectedItem selectedItem : cart.getSelectedItems()) {
            Optional<Product> product = applicationRepository.findById(selectedItem.getProductId());
            finalAmount = finalAmount + selectedItem.getQuantity() * product.get().getPrice();
        }
        cart.setFinalAmount(finalAmount);
        return cartRepository.save(cart);
    }
}
