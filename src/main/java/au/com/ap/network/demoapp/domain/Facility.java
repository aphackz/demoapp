package au.com.ap.network.demoapp.domain;

import lombok.Getter;
import lombok.Setter;

@Getter @Setter
public abstract class Facility implements NetworkNode {
    private Integer id;
    private String name;
    private Address address;
    private GeoCoord geoCoord;

    public Facility putId(Integer id) {
        this.id = id;
        return this;
    }

    public Facility putName(String name) {
        this.name = name;
        return this;
    }

    public Facility putAddress(Address address) {
        this.address = address;
        return this;
    }

    public Facility putGeoCoord(GeoCoord geoCoord) {
        this.geoCoord = geoCoord;
        return this;
    }
}
