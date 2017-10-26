package au.com.ap.network.demoapp.domain;

import lombok.Getter;
import lombok.Setter;

import java.math.BigDecimal;

@Getter
@Setter
public class GeoCoord {
    private BigDecimal latitude;
    private BigDecimal longitude;

    public GeoCoord putLatitude(BigDecimal latitude) {
        this.latitude = latitude;
        return this;
    }

    public GeoCoord putLongitude(BigDecimal longitude) {
        this.longitude = longitude;
        return this;
    }
}
