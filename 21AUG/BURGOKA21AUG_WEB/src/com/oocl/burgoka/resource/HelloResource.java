package com.oocl.burgoka.resource;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;

import net.webservicex.GeoIP;
import net.webservicex.GeoIPService;
import net.webservicex.GeoIPServiceSoap;

@Path("/hello/{ipaddress}")
public class HelloResource {

	public HelloResource() {
		// TODO Auto-generated constructor stub
	}
	
	@PathParam("ipaddress") String ipaddress;
	
	@GET
	@Produces("text/plain")
	public String hello() {
			//return "Welcome"; Exercise 4
			//String ipAddress = "204.79.197.200";
			GeoIPService ipService = new GeoIPService();
			GeoIPServiceSoap ipServiceSoap = ipService.getGeoIPServiceSoap(); 
			GeoIP geoIp = ipServiceSoap.getGeoIP(ipaddress);
			return geoIp.getCountryName();
		
	}

}
