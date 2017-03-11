package lt.unicorns_and_doges.wifind.model;

import org.springframework.data.annotation.Id;

public class Location {

    @Id
    private String id;
    private double latitude;
    private double longitude;

    public Location() {
    }

    public Location(double latitude, double longitude) {
        this.latitude = latitude;
        this.longitude = longitude;
    }

    public double getLatitude() {
        return latitude;
    }

    public double getLongitude() {
        return longitude;
    }
}
