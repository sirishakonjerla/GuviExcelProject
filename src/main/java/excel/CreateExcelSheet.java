package excel;


import java.io.FileOutputStream;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class CreateExcelSheet {

	public static void main(String[] args) throws Exception {
		XSSFWorkbook myWorkBook = new XSSFWorkbook();

		XSSFSheet mySheet = myWorkBook.createSheet("Sheet1");

		FileOutputStream fileOut = new FileOutputStream("ExcelSheet.xlsx");

		myWorkBook.write(fileOut);

		System.out.println("Excel file has been created with sheet successfully");

	}

}
