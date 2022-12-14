package Page;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Dashboard {
	
	@FindBy(xpath = "//*[@id=\"root\"]/div/section/section/main/div/div/div/div[1]/a/div/div")
	public static WebElement Master;
	
	@FindBy(xpath = "//*[@id=\"root\"]/div/section/section/header/ul/li[3]/span/a")
	public static WebElement Material;
//	
	@FindBy(xpath = "//*[@id=\"root\"]/div/section/section/main/div/div/div[1]/div/div[2]/div[1]")
	public static WebElement MaterialSub;
//   
	@FindBy(xpath = "//*[@id=\"root\"]/div/section/section/main/div/div/div[2]/div/div/div/div/div/div/div[1]/div/div[3]/button/span")
	public static WebElement AddMaterialSub;
	
	@FindBy(id = "mainType")
	public static WebElement MainCategoryDropdown;
	
	
//	
//	@FindBy(xpath = "/html/body/div[2]/div[3]/div/div[2]/form/div[1]/div/div[2]/div/input")
//	public static WebElement licensePrice;
//	
//	@FindBy(xpath = "/html/body/div[2]/div[3]/div/div[2]/form/div[2]/div/button[2]")
//	public static WebElement licenseSubmitButton;
//	
	
	
	
	
}
