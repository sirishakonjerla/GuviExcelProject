package excel;


import java.io.FileOutputStream;


import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class CreateExcelWorkBook {

	public static void main(String[] args) throws Exception {
		XSSFWorkbook myWorkBook = new XSSFWorkbook();

		

		FileOutputStream fileOut = new FileOutputStream("Taskexcel.xlsx");

		myWorkBook.write(fileOut);

		System.out.println("Excel file has been created successfully");

	}

}
