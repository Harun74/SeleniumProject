package utils_integrateExcelWDatapro;

import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ReadExcel {

	//public static String[][] main(String[] args) {
		
		public String[][] readExcel() throws IOException {
		
		 //Open/Enter the workbook
		XSSFWorkbook wb = new XSSFWorkbook("./data/ReadData.xlsx");
		
	  //Get Sheet
		//XSSFSheet sheet = wb.getSheet("data");
		XSSFSheet sheet = wb.getSheetAt(0);
	
		//Get row count
		int rowCount = sheet.getLastRowNum();
		System.out.println(rowCount);
		
		//Get column count
		int columnnCount = sheet.getRow(0).getLastCellNum();
		System.out.println(columnnCount);
		
		//String[][] data = new String[2][3];
		
		String[][] data = new String[rowCount][columnnCount];
		
		for (int i = 1; i <= rowCount; i++) {
			
			//Get row
			XSSFRow row = sheet.getRow(i);
				
		for (int j = 0; j < columnnCount; j++) {
						
			//Get cell
			XSSFCell cell = row.getCell(j);
			//Action- Read/print particular CellValue from excelSheet
			String value = cell.getStringCellValue();
			System.out.println(value);
			 
			//data[0][0] = "TCS"
					
			//data[i][j] = value; [Note:i=1,i-1=1-1=0]	
			data[i-1][j] = value;		
					
					}//end column loop
				}//end row loop
	
		
		return data;
		
		
	}

}
