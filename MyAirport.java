package module6;

import java.util.ArrayList;


public class MyAirport {

	private String city;
	private String country;
	private String code3;
	
	public String getCity(){return this.city;}
	public String getCountry(){return this.country;}
	public String getCode(){ return this.code3;}
	
	public static String findAirportCodeLinear(String toFind, MyAirport[] airports){
		for(int i = 0; i < airports.length; i++)
		{
			MyAirport a = airports[i];
			if(toFind.equalsIgnoreCase(a.getCity()))
				return a.getCode();
		}
			return null;
	}
	
	public static String findAirportCodeBinary(String toFind, MyAirport[] airports){
		int low = 0;
		int high = airports.length - 1;
		int mid;
		
		while(low <= high)
		{
			mid = low + ((high-low)/2);
			int compare = toFind.compareTo(airports[mid].getCity());
			
			if(compare < 0)
			{
				high = mid - 1;
			}
			
			else if(compare > 0)
			{
				low = mid + 1;
			}
			
			else //match found
				return airports[mid].getCode();
			
		}
		
			return null;
	}//end findAirportCodeBinary
}


