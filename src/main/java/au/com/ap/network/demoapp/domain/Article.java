package au.com.ap.network.demoapp.domain;

import lombok.Getter;
import lombok.Setter;

import java.math.BigDecimal;

@Getter @Setter
public class Article {
    private Integer id;
    private Itinerary itinerary;
    private String name;
    private Address destination;
    private BigDecimal weightKg;
    private Dimensions dimensions;

    public Article putId(Integer id) {
        this.id = id;
        return this;
    }

    public Article putItinerary(Itinerary itinerary) {
        this.itinerary = itinerary;
        return this;
    }

    public Article putName(String name) {
        this.name = name;
        return this;
    }

    public Article putDestination(Address destination) {
        this.destination = destination;
        return this;
    }

    public Article putWeight(BigDecimal weightKg) {
        this.weightKg = weightKg;
        return this;
    }

    public Article putDimensions(Dimensions dimensions) {
        this.dimensions = dimensions;
        return this;
    }
}

