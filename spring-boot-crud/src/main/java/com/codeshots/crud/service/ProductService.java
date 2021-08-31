package com.codeshots.crud.service;

import com.codeshots.crud.entity.Product;
import com.codeshots.crud.repository.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
public class ProductService {
    @Autowired
    private ProductRepository repository;

    /* POST request to the Database
    * @param product
    * @return saved product from repository
    */
    public Product saveProduct(Product product) {
        return repository.save(product);
    }

    /* POST request to the Database
    * @param list of products
    * @return list of saved products from repository
    */
    public List<Product> saveProducts(List<Product> products) {
        return repository.saveAll(products);
    }

    /* GET request to the Database
    * @param product id
    * @return product with selected id
    */
    public Product getProductById(int id) {
        return repository.findById(id).orElse(null);
    }

    /* GET request to the Database
     * @param name of product
     * @return product with selected name
     */
    public Product getProductByName(String name) {
        return repository.findByName(name);
    }

    /* GET request to the Database
    * @return list of products
    */
    public List<Product> getProducts() {
        return repository.findAll();
    }

    /* DELETE request to the Database
    * @param id of product
    * @return String message
    */
    public String deleteProduct(int id) {
        repository.deleteById(id);
        return "Product " + id + " removed";
    }

    /* UPDATE request to the Database
    * @param product
    * @return product with the updated parameters
    */
    public Product updateProduct(Product product) {
        Product existingProduct = repository.findById(product.getId()).orElse(null);
        existingProduct.setName(product.getName());
        existingProduct.setQuantity(product.getQuantity());
        existingProduct.setPrice(product.getPrice());
        return repository.save(existingProduct);
    }
}