package com.oocl.burgoka.webservice;

import net.webservicex.*;

public class WebserviceTest_sw1 {

	public WebserviceTest_sw1() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		
		if(args.length != 1) {
			System.out.println("You need to pass in one IP");
		}
		else {
			String ipAddress = args[0];
			GeoIPService ipService = new GeoIPService();
			GeoIPServiceSoap ipServiceSoap = ipService.getGeoIPServiceSoap(); 
			GeoIP geoIp = ipServiceSoap.getGeoIP(ipAddress);
			System.out.println(geoIp.getCountryCode());
			
		}
			
	}
}
