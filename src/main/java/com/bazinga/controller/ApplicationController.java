package com.bazinga.controller;

import com.bazinga.model.Cart;
import com.bazinga.model.Product;
import com.bazinga.service.ApplicationService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/v1")
@CrossOrigin(origins = {"*"}, allowedHeaders = {"*"})
public class ApplicationController {

    private final ApplicationService applicationService;

    public ApplicationController(ApplicationService applicationService) {
        this.applicationService = applicationService;
    }

    @GetMapping("/allProducts")
    public List<Product> findAllItems(){
         return applicationService.findAllProduct();
    }

    @PostMapping("/addProducts")
    public List<Product> saveItem(@RequestBody List<Product> products){
       return  applicationService.saveProducts(products);
    }

    @PostMapping("/cartCheckout")
    public Cart cartCheckout(@RequestBody Cart cart){
        return applicationService.cartCheckout(cart);
    }
}
