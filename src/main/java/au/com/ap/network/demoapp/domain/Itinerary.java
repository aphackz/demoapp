package au.com.ap.network.demoapp.domain;

import lombok.Getter;
import lombok.Setter;

import java.util.ArrayList;
import java.util.List;

@Getter
@Setter
public class Itinerary {
    private Integer id;
    private List<ItineraryNode> nodes = new ArrayList<>();

    public Itinerary putId(Integer id) {
        this.id = id;
        return this;
    }

    public Itinerary addNode(ItineraryNode node) {
        this.nodes.add(node);
        return this;
    }
}
