package com.TestCases;

import java.io.File;
import java.io.FileInputStream;

import org.openqa.selenium.OutputType;

import com.sun.jna.platform.FileUtils;

import jxl.Sheet;
import jxl.Workbook;

public class ReadfromXL {

	public static void main(String[] args) throws Exception
	{
		
		File path=new File("E:\\teja\\Testdata.xls");
		FileInputStream fis=new FileInputStream(path);
		Workbook wb=Workbook.getWorkbook(fis);
		Sheet sh=wb.getSheet(0);
		// To get the number of rows present in sheet
				int totalNoOfRows = sh.getRows();

				// To get the number of columns present in sheet
				int totalNoOfCols = sh.getColumns();

				for (int row=0;row<totalNoOfRows;row++) 
				{

					for (int col=0;col<totalNoOfCols;col++) 
					{
						System.out.print(sh.getCell(col,row).getContents() + "\t");
					}
					System.out.println();
				}
				
				//takeScreenshot
				File src=new File("E:\\teja");
				//File dest=(TakesScreenShot(driver)).getScteenShotAs(OutputType.FILE);

		/*String conent=sh.getCell(2,2).getContents();
		String data=sh.getCell(2,0).getContents();
		System.out.println(conent);
		System.out.println(data);*/
		
		
	

}
}
