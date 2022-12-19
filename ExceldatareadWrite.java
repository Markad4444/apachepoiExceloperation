package baseclass11;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
 import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
//import org.apache.poi.sl.usermodel.Sheet;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class ExceldatareadWrite {

	public static void main(String[] args) {

		ExceldatareadWrite obj = new ExceldatareadWrite();
		String d1 = obj.readExcel("First", 0, 0);
	String d2 = obj.readExcel("First", 1, 0);
		String d3 = obj.readExcel("First", 0, 1);
		String d4 = obj.readExcel("First", 1, 1);
		System.out.println(d2);
		System.out.println(d2);
		System.out.println(d3);
		System.out.println(d4);
		ExceldatareadWrite obj1 = new ExceldatareadWrite();
		obj1.writeExcel("First",0,2,"vitthal");
		obj1.writeExcel("First",1,2,"markad");

	}

	public String readExcel(String sheetName, int rNum, int cNum) {

		FileInputStream file = null;
		try {
			file = new FileInputStream("E:\\New folder\\Rough\\file.abc\\mysheet.xlsx");
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		Sheet sheet = null;
		try {
			sheet = (Sheet) WorkbookFactory.create(file).getSheet(sheetName);
		} catch (EncryptedDocumentException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		String data = sheet.getRow(rNum).getCell(cNum).getStringCellValue();
		return data;
	}
    public void writeExcel(String sName,int rn, int cN, String datawrite)
{
	FileInputStream file1 = null;
	try {
		file1 = new FileInputStream("E:\\New folder\\Rough\\file.abc\\mysheet.xlsx");
	} catch (FileNotFoundException e2) {
		// TODO Auto-generated catch block
		e2.printStackTrace();
	}
	Workbook wb = null;
	try {
		wb = WorkbookFactory.create(file1);
	} catch (EncryptedDocumentException e1) {
		// TODO Auto-generated catch block
		e1.printStackTrace();
	} catch (IOException e1) {
		// TODO Auto-generated catch block
		e1.printStackTrace();
	}
	Sheet sheet1= wb.getSheet(sName);
	sheet1.getRow(rn).createCell(cN).setCellValue(datawrite);
	FileOutputStream file2 = null;
	try {
		file2 = new FileOutputStream("E:\\New folder\\Rough\\file.abc\\mysheet.xlsx");
	} catch (FileNotFoundException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	try {
		wb.write(file2);
	} catch (IOException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	
}

}
