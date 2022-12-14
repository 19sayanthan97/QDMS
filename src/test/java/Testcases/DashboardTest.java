package Testcases;


import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

import Base.Initialization;
import Page.Dashboard;
import Page.LoginPage;

public class DashboardTest extends Initialization {

	
	 Dashboard Dashboardpg = new Dashboard();
	    
	    @Test
	    public void License() throws InterruptedException, IOException  {
	        
	       PageFactory.initElements(driver, Dashboardpg);
	        
	   
	            //if(driver.getCurrentUrl().contains(URL)) {
	            Thread.sleep(4500);
	            Dashboard.Master.click();
	            
	            Thread.sleep(4500);
	            Dashboard.Material.click();
	            
	            Thread.sleep(4500);
	            Dashboard.MaterialSub.click();
//	            
	            Thread.sleep(4500);
	            Dashboard.AddMaterialSub.click();
	            
	           Dashboard.MainCategoryDropdown.click();
	           
//	           Select drop = new Select("FINISH_PRODUCT");
//	           drop.selectByIndex(1);
	            
	            //Thread.sleep(2500);
//	            
//	            FileInputStream file = new FileInputStream("C:\\Users\\sgic\\Documents\\AutomationWorkspace\\TransportHub\\src\\test\\java\\Excel\\New Microsoft Excel Worksheet.xlsx\\");
//	            XSSFWorkbook workbook = new XSSFWorkbook(file);
//	            XSSFSheet sheet = workbook.getSheet("License");
//	    	        
//	    	        int rowcount = sheet.getLastRowNum();
//	    	        for(int i=0; i<=rowcount;i++) {        
//	    	      XSSFRow row = sheet.getRow(i);    
//	    	    
//	    	            String lName = (String)row.getCell(0).getStringCellValue();
//	    	            int lPrice = (int)row.getCell(1).getNumericCellValue();    
//	    	            
//	    	            
//	    	            LicensePage.licenseName.clear();
//	    	            LicensePage.licenseName.sendKeys(lName);
//	    	            LicensePage.licensePrice.clear();
//	    	            LicensePage.licensePrice.sendKeys(String.valueOf(lPrice));
//	    	            LicensePage.licenseSubmitButton.click();
//	    	            
//	            if (driver.getCurrentUrl().contains(expect)) {
//	                System.out.println(uName + pWord +"22222222");
//	            }
//	            else {
//	                System.out.println(uName + pWord +"33333333");
//	            }
	            
	    	        }
	    	        
	    
	    }
	    


