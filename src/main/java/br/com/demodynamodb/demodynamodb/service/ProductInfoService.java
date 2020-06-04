package br.com.demodynamodb.demodynamodb.service;

import br.com.demodynamodb.demodynamodb.model.ProductInfo;
import br.com.demodynamodb.demodynamodb.repository.ProductInfoRepository;
import org.springframework.stereotype.Service;

@Service
public class ProductInfoService {

    private final ProductInfoRepository repository;

    ProductInfoService(final ProductInfoRepository productInfoRepository){
        this.repository = productInfoRepository;
    }

    public Iterable<ProductInfo> listAllProducts(){
        return repository.findAll();
    }

    public ProductInfo save(ProductInfo productInfo){
        return repository.save(productInfo);
    }

}
