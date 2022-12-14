package Testcases;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import Base.Initialization;
import Page.LoginPage;

public class LoginTest extends Initialization {

	
	 LoginPage loginpg = new LoginPage();
	    
	    @Test
	    public void Login() throws InterruptedException, IOException  {
	        
	        PageFactory.initElements(driver, loginpg);
	        
	        FileInputStream file = new FileInputStream("C:\\Users\\sgic\\Documents\\AutomationWorkspace\\QDMS\\src\\test\\java\\Excel\\QDMS.xlsx");
	        XSSFWorkbook workbook = new XSSFWorkbook(file);
	        XSSFSheet sheet = workbook.getSheet("Login");
	        
	        int rowcount = sheet.getLastRowNum();
	        for(int i=0; i<=rowcount;i++) {        
	      XSSFRow row = sheet.getRow(i);    
	    
	            String uName = (String)row.getCell(0).getStringCellValue();
	            String pWord = (String)row.getCell(1).getStringCellValue();
	            
	            
	            //if(driver.getCurrentUrl().contains(URL)) {
	            LoginPage.Username.clear();
	            LoginPage.Username.sendKeys(uName);
	            LoginPage.Password.clear();
	            LoginPage.Password.sendKeys(pWord);
	            LoginPage.LoginButton.click();
	            //Thread.sleep(2500);
	            
//	            if (driver.getCurrentUrl().contains(expect)) {
//	                System.out.println(uName + pWord +"22222222");
//	            }
//	            else {
//	                System.out.println(uName + pWord +"33333333");
//	            }
	            
	        }
	        
	        
	        
	    }
	
	    
}