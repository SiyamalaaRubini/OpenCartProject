package utilities;
import java.io.IOException;

import org.testng.annotations.*;

public class DataProviders {

	
	//Dataprovider 1
	@DataProvider(name="LoginData")
	public String[][] getdatafromExcel() throws IOException{
		
		String path=".\\test data\\Opencart_LoginTestData.xlsx";
		
		ExcelUtility xlutils=new ExcelUtility(path);
		
		int totalRow=xlutils.getRowCount("Sheet1");
		int totalColumn=xlutils.getCellCount("Sheet1", 3);
		
		String logindata[][]=new String[totalRow][totalColumn];
		
		for(int i=1;i<=totalRow;i++) {
			for(int j=0;j<totalColumn;j++) {
				
				logindata[i-1][j]=xlutils.getCellData("Sheet1", i, j);
				
			}
		}
		
		return logindata;
		
	}
	
	//Dataprovider 2
	
	//Dataprovider3
	
	
	//...
	
}
