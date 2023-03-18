package ru.shashy.ThymeLeafExample2.Service;

import org.springframework.stereotype.Service;
import ru.shashy.ThymeLeafExample2.Model.Product;

import java.util.ArrayList;
import java.util.List;

@Service
public class ProductService {
    private List<Product> listProducts = new ArrayList<>();

    public void addProduct(Product p){
        listProducts.add(p);
    }

    public List<Product> findAll(){
        return listProducts;
    }
}