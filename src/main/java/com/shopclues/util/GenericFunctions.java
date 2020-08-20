package com.shopclues.util;

import org.testng.annotations.Test;
//we'll create all the project related or generic functions,
//these functions we can use entire project.
public class GenericFunctions {
	
	@Test
	public void sample() {
		XLS_Reader xls =new XLS_Reader("src/test/java/com/shopclues/testdata/home.xlsx");
		getTestData(xls, "login");				
	}
	
	//to get the test data from the Excel file: 
	public static Object[][] getTestData(XLS_Reader xls, String sheetName){
		if(!xls.isSheetExist(sheetName)){
			System.out.println("Test data not declared or sheet not exist");
		}
		int rows = xls.getRowCount(sheetName);
		int cols = xls.getColumnCount(sheetName);
		System.out.println("Total rows: "+rows);
		System.out.println("total columns: "+cols);
		//Object array declaration:
		Object[][] data = new Object[rows-1][cols];
		//array values declaration:
		for(int rowNum=2;rowNum<=rows;rowNum++){
			for(int colNum=0;colNum<cols;colNum++){
				System.out.print(xls.getCellData(sheetName, colNum, rowNum)+" | ");
				data[rowNum-2][colNum] = xls.getCellData(sheetName, colNum, rowNum);
			}
			System.out.println();
		}		
		return data;		
	}

}
