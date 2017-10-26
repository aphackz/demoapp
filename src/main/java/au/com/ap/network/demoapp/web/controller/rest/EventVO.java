package au.com.ap.network.demoapp.web.controller.rest;

import lombok.Getter;
import lombok.Setter;

import java.math.BigDecimal;

@Getter
@Setter
public class EventVO {
    enum EventType {LODGE, FACILITY, DELIVERY}
    enum LocationType {OUTLET, DISTRIBUTION_CENTRE, PROCESSING_CENTRE}

    private EventType eventType;
    private LocationType locationType;
    private Integer locationId;
    private ArticleVO article;

    @Getter
    @Setter
    public static class ArticleVO {
        private Integer id;
        private String name;
        private AddressVO destination;
        private BigDecimal weightKg;
        private DimensionsVO dimensions;
    }

    @Getter
    @Setter
    public static class AddressVO {
        private String line1;
        private String line2;
        private String line3;
        private String locality;
        private Integer postcode;
        private String state;

        public AddressVO putLine1(String line1) {
            this.line1 = line1;
            return this;
        }

        public AddressVO putLine2(String line2) {
            this.line2 = line2;
            return this;
        }

        public AddressVO putLine3(String line3) {
            this.line3 = line3;
            return this;
        }

        public AddressVO putPostcode(Integer postcode) {
            this.postcode = postcode;
            return this;
        }

        public AddressVO putState(String state) {
            this.state = state;
            return this;
        }
    }

    @Getter
    @Setter
    public static class DimensionsVO {
        private Integer x;
        private Integer y;
        private Integer z;

        public DimensionsVO putX(Integer x) {
            this.x = x;
            return this;
        }

        public DimensionsVO putY(Integer y) {
            this.y = y;
            return this;
        }

        public DimensionsVO putZ(Integer z) {
            this.z = z;
            return this;
        }
    }
}
