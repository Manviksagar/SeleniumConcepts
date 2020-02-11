import java.io.FileInputStream;
import java.io.FileNotFoundException;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class POI_ExcelRead {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		FileInputStream input = new FileInputStream("C:\\Users\\Va185060\\Desktop\\sag\\User.xlsx");

		XSSFWorkbook book = new XSSFWorkbook(input);
		XSSFSheet sheet = book.getSheetAt(0);
		System.out.println(sheet.getLastRowNum());
		
		int rowcount=sheet.getLastRowNum();
		int totalcol=sheet.getRow(0).getLastCellNum();
		System.out.println("the total row count" + rowcount);
		System.out.println("the total coloumn count" + totalcol);
		
		for(int i=0;i<=rowcount;i++) {
			
			System.out.println(sheet.getRow(i).getCell(0).getStringCellValue());
			System.out.println(sheet.getRow(i).getCell(1).getStringCellValue());
			System.out.println();
		}
		
	}

}
