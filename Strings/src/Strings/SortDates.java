package Strings;

import java.util.Arrays;

public class SortDates {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String [] dates = {"20 Sep 1958", "16 Mar 2068", "06 Jun 1933","25 May 2068","25 May 1912"};	
		sortDates(dates); 
//		System.out.println(extract("26 sep 2003"));
		
	}
	
	public static void sortDates(String[] dates) { 
		for(int i=0;i < dates.length-1;i++) {
			for (int j = 0; j < dates.length-1-i; j++) {
				if(extract(dates[j]) > extract(dates[j+1])) {
					swap(dates,j,j+1); 
				}
				if(extract(dates[j]) == extract(dates[j+1])) {
					if(extractMnth(dates[j]) > extractMnth(dates[j+1])) {
						swap(dates,j,j+1);
					}
				}
			}
		}
		System.out.println(Arrays.toString(dates));
	}

	public static void swap(String[] dates, int i, int min) {
		String temp= dates[i];
		dates[i] = dates[min]; 
		dates[min] = temp; 
	}
	
	public static int extract(String date) {
		String year = ""; 
//		System.out.println(date.length());
		for (int i = date.length()-1; i >= date.length()-4; i--) {
//			System.out.println(i);
			year = date.charAt(i) + year; 
		}
		
		return Integer.parseInt(year); 
	}
	
	public static int extractMnth(String date) {
//		System.out.println(date);
		if(date.toLowerCase().contains("jan")) {
			return 1;
		}
		else if(date.toLowerCase().contains("feb")) {
			return 2;
		}
		else if(date.toLowerCase().contains("mar")) {
			return 3;
		}
		else if(date.toLowerCase().contains("apr")) {
			return 4;
		}
		else if(date.toLowerCase().contains("may")) {
			return 5;
		}
		else if(date.toLowerCase().contains("jun")) {
			return 6;
		}
		else if(date.toLowerCase().contains("jul")) {
			return 7;
		}
		else if(date.toLowerCase().contains("aug")) {
			return 8;
		}
		else if(date.toLowerCase().contains("sep")) {
			return 9;
		}
		else if(date.toLowerCase().contains("oct")) {
			return 10;
		}
		else if(date.toLowerCase().contains("nov")) {
			return 11;
		}
		else if(date.toLowerCase().contains("dec")) {
			return 12;
		}
		
		else {
			return -1;
		}
	}
}
