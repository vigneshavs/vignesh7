package org.comp;

public class CompanyDetails {
	
	private void companyName() {
		System.out.println("company name is New star");
		
	}
	
	private void companyLocation() {
		System.out.println("Company location is chennai");

	}
	
	public static void main(String[] args) {
		
		CompanyDetails c = new CompanyDetails();
		c.companyLocation();
		c.companyName();
		
	}

}
