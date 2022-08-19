package com.ActitimePro.Utility;

import java.io.FileInputStream;

//import java.io.FileNotFoundException;
//import java.io.IOException;
import java.util.Properties;

import org.apache.poi.ss.usermodel.DataFormatter;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

import com.ActitimePro.generic.Constant;

public class DataFetch{
	public String propertiesFetch(String path,String Key) throws Throwable
	{
		FileInputStream fis=new FileInputStream(path);
		Properties pobj=new Properties();
		pobj.load(fis);
		String data=pobj.getProperty(Key);
		return data;
	
	}
	public String excelFetch(String path,String sheetName,int row,int cell) throws Throwable
	{
		FileInputStream fis=new FileInputStream(path);
		Workbook book= WorkbookFactory.create(fis);
		Sheet sh=book.getSheet(sheetName);
		DataFormatter format=new DataFormatter();
		String data=format.formatCellValue(sh.getRow(row).getCell(cell));
		return data;
	}

}
