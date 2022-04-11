package orb.base;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.time.Duration;
import java.util.Scanner;

import org.apache.commons.io.FileUtils;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BaseClass {
	public static WebDriver driver;
	//public static org.openqa.selenium.support.ui.Select s;
	public static org.openqa.selenium.support.ui.Select s;
	public static void launchbrowser() {
		WebDriverManager.chromedriver().setup();
		driver= new ChromeDriver();
	}
	//geturl
	//2 launch url
	public static void launchurl(String url) {
	 driver.get(url);
	}
	//to maximize window
	public static void maxwindow() {
		driver.manage().window().maximize();
	}
	//to wait
	public static void towait() {
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	}


	//login
	public static void filltextbox(WebElement e, String val) {
		e.sendKeys(val);
	}
	//click
	public static void clk(WebElement e) {
		e.click();
	}
	//select
	public static void Select(WebElement e, String val) {
		s= new org.openqa.selenium.support.ui.Select(e);
		s.selectByValue(val);
	}
		//public static void selectInd(WebElement e, int val) {
          //r= new Select(e);
          //r.selectByIndex(val);
		//}
		
		// to read excel
		public static String readexcel(int rowno,int cellno) throws IOException {
			File fil=new File("C:\\Users\\kanag\\eclipse-workspace\\HotelInn\\Excel\\Book1.xlsx");
			FileInputStream fin = new FileInputStream(fil);
			XSSFWorkbook book = new XSSFWorkbook(fin);
			XSSFSheet sh1 = book.getSheet("Sheet1");
			XSSFRow row = sh1.getRow(rowno);
			XSSFCell cell = row.getCell(cellno);
			//type
			int type = cell.getCellType();
			String name="";

			if (type==1) {
				name = cell.getStringCellValue();
			}
			else {
				double d = cell.getNumericCellValue();
				long l= (long)d;//downcasting
				name = String.valueOf(l);  
			}

			return name;

		}
		  public static String gettext(WebElement e) {
			     String t = e.getAttribute("value");
			     return t;
			} 
		
		
		
		
	// get screen shot
	public static void Screenshot(String name) throws IOException {
		TakesScreenshot t= (TakesScreenshot)driver;//
		File sc = t.getScreenshotAs(OutputType.FILE);
		File dest= new File("C:\\Users\\Sairam\\eclipse-workspace\\BookHotel\\screenshot\\"+name+".png\\");
		FileUtils.copyDirectory(sc, dest);
	}
	//getname screen shot
	public static String getname() {
		Scanner scan = new Scanner(System.in);
		System.out.println("enter the filename");
		String name = scan.next();

		return name;
	}


}
