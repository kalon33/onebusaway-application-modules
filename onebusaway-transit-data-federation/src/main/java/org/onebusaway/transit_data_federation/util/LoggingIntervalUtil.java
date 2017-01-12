package org.onebusaway.transit_data_federation.util;

public class LoggingIntervalUtil {
	
	public static int getAppropriateLoggingInterval(int s){
				
		int interval = s/10;
		// rounded to lowest power of 10. 
		double exponent = Math.floor(Math.log10((double) interval));
		int roundedInterval = (int) Math.pow(10, exponent); 
		
		if (roundedInterval >= 1) {
			return roundedInterval;
		}
		else {
			return 1;
		}
		
	}

}