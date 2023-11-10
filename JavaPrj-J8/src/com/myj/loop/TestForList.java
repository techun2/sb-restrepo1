package com.myj.loop;

import java.util.ArrayList;
import java.util.*;


public class TestForList {
	
	public static void main(String args[]) {
		List<String> allCities = new ArrayList<String>();
		allCities.add("Bombay");
		allCities.add("New York");
		allCities.add("London");
		
		for (String city : allCities) {
			System.out.println(city);
			
		}
		
		
		
	}

}
