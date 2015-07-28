package LabItinerary;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Itinerary {

	private static Scanner input;
	public static void main(String[] args) {
		input = new Scanner(System.in);
		List<String> itinerary = new ArrayList<String>();
		
		String destination;
		boolean done = false;
		
		do
		{
			System.out.println("Destination: ");
			destination = input.nextLine();
			
			if(destination.equalsIgnoreCase("done"))
				done = true;
			
			else itinerary.add(destination.toUpperCase());
			
		}while(!done);
		
		System.out.println(travelRoute(itinerary, " to "));
		
	}
		private static String travelRoute(List<String>list, String seperator)
		{
		StringBuilder sb = new StringBuilder(20);

		for(String el:list)
		{
			{
				sb.append(seperator);
			}
		sb.append(el);
		}
		return sb.toString();
		}

	}


