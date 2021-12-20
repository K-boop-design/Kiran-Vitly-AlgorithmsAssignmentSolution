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
	    float left[]=new float[middle-lower+1];
	    float right[]=new float[upper-middle];
	    for (i = 0; i < middle-lower+1; i++) {
	    	left[i] = company[lower + i].stockPrice;
	    }
	    
	    for (j = 0; j < upper-middle; j++) {
	    	right[j] = company[middle + 1 + j].stockPrice;
	    }
	        
	    i = 0; 
	    j = 0; 
	    k = lower; 
	    for (k=lower;i < middle-lower+1 && j < upper-middle;k++) 
	    {
	        if (left[i] > right[j]) company[k].stockPrice = left[i++];
	        else company[k].stockPrice = right[j++];
	    }
	    while (i < middle-lower+1) {
	    	company[k++].stockPrice = left[i++];
	    }
	    while (j < upper-middle) {
	    	company[k++].stockPrice = right[j++];
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
