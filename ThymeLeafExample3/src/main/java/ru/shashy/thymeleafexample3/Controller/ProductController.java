package ru.shashy.thymeleafexample3.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import ru.shashy.thymeleafexample3.Model.Product;
import ru.shashy.thymeleafexample3.Service.ProductService;

@Controller
public class ProductController {
    private final ProductService productService;

    public ProductController(ProductService productService){
        this.productService = productService;
    }

    @GetMapping("/products")
    public String getProduct(){
        return "product.html";
    }

    @PostMapping("/products")
    public String addProducts(
            Model model,
            Product p
    ){
        productService.addProduct(p);
        model.addAttribute("products", productService.findAll());
        return "products.html";
    }
}
