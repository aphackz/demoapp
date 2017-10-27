package au.com.ap.network.demoapp.web.controller;

import au.com.ap.network.demoapp.dao.ArticleDao;
import au.com.ap.network.demoapp.domain.Article;
import au.com.ap.network.demoapp.domain.ItineraryNode;
import au.com.ap.network.demoapp.domain.NetworkNode;
import lombok.Getter;
import lombok.Setter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Controller
public class TrackController {

    @Autowired
    private ArticleDao articleDao;

    @RequestMapping(path = "/track/{articleId}", method = RequestMethod.GET)
    public ModelAndView get(@PathVariable("articleId") Integer id) {
        Article article = articleDao.get(id);

        Map<String, Object> model = new HashMap<>();

        List<Node> travelledNodes = new ArrayList<>();
        List<Node> untravelledNodes = new ArrayList<>();
        for (int i = 0; i < article.getItinerary().getNodes().size(); i++) {
            ItineraryNode node = article.getItinerary().getNodes().get(i);
            if (node.getPassed()) {
                travelledNodes.add(new Node()
                        .putCoords((i+1)*2 + ",1")
                        .putName(node.getNetworkNode().getName())
                );
            } else {
                if (article.getItinerary().getNodes().get(i - 1).getPassed()) {
                    untravelledNodes.add(new Node()
                            .putCoords(i*2 + ",1")
                            .putName(article.getItinerary().getNodes().get(i - 1).getNetworkNode().getName())
                    );
                }
                untravelledNodes.add(new Node()
                        .putCoords((i+1)*2 + ",1")
                        .putName(node.getNetworkNode().getName())
                );
            }
        }
        model.put("article", article);
        model.put("travelledNodes", travelledNodes);
        model.put("untravelledNodes", untravelledNodes);
        return new ModelAndView("track", model);
    }

    @Getter
    @Setter
    public class Node {
        private String coords;
        private String name;

        public Node putCoords(String cooords) {
            this.coords = cooords;
            return this;
        }

        public Node putName(String name) {
            this.name = name;
            return this;
        }
    }
}
