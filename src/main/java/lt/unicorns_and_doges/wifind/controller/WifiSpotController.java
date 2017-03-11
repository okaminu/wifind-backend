package lt.unicorns_and_doges.wifind.controller;

import lt.unicorns_and_doges.wifind.model.WifiSpot;
import lt.unicorns_and_doges.wifind.repository.WifiSpotRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.Collection;

@RestController()
public class WifiSpotController {

    @Autowired
    WifiSpotRepository wifiSpotRepository;

    @RequestMapping(value = "/save", method = RequestMethod.POST)
    public boolean save(@RequestBody WifiSpot wifiSpot) {
        removeExisting(wifiSpot);
        wifiSpotRepository.save(wifiSpot);
        return true;
    }

    @RequestMapping(value = "/get-all", method = RequestMethod.GET)
    public Collection<WifiSpot> findAll() {
        return wifiSpotRepository.findAll();
    }

    private void removeExisting(@RequestBody WifiSpot wifiSpot) {
        WifiSpot wifiSpotBySsid = wifiSpotRepository.findBySsid(wifiSpot.getSsid());
        if (wifiSpotBySsid != null) {
            wifiSpotRepository.delete(wifiSpotBySsid);
        }
    }

}