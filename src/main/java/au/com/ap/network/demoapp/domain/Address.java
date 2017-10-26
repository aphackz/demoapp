package au.com.ap.network.demoapp.domain;

import lombok.Getter;
import lombok.Setter;

@Getter @Setter
public class Address {
    private String line1;
    private String line2;
    private String line3;
    private Integer postcode;
    private String state;

    public Address putLine1(String line1) {
        this.line1 = line1;
        return this;
    }

    public Address putLine2(String line2) {
        this.line2 = line2;
        return this;
    }

    public Address putLine3(String line3) {
        this.line3 = line3;
        return this;
    }

    public Address putPostcode(Integer postcode) {
        this.postcode = postcode;
        return this;
    }

    public Address putState(String state) {
        this.state = state;
        return this;
    }
}
