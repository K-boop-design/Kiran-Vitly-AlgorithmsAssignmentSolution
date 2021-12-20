package model;
import java.util.Scanner;
public class Company {
	
	public float stockPrice;
	public boolean sPriceIncrease;
	
	Scanner in = new Scanner(System.in);
	
	public void setStockPrice(int i) {
		System.out.println("Enter current stock price of the company "+(i+1));
		float price = in.nextFloat();
		this.stockPrice = price;
	}
	
	public void setsPriceIncrease() {
		System.out.println("Whether company's stock price rose today compare to yesterday?");
		boolean sPriceInc = in.nextBoolean();
		this.sPriceIncrease = sPriceInc;
	}
	
	public boolean issPriceIncrease() {
		return sPriceIncrease;
	}

	public float getStockPrice() {
		return stockPrice;
	}
}
