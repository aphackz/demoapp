package au.com.ap.network.demoapp.web.controller.rest;

import au.com.ap.network.demoapp.dao.ArticleDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(path = "/rest")
public class EventRestController {

    @Autowired
    private ArticleDao articleDao;

    @RequestMapping(value = "/event", method = RequestMethod.POST)
    public void saveEvent(@RequestBody EventVO event) {
        articleDao.saveEvent(event);
    }
}
