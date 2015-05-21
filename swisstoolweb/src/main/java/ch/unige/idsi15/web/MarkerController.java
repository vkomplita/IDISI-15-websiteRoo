package ch.unige.idsi15.web;
import ch.unige.idsi15.Marker;

import org.apache.commons.logging.LogFactory;
import org.springframework.http.ResponseEntity;
import org.springframework.roo.addon.web.mvc.controller.scaffold.RooWebScaffold;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;


@RequestMapping("/markers")
@Controller
@RooWebScaffold(path = "markers", formBackingObject = Marker.class)
public class MarkerController {
	private final Log log = LogFactory.getLog(MarkerController.class);
	 
    @RequestMapping(value = "/Marker/locations", method = RequestMethod.GET)
    public ResponseEntity<String> getLocations(@RequestParam(value = "q", required = true) String cityName, @RequestParam(value = "limit", required = false) String limit, @RequestParam(value = "callback", required = false) String callback) {
    
        HttpHeaders responseHeaders = new HttpHeaders();
        responseHeaders.set("Access-Control-Allow-Origin", "http://swisstoolweb.cfapps.io");
        responseHeaders.set("Access-Control-Allow-Methods", "GET");
        responseHeaders.set("Access-Control-Allow-Headers", "");
        responseHeaders.set("Access-Control-Max-Age", "86400");

        return new ResponseEntity<String>("Hello", responseHeaders, HttpStatus.OK);
    }
 
}
