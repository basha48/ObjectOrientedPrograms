package com.object.program;

import java.util.Scanner;

public class StockAccountManagement {
	String [] nameOfShare;
	
	public void getStockAmount() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter no of  stocks");
		int noOfStocks = sc.nextInt();
		System.out.println("Enter no shares");
		int noOfShares = sc.nextInt();
		System.out.println("Enter share names with saparete by comma");
	        nameOfShare = sc.next().split(",");
		System.out.println("Enter share price");
		int sharePrice = sc.nextInt();
		int totoalSharePrice = sharePrice * noOfShares;
		System.out.println("Total value of each stock is " + totoalSharePrice);
		int totalStockPrice = noOfStocks * totoalSharePrice;
		System.out.println("Total Stock Price is " + totalStockPrice);
		
	}
	
	public void getShareNames() {
		System.out.print("list of share names are :");
		for(String str :nameOfShare) {
			System.out.print(str +" ");
		}
	}
	
	public static void main(String [] args) {
		StockAccountManagement scm = new StockAccountManagement();
		scm.getStockAmount();
		scm.getShareNames();
	}

}
