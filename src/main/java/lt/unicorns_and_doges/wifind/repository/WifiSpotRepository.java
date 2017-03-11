package lt.unicorns_and_doges.wifind.repository;

import lt.unicorns_and_doges.wifind.model.WifiSpot;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface WifiSpotRepository extends MongoRepository<WifiSpot, String> {

    public WifiSpot findBySsid(String ssid);

    public boolean existsBySsid(String ssid);

}