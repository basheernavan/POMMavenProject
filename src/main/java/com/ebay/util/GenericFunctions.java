package com.ebay.util;

import org.testng.annotations.Test;
//we'll create all the project related or generic functions,
//these functions we can use entire project.
public class GenericFunctions {
	
	@Test
	public void sample() {
		XLS_Reader xls =new XLS_Reader("src/test/java/com/ebay/testdata/testdata.xlsx");
		System.out.println("Total rows: "+xls.getRowCount("mydata"));
		System.out.println("Get data: "+xls.getCellData("mydata", "username", 2));
		System.out.println("Get data: "+xls.getCellData("mydata", "password", 2));
		System.out.println("Get data: "+xls.getCellData("mydata", "pincode", 2));
				
	}
	
	//to get the test data from the Excel file: 
	
	

}
