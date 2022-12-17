package Selenium18June.MyMavenProject;
import org.openqa.selenium.WebDriver;
import java.io.FileInputStream;
import java.io.IOException;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;  //to support excel file
import org.apache.poi.xssf.usermodel.XSSFSheet;    
import org.apache.poi.xssf.usermodel.XSSFRow;   
import org.apache.poi.xssf.usermodel.XSSFCell;  
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Cell;
public class ExcelSheetParameterization {
	public static void main(String [] args) throws IOException {
		
FileInputStream un=new FileInputStream("E:\\Velocity Software Testing Cource\\Selenium Scripts\\User Details.xlsx");
    XSSFWorkbook workbook =new XSSFWorkbook(un);
    XSSFSheet  sheet=workbook.getSheetAt(0);  //to get sheet
    XSSFRow row=sheet.getRow(2); // to get row
    XSSFCell cell=row.getCell(1); //to get cell
    XSSFCell cell1=row.getCell(2); //to get cell
    XSSFCell cell2=row.getCell(3); //to get cell
    XSSFCell cell3=row.getCell(4); //to get cell
    XSSFCell cell4=row.getCell(5); //to get cell
    XSSFCell cell5=row.getCell(6); //to get cell
    XSSFCell cell6=row.getCell(7); //to get cell
    System.out.println("UserID= "+sheet.getRow(2).getCell(1));
    System.out.println("First Name= "+sheet.getRow(2).getCell(2));
    System.out.println("Last Name= "+sheet.getRow(2).getCell(3));
    System.out.println("Email ID= "+sheet.getRow(2).getCell(4));
    System.out.println("Mobile No= "+sheet.getRow(2).getCell(5));
    System.out.println("Username= "+sheet.getRow(2).getCell(6));
    System.out.println("Password= "+sheet.getRow(2).getCell(7));
	
	}

}
