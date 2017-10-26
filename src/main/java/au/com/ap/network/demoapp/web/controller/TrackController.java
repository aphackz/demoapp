package au.com.ap.network.demoapp.web.controller;

import au.com.ap.network.demoapp.dao.ArticleDao;
import au.com.ap.network.demoapp.domain.Article;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import java.util.HashMap;
import java.util.Map;

@Controller
public class TrackController {

    @Autowired
    private ArticleDao articleDao;

    @RequestMapping(path = "/track/{articleId}", method = RequestMethod.GET)
    public ModelAndView get(@PathVariable("articleId") Integer id) {
        Article article = articleDao.get(1);

        Map<String,Object> model = new HashMap<>();
        model.put("article", article);
        return new ModelAndView("track", model);
    }
}
