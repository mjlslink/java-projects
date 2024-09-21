package org.product;

import org.springframework.context.ApplicationEvent;

public class ProductSavedEvent {

    private final long productId;

    public ProductSavedEvent(long productId) {
        this.productId = productId;
    }

    public long getProductId() {
        return productId;
    }
}
