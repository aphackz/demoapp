package au.com.ap.network.demoapp.dao;

import au.com.ap.network.demoapp.domain.*;
import au.com.ap.network.demoapp.web.controller.rest.EventVO;
import org.joda.time.DateTime;
import org.springframework.stereotype.Component;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

@Component
public class ArticleDao {
    private static final Map<Integer, Article> articles = new HashMap<>();

    public void saveEvent(EventVO event) {
        Article article = articles.get(event.getArticle().getId());
        if (article == null) {
            article = new Article()
                    .putId(event.getArticle().getId())
                    .putName(event.getArticle().getName())
                    .putDestination(new Address()
                            .putLine1(event.getArticle().getDestination().getLine1())
                            .putLine2(event.getArticle().getDestination().getLine2())
                            .putLine3(event.getArticle().getDestination().getLine3())
                            .putPostcode(event.getArticle().getDestination().getPostcode())
                            .putState(event.getArticle().getDestination().getState())
                    )
                    .putWeight(event.getArticle().getWeightKg())
                    .putDimensions(new Dimensions()
                            .putX(event.getArticle().getDimensions().getX())
                            .putY(event.getArticle().getDimensions().getY())
                            .putZ(event.getArticle().getDimensions().getZ())
                    )
                    .putItinerary(new Itinerary()
                            .putId(1)
                            .addNode(new ItineraryNode()
                                    .putNetworkNode(new Outlet()
                                            .putId(1)
                                            .putName("111 Bourke St")
                                    )
                            )
                            .addNode(new ItineraryNode()
                                    .putNetworkNode(new DistributionCentre()
                                            .putId(2)
                                            .putName("Dandenong DC")
                                    )
                            )
                            .addNode(new ItineraryNode()
                                    .putNetworkNode(new DistributionCentre()
                                            .putId(3)
                                            .putName("Sydney West DC")
                                    )
                            )
                            .addNode(new ItineraryNode()
                                    .putNetworkNode(new ResidentialAddress()
                                            .putId(4)
                                            .putName("Bankstown")
                                    )
                            )
                    );
            articles.put(event.getArticle().getId(), article);
        }
        if (event.getEventType() == EventVO.EventType.LODGE) {
            for (ItineraryNode node: article.getItinerary().getNodes()) {
                node.setPassed(false);
                node.setPassedDate(null);
            }
        }
        for (ItineraryNode node: article.getItinerary().getNodes()) {
            if (node.getNetworkNode().getId().equals(event.getLocationId())) {
                node.setPassed(true);
                node.setPassedDate(new DateTime());
            }
        }
    }

    public Article get(Integer id) {
        return articles.get(id);
//        return new Article()
//                .putId(12345678)
//                .putWeight(new BigDecimal("3.2"))
//                .putDimensions(new Dimensions()
//                        .putX(20)
//                        .putY(30)
//                        .putZ(10)
//                )
//                .putDestination(new Address()
//                        .putLine1("Address line 1")
//                        .putLine2("Address line 2")
//                        .putPostcode(3000)
//                        .putState("VIC")
//                )
//                .putItinerary(new Itinerary()
//                        .putId(1)
//                        .addNode(new ItineraryNode()
//                                .putNetworkNode(new Outlet()
//                                        .putId(1)
//                                        .putName("Melbourne")
//                                )
//                                .putPassed(true)
//                                .putPassedDate(new DateTime())
//                        )
//                        .addNode(new ItineraryNode()
//                                .putNetworkNode(new Outlet()
//                                        .putId(1)
//                                        .putName("Dandenong PF")
//                                )
//                                .putPassed(true)
//                                .putPassedDate(new DateTime())
//                        )
//                        .addNode(new ItineraryNode()
//                                .putNetworkNode(new Outlet()
//                                        .putId(1)
//                                        .putName("Sydney PF")
//                                )
//                                .putPassed(true)
//                                .putPassedDate(new DateTime())
//                        )
//                        .addNode(new ItineraryNode()
//                                .putNetworkNode(new Outlet()
//                                        .putId(1)
//                                        .putName("Bankstown")
//                                )
//                                .putPassed(false)
//                                .putPassedDate(new DateTime())
//                        )
//                );
    }
}
