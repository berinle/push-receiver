package demo;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import javax.validation.Valid;

@RestController
public class PushReceiverController {
    public static final Logger LOGGER = LoggerFactory.getLogger(PushReceiverController.class);

    @RequestMapping(value = "/receive-push", method = RequestMethod.POST)
    public void receive(@RequestBody @Valid Message msg) {
        LOGGER.info("Received: {}", msg);
    }
}
