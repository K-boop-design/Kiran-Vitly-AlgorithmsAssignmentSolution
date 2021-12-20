package service;

import model.Company;

public class MergeSortImplD{
	Company company[];
	public void getCompany(Company companyI[]) {
		company=companyI;
	}
	public void merge(int lower, int middle, int upper) 
	{ 
	    int i, j, k; 
	    Company left[]=new Company[middle-lower+1];
	    
	    for(int l=0;l<middle-lower+1;l++) {
	    	left[l]=new Company();
	    }
	    
	    Company right[]=new Company[upper-middle];
	    
	    for(int m=0;m<upper-middle;m++) {
	    	right[m]=new Company();
	    }
	    
	    for (i = 0; i < middle-lower+1; i++) {
	    	left[i].stockPrice = company[lower + i].stockPrice;
	    	left[i].sPriceIncrease=company[lower + i].sPriceIncrease;
	    }
	    
	    for (j = 0; j < upper-middle; j++) {
	    	right[j].stockPrice = company[middle + 1 + j].stockPrice;
	    	right[j].sPriceIncrease=company[middle + 1 +j].sPriceIncrease;
	    }
	        
	    i = 0; 
	    j = 0; 
	    k = lower; 
	    for (k=lower;i < middle-lower+1 && j < upper-middle;k++) 
	    {
	        if (left[i].stockPrice > right[j].stockPrice) {
	        	company[k].stockPrice = left[i].stockPrice;
	        	company[k].sPriceIncrease=left[i++].sPriceIncrease;
	        }
	        else {
	        	company[k].stockPrice = right[j].stockPrice;
	        	company[k].sPriceIncrease=right[j++].sPriceIncrease;
	        }
	        
	    }
	    while (i < middle-lower+1) {
	    	company[k].stockPrice = left[i].stockPrice;
	    	company[k++].sPriceIncrease=left[i++].sPriceIncrease;
	    }
	    while (j < upper-middle) {
	    	company[k].stockPrice = right[j].stockPrice;
	    	company[k++].sPriceIncrease=right[j++].sPriceIncrease;
	    }
	}

	public void mergeSort(int left,int right) {
		if(left<right) {
			int mid=(left+right)/2;
			mergeSort(left,mid);
			mergeSort(mid+1,right);
			merge(left,mid,right);
		}
	}
	public void display() {
		for(int i=0;i<company.length;i++) {
			System.out.print(company[i].stockPrice+" ");
		}
		System.out.println();
	}
}
