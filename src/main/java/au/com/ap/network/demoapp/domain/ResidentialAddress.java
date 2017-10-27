package au.com.ap.network.demoapp.domain;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class ResidentialAddress implements NetworkNode {
    private Integer id;
    private String name;

    public ResidentialAddress putId(Integer id) {
        this.id = id;
        return this;
    }

    public ResidentialAddress putName(String name) {
        this.name = name;
        return this;
    }
}
