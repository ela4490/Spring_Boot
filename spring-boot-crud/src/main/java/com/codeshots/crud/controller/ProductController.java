package com.codeshots.crud.controller;

import com.codeshots.crud.entity.Product;
import com.codeshots.crud.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class ProductController {
    @Autowired
    private ProductService productService;

    /* POST method
    * @param product
    * @return saved product from ProductService
    */
    @PostMapping("/addProduct")
    public Product addProduct(@RequestBody Product product) {
        return productService.saveProduct(product);
    }

    /* POST method
    * @param list of products
    * @return list of saved products from ProductService
    */
    @PostMapping("/addProducts")
    public List<Product> addProducts(@RequestBody List<Product> products) {
        return productService.saveProducts(products);
    }

    /* GET method
    * @param id of product
    * @return product from ProductService
    */
    @GetMapping("/productById/{id}")
    public Product findProductById(@PathVariable int id) {
        return productService.getProductById(id);
    }

    /* GET method
    * @param name of product
    * @return product from ProductService
    */
    @GetMapping("/product/{name}")
    public Product findProductByName(@PathVariable String name) {
        return productService.getProductByName(name);
    }

    /* GET method
    * @return product from ProductService
    */
    @GetMapping("/products")
    public List<Product> findAllProducts() {
        return productService.getProducts();
    }

    /* PUT method
    * @param product
    * @return updated product from ProductService
    */
    @PutMapping("/update")
    public Product updateProduct(@RequestBody Product product) {
        return productService.updateProduct(product);
    }

    /* DELETE method
    * @param id of product
    * @return String message from ProductService
    */
    @DeleteMapping("/delete/{id}")
    public String deleteProduct(@PathVariable int id) {
        return productService.deleteProduct(id);
    }
}
