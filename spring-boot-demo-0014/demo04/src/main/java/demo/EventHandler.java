package demo;

import lombok.extern.slf4j.Slf4j;
import org.springframework.context.event.EventListener;
import org.springframework.stereotype.Component;

@Component
@Slf4j
public class EventHandler {

    @EventListener
    public void handleMyEvent(MyEvent event) {
        log.info("{} handleMyEvent msg: {}", getClass().getSimpleName(), event.getMsg());
    }

}
