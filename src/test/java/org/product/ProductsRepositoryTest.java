package org.product;

import org.junit.Assert;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.Optional;

@SpringBootTest
public class ProductsRepositoryTest {

    @Autowired
    private ProductRepository repository;

    @Test
    public void testGetProducts() {
        Product p = new Product();
        p.setId(1L);
        p.setName("sonew me");
        p.setPrice(2.34);
        p.setQuantity(10);
        repository.saveAndFlush(p);

        Optional<Product> byId = repository.findById(Long.valueOf(1));

        Assert.assertTrue(byId.isPresent());

    }
}
