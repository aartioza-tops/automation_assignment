package frmw;

public class DataDriven {
	public static void main(String args[]) {
		
		ExcelReader2 rd = new ExcelReader2("C:\\Users\\Tops\\Desktop\\library\\myTest.xlsx", "login");
		
		int row = rd.rowCount();
		int col = rd.colCount();
		
		System.out.println("row" + row);
		System.out.println("col" + col);
		
		for(int i=1;i<row;i++) {
			for(int j=0;j<col;j++) {
				String data = rd.GetData(i, j);
				System.out.println(data);
			}
		}
		
	}
}
