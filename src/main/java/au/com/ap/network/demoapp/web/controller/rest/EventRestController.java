package au.com.ap.network.demoapp.web.controller.rest;

import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(path = "/rest")
public class EventRestController {

    @RequestMapping(value = "/event", method = RequestMethod.POST)
    public void saveEvent(@RequestBody EventVO event) {
        int i=0;
    }
}
