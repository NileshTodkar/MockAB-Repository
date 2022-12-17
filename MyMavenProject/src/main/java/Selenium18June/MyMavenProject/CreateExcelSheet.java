package Selenium18June.MyMavenProject;
import org.openqa.selenium.WebDriver;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;  //to support excel file
import org.apache.poi.xssf.usermodel.XSSFSheet;    
import org.apache.poi.xssf.usermodel.XSSFRow;   
import org.apache.poi.xssf.usermodel.XSSFCell;  
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Cell;

public class CreateExcelSheet {
	
	public static void main(String [] args) throws IOException {
	    XSSFWorkbook workbook =new XSSFWorkbook();
	    XSSFSheet  sheet=workbook.createSheet();
	    
	    int [] Serial=new int[5];
	    
	    for(int i=0;i<Serial.length;i++) {
	    	Serial[i]=i+1;
	    }
	    
	    String[] Name=new String[5];
	    
	    Name[0]="Nilesh";
	    Name[1]="Laxmi";
	    Name[2]="Swapnil";
	    Name[3]="Shubham";
	    Name[4]="Nikhil";
	    
	    String[] status=new String[2];
	    
	    status[0]="Pass";
	    status[1]="Fail";
	    for(int i=0;i<Serial.length;i++) {
	    	
	    XSSFRow row=sheet.createRow(i);
	    
	    for(int j=0;j<4;j++) {
	    	  XSSFCell cell=row.createCell(j);
	    	  
	        if(cell.getColumnIndex()==0) {
	        	cell.setCellValue(Serial[i]);
	        	 }
	        
	        else if(cell.getColumnIndex()==1) {
	        	cell.setCellValue(Name[i]);
	        	}
	        else if(cell.getColumnIndex()==2) {
	        	cell.setCellValue(status[0]);
	        	}
	        }
	      }
	    
	    String path="E:\\Velocity Software Testing Cource\\Selenium Scripts\\Username1.xlsx";
	    FileOutputStream FO=new  FileOutputStream(path);
	    workbook.write(FO);
	    System.out.println("File is Created");
	    
	    }
}