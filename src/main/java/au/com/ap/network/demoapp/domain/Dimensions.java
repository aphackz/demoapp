package au.com.ap.network.demoapp.domain;

import lombok.Getter;
import lombok.Setter;

@Getter @Setter
public class Dimensions {
    private Integer x;
    private Integer y;
    private Integer z;

    public Dimensions putX(Integer x) {
        this.x = x;
        return this;
    }

    public Dimensions putY(Integer y) {
        this.y = y;
        return this;
    }

    public Dimensions putZ(Integer z) {
        this.z = z;
        return this;
    }
}
