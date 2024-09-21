package org.product;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;
import org.springframework.context.ApplicationEventPublisher;

import static org.junit.Assert.assertNotNull;
import static org.mockito.Matchers.any;
import static org.mockito.Mockito.when;

@ExtendWith(MockitoExtension.class)
public class ProductServiceTest {

    @InjectMocks
    private ProductService productService;

    @Mock
    private ProductRepository repository;

    @Mock
    private Product product;

    @Mock
    private ApplicationEventPublisher eventPublisher;

    @Test
    public void testSave(){
        when(repository.save(product)).thenReturn(product);

        Product product1 = productService.saveProduct(product);

        assertNotNull(product1);
    }
}
