package ru.shashy.thymeleafexample3.Service;

import org.springframework.stereotype.Service;
import ru.shashy.thymeleafexample3.Model.Product;

import java.util.ArrayList;
import java.util.List;

@Service
public class ProductService {

    private final List<Product> products = new ArrayList<>();

    public void addProduct(Product p){
        products.add(p);
    }

    public List<Product> findAll(){
        return products;
    }
}
