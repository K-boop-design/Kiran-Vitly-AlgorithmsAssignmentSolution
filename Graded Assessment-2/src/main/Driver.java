package main;
import java.util.Scanner;
import model.Company;
import service.MergeSortImplA;
import service.MergeSortImplD;
import service.Working;

public class Driver {
	public static void main(String args []) {
		Scanner in = new Scanner(System.in);
		
		Working objW = new Working();
		int operation=6;
		
		System.out.println("enter the no of companies");
		int companyCount = in.nextInt();
		Company company[] = new Company[companyCount];
		for(int i=0; i<companyCount; i++) {
			company[i] = new Company();
			company[i].setStockPrice(i);
			company[i].setsPriceIncrease();
		}
		while(operation>0) {
			System.out.println("__________");
			System.out.println("Enter the operation that you want to perform");
			System.out.println("1. Display the companies stock prices in ascending order");
			System.out.println("2. Display the companies stock prices in descending order");
			System.out.println("3. Display the total no of companies for which stock prices rose today");
			System.out.println("4. Display the total no of companies for which stock prices declined today");
			System.out.println("5. Search a specific stock price");
			System.out.println("6. press 0 to exit");
			System.out.println("__________");
			operation=in.nextInt();
			
			if(operation==1) {
				MergeSortImplA objA = new MergeSortImplA();
				System.out.println("Stock prices in ascending order are :");
				objA.getCompany(company);
				objA.mergeSort(0, companyCount-1);
				 objA.display();
			}
			if(operation==2) {
				MergeSortImplD objD = new MergeSortImplD();
				System.out.println("Stock prices in descending order are :");
				objD.getCompany(company);
				objD.mergeSort(0, companyCount-1);
				objD.display();
			}
			if(operation==3) {
				System.out.println("Total no of companies whose stock price rose today :");
				objW.stockPriceInc(company);
			}
			if(operation==4) {
				System.out.println("Total no of companies whose stock price declined today :");
				objW.stockPriceDec(company);
			}
			if(operation==5) {
				objW.stockPriceSearch(company);
			}
		}
		System.out.println("Exited successfully");
		
	}
}
