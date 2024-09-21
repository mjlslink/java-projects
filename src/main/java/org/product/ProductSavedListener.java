package org.product;

import org.springframework.context.event.EventListener;
import org.springframework.stereotype.Component;

@Component
public class ProductSavedListener {

    @EventListener
    public void handleProductSavedEvent(ProductSavedEvent event) {
        System.out.println("Saved product with id: " + event.getProductId());
    }
}
