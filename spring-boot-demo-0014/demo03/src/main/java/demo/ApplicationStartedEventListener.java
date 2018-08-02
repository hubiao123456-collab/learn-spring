package demo;

import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.context.event.ApplicationStartedEvent;
import org.springframework.context.ApplicationEvent;
import org.springframework.context.ApplicationListener;
import org.springframework.context.event.EventListener;
import org.springframework.stereotype.Component;

@Component
@Slf4j
public class ApplicationStartedEventListener {

    @EventListener
    public void handleApplicationStartedEvent(ApplicationStartedEvent event) {
        log.info("{} ApplicationStartedEvent", getClass().getSimpleName());
    }
}

