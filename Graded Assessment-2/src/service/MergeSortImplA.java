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
		
		float leftarr[]=new float[n1];
		float rightarr[]=new float[n2];
		
		for(int i=0;i<n1;i++) {
			leftarr[i]=company[left+i].stockPrice;
		}
		
		for(int j=0;j<n2;j++) {
			rightarr[j]=company[mid+1+j].stockPrice;
		}
		
		int i=0;
		int j=0;
		int k=left;
		
		while(i<n1&&j<n2) {
			if(leftarr[i]<rightarr[j]) {
				company[k].stockPrice=leftarr[i];
				i++;	
			}
			else {
				company[k].stockPrice=rightarr[j];
			}
			k++;
		}
		while(i<n1) {
			company[k].stockPrice=leftarr[i];
			i++;
			k++;
		}
		while(j<n2) {
			company[k].stockPrice=rightarr[j];
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
