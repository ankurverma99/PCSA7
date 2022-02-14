package demoTestng;

import java.io.FileInputStream;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.testng.annotations.DataProvider;

public class ReadDP {

	@DataProvider
	public static String[][] read() throws Exception {
		String[][] st;
		FileInputStream fis = new FileInputStream("F:\\demo.xlsx");
		Workbook wb = WorkbookFactory.create(fis);
		Sheet sh = wb.getSheet("Sheet1");
		int rCount = sh.getPhysicalNumberOfRows();
		int cCount = sh.getRow(0).getLastCellNum();
		st = new String[rCount - 1][cCount];
		for (int i = 1; i < rCount; i++) {
			for (int j = 0; j < cCount; j++) {
				Cell cl = sh.getRow(i).getCell(j);
				st[i - 1][j] = cl.toString();
			}
		}
		return st;
	}

}
