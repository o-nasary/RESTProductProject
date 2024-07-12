package com.productproject.productproject;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import javax.print.attribute.standard.Media;
import javax.print.attribute.standard.MediaTray;

import org.springframework.http.HttpStatus;
import org.springframework.http.HttpStatusCode;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ProductServer {
    ArrayList<Product> productList = new ArrayList<>();

    @GetMapping(value = {"/product"})
    public ResponseEntity<List<Product>> getProduct() {
        //Filter at a later point.
        return ResponseEntity.ok(productList);
    }

    //Change to start accepting lists of newProducts in JSON format.
    @PostMapping(value = {"/"}, consumes = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<Void> addProduct(@RequestBody final Product newProduct) {
        productList.add(newProduct);
        return ResponseEntity.ok().build();
    }
    
}
