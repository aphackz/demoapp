package au.com.ap.network.demoapp.domain;

import lombok.Getter;
import lombok.Setter;
import org.joda.time.DateTime;

@Getter
@Setter
public class ItineraryNode {
    private Boolean passed;
    private DateTime passedDate;
    private NetworkNode networkNode;

    public ItineraryNode putPassed(Boolean passed) {
        this.passed = passed;
        return this;
    }

    public ItineraryNode putPassedDate(DateTime passedDate) {
        this.passedDate = passedDate;
        return this;
    }

    public ItineraryNode putNetworkNode(NetworkNode networkNode) {
        this.networkNode = networkNode;
        return this;
    }
}
