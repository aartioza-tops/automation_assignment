package frmw;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;



public class ExcelReader {

	public static void main(String[] args) {
		ExcelReader rd = new ExcelReader();
		int row = rd.rowCount();
		System.out.println("row " + row);
		
		int col = rd.colCount();
		System.out.println("col " + col);
		
		for(int i=1;i<row;i++) {
			for(int j=0;j<col;j++) {
				String data = rd.GetData(i, j);
				System.out.println(data);
			}
		}
		
		
	}
		// TODO Auto-generated method stub
			
		String filepath = "C:\\Users\\Tops\\Desktop\\library\\myTest.xlsx";
		String Sheetname = "login";
		
		public int rowCount() {
			int row = 0;
			
			try {
				XSSFWorkbook workbook = new XSSFWorkbook(filepath);
				XSSFSheet sheet = workbook.getSheet(Sheetname);
				row = sheet.getPhysicalNumberOfRows();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
			
			return row;
		}
		
		public int colCount() {
			int col = 0;
			
			try {
				XSSFWorkbook workbook = new XSSFWorkbook(filepath);
				XSSFSheet sheet = workbook.getSheet(Sheetname);
				col = sheet.getRow(0).getPhysicalNumberOfCells();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
			
			return col;
		}
		
		
		public String GetData(int row,int cols) {
			String data = null;
			try {
				XSSFWorkbook workbook = new XSSFWorkbook(filepath);
				XSSFSheet sheet = workbook.getSheet(Sheetname);
				data = sheet.getRow(row).getCell(cols).getStringCellValue();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
			
			return data;
		}
		
		
		
	

}
