package com.jonnyi.api.lifecycle;

import lombok.extern.slf4j.Slf4j;
import org.springframework.context.ApplicationEvent;
import org.springframework.context.ApplicationListener;

@Slf4j
public class GlobalApplicationEventListener implements ApplicationListener<ApplicationEvent> {

    @Override
    public void onApplicationEvent(ApplicationEvent event) {
        log.debug(
                "Got an ApplicationEvent of type {}, from source {}",
                event.getClass().getSimpleName(),
                event.getSource());
    }
}
