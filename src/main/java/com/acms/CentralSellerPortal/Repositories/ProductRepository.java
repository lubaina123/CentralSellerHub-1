package com.acms.CentralSellerPortal.Repositories;

import com.acms.CentralSellerPortal.Entities.Product;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;
import com.acms.CentralSellerPortal.Entities.Seller;


import java.util.List;

@Repository
public interface ProductRepository extends JpaRepository<Product, Long> {

    List<Product> findBySeller_SellerId(Long seller_id);

    Product findByProductId(Long productId);
    Product findBySeller(Long sellerId);

//    @Query(value = "select p.product_name ,p.product_description, p.price, p.discount from product p where product_id = :p_id",
//            nativeQuery = true)
//    Product findProductDetails(@Param("p_id") long  p_id);

//    @Query(value = "select p from Product where p.product_id = ?1")
//    Product findSellerIdByProductId(Long product_id);
}