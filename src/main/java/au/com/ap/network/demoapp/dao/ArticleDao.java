package au.com.ap.network.demoapp.dao;

import au.com.ap.network.demoapp.domain.*;
import org.joda.time.DateTime;
import org.springframework.stereotype.Component;

import java.math.BigDecimal;

@Component
public class ArticleDao {

    public Article get(Integer id) {
        return new Article()
                .putId(12345678)
                .putWeight(new BigDecimal("3.2"))
                .putDimensions(new Dimensions()
                        .putX(20)
                        .putY(30)
                        .putZ(10)
                )
                .putDestination(new Address()
                        .putLine1("Address line 1")
                        .putLine2("Address line 2")
                        .putPostcode(3000)
                        .putState("VIC")
                )
                .putItinerary(new Itinerary()
                        .putId(1)
                        .addNode(new ItineraryNode()
                                .putNetworkNode(new Outlet()
                                        .putId(1)
                                        .putName("Melbourne")
                                )
                                .putPassed(true)
                                .putPassedDate(new DateTime())
                        )
                        .addNode(new ItineraryNode()
                                .putNetworkNode(new Outlet()
                                        .putId(1)
                                        .putName("Dandenong PF")
                                )
                                .putPassed(true)
                                .putPassedDate(new DateTime())
                        )
                        .addNode(new ItineraryNode()
                                .putNetworkNode(new Outlet()
                                        .putId(1)
                                        .putName("Sydney PF")
                                )
                                .putPassed(false)
                                .putPassedDate(new DateTime())
                        )
                        .addNode(new ItineraryNode()
                                .putNetworkNode(new Outlet()
                                        .putId(1)
                                        .putName("Bankstown")
                                )
                                .putPassed(false)
                                .putPassedDate(new DateTime())
                        )
                );
    }
}
