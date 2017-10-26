package au.com.ap.network.demoapp.domain;

import lombok.Getter;
import lombok.Setter;

@Getter @Setter
public class Outlet implements NetworkNode {
    private Integer id;
    private String name;
    private String type;
    private Address address;
    private String telephone;
    private String fax;
    private GeoCoord geoCoord;

    public Outlet putId(Integer id) {
        this.id = id;
        return this;
    }

    public Outlet putName(String name) {
        this.name = name;
        return this;
    }

    public Outlet putType(String type) {
        this.type = type;
        return this;
    }

    public Outlet putAddress(Address address) {
        this.address = address;
        return this;
    }

    public Outlet putTelephone(String telephone) {
        this.telephone = telephone;
        return this;
    }

    public Outlet putFax(String fax) {
        this.fax = fax;
        return this;
    }

    public Outlet putGeoCoord(GeoCoord geoCoord) {
        this.geoCoord = geoCoord;
        return this;
    }
}
