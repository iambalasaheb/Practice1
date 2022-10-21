package datadriventesting;

import org.testng.annotations.Test;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.testng.annotations.Test;

public class ExelOperation {
	/**
	 * 1. Get sheet count 2. All sheet name 3. Add new sheet 4. Delete existing
	 * sheet
	 * @throws IOException 
	 * 
	 * @throws IOException
	 */
  @Test(enabled=false)
  public void PerformOperationOnSheet() throws IOException {
	  //identify the path and name of exel file
	  FileInputStream fis=new FileInputStream(".\\src\\test\\resources\\AppTestData.xlsx");
	  //create an instance of workbook class
	  Workbook workbook=new XSSFWorkbook(fis);
	  //to get sheet count
	 int sheetcount= workbook.getNumberOfSheets();
	 System.out.println("sheet count: "+sheetcount);
	 //get all sheet name using for loop
	 for(int i=0;i<sheetcount;i++) {
		 System.out.println("sheet names: "+workbook.getSheetName(i));
	 }
	 //create new sheet
	 workbook.createSheet("sheet3");
	 //delete existing sheet
//	 workbook.removeSheetAt(1);
	 //create an instance of fileoutput stream
	 FileOutputStream fos=new FileOutputStream(".\\src\\test\\resources\\AppTestData.xlsx");
	 //to store the content into required file
	 workbook.write(fos);
	 //disconect the data connection
	 fos.flush();
	 fos.close();	 	 
  }

/**
 * @throws IOException 
 * 1. get row count 2. create new row 3. delete row
 * @throws  
 */
    @Test(enabled=false)
    public void PerformOperationOnRow() throws IOException  {
    	//create an instance of fileinputstream and pass location of exel in its constructor
    	FileInputStream fis=new FileInputStream(".\\src\\test\\resources\\AppTestData.xlsx");
    	//create an instance of workbook and pass fis in its constructor
    	Workbook workbook=new XSSFWorkbook(fis);
    	//Get the sheet on which operation to be perform
    	Sheet sheet=workbook.getSheet("Sheet1");
    	//perform required operation on sheet
    	//get row count
    	 int rowcount=sheet.getLastRowNum();
    	 System.out.println("row count: "+rowcount);
    	 //add new row in sheet
   // 	 sheet.createRow(rowcount+1);
    	 //delete row
    	 Row row=sheet.getRow(rowcount);
    	 //delete row
    	 sheet.removeRow(row);
    	//create an instance of fileoutputstream
    	 FileOutputStream fos=new FileOutputStream(".\\src\\test\\resources\\AppTestData.xlsx");
    	//write the content into required file
    	 workbook.write(fos);
    	 //disconect the data connection
    	 fos.flush();
    	 fos.close();
    	 System.out.println("updated row count; "+sheet.getLastRowNum());    	     	
    }
    @Test(enabled=false)
    public void PerformOperationOnCell() throws IOException{
    //create an instance of fileinputstream
    	FileInputStream fis=new FileInputStream(".\\src\\test\\resources\\AppTestData.xlsx");
    	//create an instance of workbook pan pass fis in its constructor
    	Workbook workbook=new XSSFWorkbook(fis);
    	//get the sheet on which operation to be ferform
    	Sheet sheet=workbook.getSheet("Sheet1");
    	//get row no 1 from sheet instance 
    	Row row=sheet.getRow(1);
    	//perform required operation on rowno. 1 cells
    	int cellcount=row.getLastCellNum();
    	System.out.println("get cell counts: "+cellcount);
    	
    	/*read cell contents*/
//		for (int i = 0; i < cellCount; i++) {
//
//			try {
//				/* switch to check cell type and read the content accordingly */
//				switch (row.getCell(i).getCellType()) {
//
//				case Cell.CELL_TYPE_STRING:
//					System.out.println("Cell contents are :" + row.getCell(i).getStringCellValue());
//					break;
//				case Cell.CELL_TYPE_NUMERIC:
//					System.out.println("Cell contents are :" + (int) row.getCell(i).getNumericCellValue());
//					break;
//
//				case Cell.CELL_TYPE_BLANK:
//
//					break;
//				default:
//					System.out.println("No matching cell found");
//					break;
//				}
//			} catch (NullPointerException e) {
//				System.out.println("Cell contents are :");
//			}
//
//		}
		
//		/*Create new cell and set its value*/
//		Cell cell=row.createCell(cellCount);
//		cell.setCellValue("pass");
    	
    	Cell cell=row.getCell(cellcount-1);
    	//to pass the value in cell
    	cell.setCellValue("Failed");
    	//create an instance of fileoutput stream
    	FileOutputStream fos=new FileOutputStream(".\\src\\test\\resources\\AppTestData.xlsx");
    	//write content in required file
    	fos.flush();
    	fos.close();   	
    }
    public void GetCellValue(String path,String sheetname,int cellno) throws IOException {
    	//identify path and name of excel file
    	FileInputStream fis=new FileInputStream(path);
    	/*create an instance of required workbook class*/
    	Workbook workbook=new XSSFWorkbook(fis);
    	//get the sheet on which operations to be perform
    	Sheet sheet=workbook.getSheet("sheetname");
    	//get row count by using sheet instance
    	int rowcount=sheet.getLastRowNum();
    	//print row count by using for loop
    	for(int i=0;i<rowcount;i++) {
    		Row row=sheet.getRow(i);
    		//using switch statement to check cell type and read the content accordingly
    		switch(row.getCell(cellno).getCellType()) {
    		case Cell.CELL_TYPE_STRING:
    			System.out.println("the value of cell: "+row.getCell(cellno).getStringCellValue());
    			break;
    		case Cell.CELL_TYPE_NUMERIC:
    			System.out.println("the numeric value of cell: "+row.getCell(cellno).getNumericCellValue());
    			break;
    		default:
    			System.out.println("No matchig cell found");
    			break;
    		}
    	}   	
    	
    }
    @Test
	public void getFirstCellValueFromEachRow() throws IOException{
		
    	GetCellValue(".\\src\\test\\resources\\AppTestData.xlsx", "Sheet1", 0);
	}
	
	@Test
	public void getCompleteDataFromScepecificSheet(){
		
	}
	
	@Test
	public void getRowsCountFromSheet(){
		
	}
	
	@Test
	public void getCellValueFromParticularRow(){
		
	}
	
	@Test 
	public void getSheetName(){
		
	}
	
	@Test 
	public void updateCellValue(){
		
	}
	
	@Test 
	public void createAndInsertValueInCell(){
		
	}
}

