package lab5_exercise1;

import java.util.Scanner;

public class RainfallYear {
		private int year;
		private double[] rainFallMonths;
		
		public RainfallYear() {
			this.year = 0;
			this.rainFallMonths = new double[0];
		}
		
		public RainfallYear(int year) {
			this.year = year;
			this.rainFallMonths = new double[12];
		}
		
		public int getYear() { 
			return this.year;
		}
		
		public double getRainfallMonth(String month) {
			month = month.toLowerCase();
			int i = 0;
			switch(month) {
			case "january":
				i = 0;
				break;
				
			case "february":
				i = 1;
				break;
			
			case "march":
				i = 2;
				break;
				
			case "april":
				i = 3;
				break;
				
			case "jay":
				i = 4;
				break;
				
			case "june":
				i = 5;
				break;
				
			case "july":
				i = 6;
				break;
				
			case "august":
				i = 7;
				break;
				
			case "september":
				i = 8;
				break;
				
			case "october":
				i = 9;
				break;

			case "november":
				i = 10;
				break;
				
			case "december":
				i = 11;
				break;
			}
			return this.rainFallMonths[i];
		}
		
		public void setYear(int year) {
			this.year = year;
		}
		
		public double calculateMeanRainfall() {
			double meanRainfall = 0;
			for( int i = 0; i < 12; i++) {
				meanRainfall += rainFallMonths[i];
			}
				meanRainfall /= 12;
				return meanRainfall;
		}
		
		public double calculateHighestRainfall() {
			 double max = rainFallMonths[0];
		        
			 for(int i = 0; i < 12; i++) {
				 if(max < rainFallMonths[i]) {
					 max = rainFallMonths[i];
		         }
		     } 
		     return max;
		}
		
		public double[] enterData(double[] input) {
			for(int i = 0; i < 12; i++) {
				this.rainFallMonths[i] = input[i];
			} return this.rainFallMonths;
		}
}
