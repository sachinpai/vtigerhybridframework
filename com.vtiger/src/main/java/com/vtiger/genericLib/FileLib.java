package com.vtiger.genericLib;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class FileLib {
	public String FetchExcelFileData(String sheet , int row, int col) throws EncryptedDocumentException, IOException {
		
		FileInputStream file = new FileInputStream("./src/main/resources/TestData.xlsx");
		
		Workbook book = WorkbookFactory.create(file);
		
		String value = book.getSheet(sheet).getRow(row).getCell(col).getStringCellValue();
		
		return value;
		
	}
	
	public String FetchPropertyFileData(String key) throws IOException {
		
		FileInputStream file = new FileInputStream("./src/main/resources/CommanData.properties");
		Properties pro = new Properties();
		pro.load(file);
		String value = pro.getProperty(key);
		return value;
		
	}
}
