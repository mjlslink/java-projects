package org.product;

import org.junit.Assert;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;
import org.springframework.http.ResponseEntity;

import java.util.Arrays;
import java.util.List;

import static org.mockito.Mockito.when;

@ExtendWith(MockitoExtension.class)
public class ProductControllerTest {

    @InjectMocks
    private ProductController controller;

    @Mock
    private ProductService productService;

    @Mock
    private Product product;

    @Test
    public void getALlProdducts() throws Exception {
        when(productService.getAllProducts()).thenReturn(Arrays.asList(product));

        List<Product> allProducts = controller.getAllProducts();

        Assert.assertTrue(!allProducts.isEmpty());
        Assert.assertTrue("One element in array", allProducts.size() ==1);
    }

    @Test
    public void saveProdducts() throws Exception {
        when(productService.saveProduct(product)).thenReturn(product);

        ResponseEntity<Product> productResponseEntity = controller.saveProduct(product);

        Assert.assertNotNull(productResponseEntity);
    }

}
