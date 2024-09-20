package org.product;

import org.springframework.boot.context.event.ApplicationEnvironmentPreparedEvent;
import org.springframework.context.ApplicationListener;

public class ApplicationEnvironmentPreparedListener
        implements
        ApplicationListener<ApplicationEnvironmentPreparedEvent> {
    @Override
    public void onApplicationEvent(ApplicationEnvironmentPreparedEvent event) {
        System.out.println("Handling ApplicationEnvironmentPreparedEvent here!");
    }
}