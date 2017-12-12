package Excel;

import java.io.File;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class ReadFomExcel {
public static void main(String[] args) throws EncryptedDocumentException, InvalidFormatException, IOException {
	String path="./data/Book3.xlsx";
	Workbook wb = WorkbookFactory.create(new File(path));
	Sheet s=wb.getSheet("sheet1");
	Row r=s.getRow(0);
	Cell c=r.getCell(0);
	String v=c.getStringCellValue();
	System.out.println(v);
	
}
}
