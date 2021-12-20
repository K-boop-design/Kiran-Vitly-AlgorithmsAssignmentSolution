package service;

import model.Company;

public class MergeSortImplA{
	Company company[];
	public void getCompany(Company companyI[]) {
		company=companyI;
	}
	public void merge(int left,int mid,int right) {
		int n1=mid-left+1;
		int n2=right-mid;
		
		Company leftarr[]=new Company[n1];
		Company rightarr[]=new Company[n2];
		
	    
	    for(int l=0;l<n1;l++) {
	    	leftarr[l]=new Company();
	    }
	    
	    
	    for(int m=0;m<n2;m++) {
	    	rightarr[m]=new Company();
	    }
		
		for(int i=0;i<n1;i++) {
			leftarr[i].stockPrice=company[left+i].stockPrice;
			leftarr[i].sPriceIncrease=company[left+i].sPriceIncrease;
		}
		
		for(int j=0;j<n2;j++) {
			rightarr[j].stockPrice=company[mid+1+j].stockPrice;
			rightarr[j].sPriceIncrease=company[mid+1+j].sPriceIncrease;
		}
		
		int i=0;
		int j=0;
		int k=left;
		
		while(i<n1&&j<n2) {
			if(leftarr[i].stockPrice<rightarr[j].stockPrice) {
				company[k].stockPrice=leftarr[i].stockPrice;
				company[k].sPriceIncrease=leftarr[i].sPriceIncrease;
				i++;	
			}
			else {
				company[k].stockPrice=rightarr[j].stockPrice;
				company[k].sPriceIncrease=rightarr[j].sPriceIncrease;
			}
			k++;
		}
		while(i<n1) {
			company[k].stockPrice=leftarr[i].stockPrice;
			company[k].sPriceIncrease=leftarr[i].sPriceIncrease;
			i++;
			k++;
		}
		while(j<n2) {
			company[k].stockPrice=rightarr[j].stockPrice;
			company[k].sPriceIncrease=rightarr[j].sPriceIncrease;
			j++;
			k++;
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
