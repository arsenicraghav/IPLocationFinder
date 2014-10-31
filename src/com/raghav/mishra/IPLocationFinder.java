package com.raghav.mishra;

import net.webservicex.GeoIP;
import net.webservicex.GeoIPService;
import net.webservicex.GeoIPServiceSoap;

public class IPLocationFinder {

	public static void main(String[] args) {
                
		if(args.length!=1)
		{
			System.out.println("IP address missing!");
		}
		else
		{
		  String ipaddress = args[0];	
		  GeoIPService ipService = new GeoIPService();
		  GeoIPServiceSoap geoIPServiceSoap = ipService.getGeoIPServiceSoap();
		  GeoIP geoIp=geoIPServiceSoap.getGeoIP(ipaddress);
		  System.out.println(geoIp.getCountryName());
		  
		  
		}

	}

}
