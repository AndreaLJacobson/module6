
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
	
	public static void intSelectionSort(int[] numbers){ //*******INCOMPLETE******//
		int i = 0;
		
		int smallestIndex = 0;
		int temp;
		
		while(i < (numbers.length-1))
		{
			int j = i+1;
			smallestIndex = i;
			while(j < (numbers.length))
			{
				if(numbers[smallestIndex] > numbers[j])
				{
					smallestIndex = j;
				}
				j++;
			}
			if(smallestIndex != i)
			{
				temp = numbers[i];
				numbers[i] = numbers[smallestIndex];
				numbers[smallestIndex] = temp;
			}
			/*for(int k = 0; k < numbers.length; k++)
			{
				System.out.print(" " + numbers[k]);
			}
			System.out.println();*/
			i++;
		}	
		
	}//end intSelectionSort
	
	public static void main(String[] args){
		int[] mynumbers = { 1000, 999, 888, 777, 2, 666,55,33,2,1};
		intSelectionSort(mynumbers);
		
		System.out.print("In ascending order: [");
		for(int k = 0; k < mynumbers.length; k++)
		{
			System.out.print(" " + mynumbers[k]);
		}
	}
}


