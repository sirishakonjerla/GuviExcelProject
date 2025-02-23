package excel;


import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.ss.usermodel.*;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ReadDataToExcel {

	public static void main(String[] args) throws Exception {
		FileInputStream myFile = new FileInputStream(new File("writepersondata.xlsx"));

		// Now we need to create a workbook from this excel file :

		Workbook myWorkBook = new XSSFWorkbook(myFile);

		// Get the first sheet of our workbook
		Sheet mySheet = myWorkBook.getSheetAt(0);

		// Take all the row one by one and give cell number and then get the value

		for (Row row : mySheet) {

			for (Cell cell : row) {
				System.out.println("Cell value is :: " + cell.getStringCellValue());

			}
		}

	}

}
