package lt.unicorns_and_doges.wifind.model;

import org.springframework.data.annotation.Id;

import java.util.Date;

public class WifiSpot {

    @Id
    private String id;
    private String ssid;
    private Date lastUpdated;
    private Location location;

    public WifiSpot() {
    }

    public WifiSpot(String Ssid, Date lastUpdated, Location location) {
        this.ssid = Ssid;
        this.lastUpdated = lastUpdated;
        this.location = location;
    }

    public String getSsid() {
        return ssid;
    }

    public Date getLastUpdated() {
        return lastUpdated;
    }

    public Location getLocation() {
        return location;
    }
}
