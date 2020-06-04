package br.com.demodynamodb.demodynamodb.repository;

import br.com.demodynamodb.demodynamodb.model.ProductInfo;
import org.socialsignin.spring.data.dynamodb.repository.EnableScan;
import org.springframework.data.repository.CrudRepository;

@EnableScan
public interface ProductInfoRepository extends CrudRepository<ProductInfo, String> {
}
