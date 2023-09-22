package configProvider;

import java.io.FileInputStream;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import login.xpath;


public class ExcelFileReader extends xpath{
	public String firstName;
	public String lastName;
	public String emailAddress;
	public String day;
	public String year;
	Cell cell;
	public String readExcel() throws Exception {
		FileInputStream file = new FileInputStream(getExcelPath());
		@SuppressWarnings("resource")
		Workbook workbook = new XSSFWorkbook(file);	
		Sheet sheet = workbook.getSheetAt(0);
		/*
		 * String name1 = workbook.getSheetName(0); String name2 =
		 * workbook.getSheetName(1); System.out.println(name1);
		 * System.out.println(name2);
		 */
		int rowCount = sheet.getLastRowNum()-sheet.getFirstRowNum();
		for (int i = 0; i < rowCount+1; i++) {
	        Row row = sheet.getRow(i);
	        for (int j = 0; j < row.getLastCellNum(); j++) {
	        	cell = row.getCell(j);
	        	switch (j){
	        	case 0:
	        		//getValues();
	        		firstName = cell.getStringCellValue();
	        	break;
	        	case 1:
	        		lastName = cell.getStringCellValue();
	        	break;
	        	case 2:
	        		emailAddress = cell.getStringCellValue();
	        	break;
	        	case 3:
	        		day = cell.getStringCellValue();
	        	break;
	        	case 4:
	        		year = cell.getStringCellValue();
	        	break;
	        	}
	        	
	        	}
			}
		return firstName;
		}
		/*
		 * public String getValues() { firstName = cell.getStringCellValue(); return
		 * firstName; }
		 */
	}

