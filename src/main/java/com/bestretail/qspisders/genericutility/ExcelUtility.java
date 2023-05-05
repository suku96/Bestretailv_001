package com.bestretail.qspisders.genericutility;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class ExcelUtility {
	/**
	 * to read string data from Excel Workbook
	 * 
	 * @param sheetName
	 * @param rowIndex
	 * @param cellIndex
	 * @return
	 * @throws EncryptedDocumentException
	 * @throws IOException
	 */
	public String readStringDataFromExcel(String sheetName, int rowIndex, int cellIndex)
			throws EncryptedDocumentException, IOException {
		FileInputStream fis = new FileInputStream("./src/test/resources/bestretail.xlsx");
		Cell cell = WorkbookFactory.create(fis).getSheet(sheetName).getRow(rowIndex).getCell(cellIndex);
		return cell.getStringCellValue();
	}
  /**
   * to read numeric data from Excel Workbook
   * @param sheetName
   * @param rowIndex
   * @param cellIndex
   * @return
   * @throws EncryptedDocumentException
   * @throws IOException
   */
	public Double readNumericDataFromExcel(String sheetName, int rowIndex, int cellIndex)
			throws EncryptedDocumentException, IOException {
		FileInputStream fis = new FileInputStream("./src/test/resources/bestretail.xlsx");
		Cell cell = WorkbookFactory.create(fis).getSheet(sheetName).getRow(rowIndex).getCell(cellIndex);
		return cell.getNumericCellValue();
	}
}
