package excel;


import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class WriteData {

	public static void main(String[] args) throws IOException {
		// Create a new workbook (Excel file)
		XSSFWorkbook myWorkBook = new XSSFWorkbook();

		XSSFSheet mySheet = myWorkBook.createSheet("Sheet1");

	XSSFRow firstRow = mySheet.createRow(0);

	firstRow.createCell(0).setCellValue("Name");
	firstRow.createCell(1).setCellValue("Age");
	firstRow.createCell(2).setCellValue("Email");
	XSSFRow secondRow = mySheet.createRow(1);
	secondRow.createCell(0).setCellValue("John Doe");
	secondRow.createCell(1).setCellValue("30");
	secondRow.createCell(2).setCellValue("john@test.com");
	XSSFRow thirdRow = mySheet.createRow(2);
	thirdRow.createCell(0).setCellValue("John Doe");
	thirdRow.createCell(1).setCellValue("28");
	thirdRow.createCell(2).setCellValue("john@test.com");
	XSSFRow fourthRow = mySheet.createRow(3);
	fourthRow.createCell(0).setCellValue("Bob Smith");
	fourthRow.createCell(1).setCellValue("35");
	fourthRow.createCell(2).setCellValue("Jacky@example.com");
	XSSFRow fifthRow = mySheet.createRow(4);
	fifthRow.createCell(0).setCellValue("swapnil");
	fifthRow.createCell(1).setCellValue("35");
	fifthRow.createCell(2).setCellValue("swapnil@example.com");
	

		// Now we need to write this workbook to a file

		FileOutputStream fileOut = new FileOutputStream("pesrsondatasheet.xlsx");

		myWorkBook.write(fileOut);

		System.out.println("Excel file has been created successfully");

	}
		

	}


