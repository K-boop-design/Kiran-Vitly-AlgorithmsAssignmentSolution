package service;

import model.Company;
import java.util.Scanner;

public class Working {
	
	public void stockPriceInc(Company company[]) {
		int companyCount=0;
		for(int i=0;i<company.length;i++) {
			if(company[i].issPriceIncrease()==true) {
				companyCount++;
			}
		}
		System.out.println(companyCount);
	}
	
	public void stockPriceDec(Company company[]) {
		int companyCount=0;
		for(int i=0;i<company.length;i++) {
			if(company[i].issPriceIncrease()==false) {
				companyCount++;
			}
		}
		System.out.println(companyCount);
	}
	
	public void stockPriceSearch(Company company[]) {
		float stockPrice;
		int flag=0;
		Scanner in=new Scanner(System.in);
		
		System.out.println("Enter the key value:");
		stockPrice=in.nextFloat();
		
		for(int i=0;i<company.length;i++) {
			if(company[i].getStockPrice()==stockPrice) {
				System.out.println("Stock of value "+stockPrice+" is present");
				flag=1;
				break;
			}
		}
		if(flag==0) {
			System.out.println("value not found");
		}
	}
}
