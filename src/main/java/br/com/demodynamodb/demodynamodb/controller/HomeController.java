package br.com.demodynamodb.demodynamodb.controller;

import br.com.demodynamodb.demodynamodb.model.ProductInfo;
import br.com.demodynamodb.demodynamodb.service.ProductInfoService;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/home")
public class HomeController {

    private final ProductInfoService service;

    HomeController(ProductInfoService productInfoService){
        this.service = productInfoService;
    }

    @GetMapping("/")
    public String teste(){
        return "teste";
    }

    @ResponseBody
    @GetMapping("/list")
    public Iterable<ProductInfo> list(){

        ProductInfo product = new ProductInfo();
        product.setCost("1");
        product.setDescription("Teste");

        service.save(product);
        return service.listAllProducts();
    }

    @PostMapping("/new")
    public ProductInfo newProduct(@RequestBody ProductInfo product){
        return service.save(product);
    }

}
