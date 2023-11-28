package com.hemanth.javarestcicd;

import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/api/v1/product")
public class ProductController {

    private ArrayList<Product> products = new ArrayList<>();


    @GetMapping("/greeting")
    public String greet(){
        return "Hello from products controller";
    }

    @PostMapping("/add")
    public void addProduct(@RequestBody Product product){
       products.add(product);
    }

    @GetMapping("/get-all")
    public ArrayList<Product> getAll(){
        return products;
    }


}
