package com.mavenproject.qa.Utils;

import java.io.FileInputStream;
import java.io.IOException;
import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import com.mavenproject.qa.Base.TestBase;

public class Utility extends TestBase {
	//1. Drawing the border around the element.
	
	 public static void borderbyJs (WebDriver driver, WebElement element) {
	    JavascriptExecutor js = ((JavascriptExecutor)driver);
		js.executeScript("arguments[0].style.border='3px solid red'", element);   // dom elemnts
	}
	 
	//2. Capture the title of the webpage. 
	 
	 public static String titlebyJS(WebDriver driver) {
			JavascriptExecutor js = ((JavascriptExecutor)driver);
			String Title = js.executeScript("return document.title;").toString();
			return Title;
	 }
	 
	 
	// 3. Click on perticular element.
	 
	 public static void clickbyJS(WebDriver driver, WebElement element) {
		    JavascriptExecutor js = ((JavascriptExecutor)driver);
		      js.executeScript("arguments[0].click();", element);
	 }
	 
	// 4. Generate an alert.
	 
	 public static void alertbyJS(WebDriver driver,String message) {
			JavascriptExecutor js = ((JavascriptExecutor)driver);
			js.executeScript("alert('"+ message +"')");
	 }
	 
	//5 . Refreshing the page
	 
	 public static void refreshbyJS(WebDriver driver) {
		 JavascriptExecutor js = ((JavascriptExecutor)driver);
			js.executeScript("history.go(0)");
	 }
	
	 
	  //6. Scrolling of the webpage.
	 
	 public static void scrolldownbyJS(WebDriver driver, int x, int y) {
		 JavascriptExecutor js = ((JavascriptExecutor)driver);
		 js.executeScript("scroll("+x+","+y+")");
	 }
	 
	 
	 public static void scrollupbyJS(WebDriver driver, int x, int y) {
		 JavascriptExecutor js = ((JavascriptExecutor)driver);
		 js.executeScript("scroll("+x+","+y+")");
	 }
	 

	 public static void scrollintoviewbyJS(WebDriver driver, WebElement element) {
		 JavascriptExecutor js = ((JavascriptExecutor)driver);
		js.executeScript("arguments[0].scrollIntoView(true);",element);
	 }
	 
	 
	 
	 // utility create excel 
	 
	 public static String datafromexcel(String Sheetname, int rowno, int colno) throws EncryptedDocumentException, IOException {
		    FileInputStream file = new FileInputStream("C:\\Users\\DELL\\Desktop\\30 AprilBatch.xlsx");
			String value = WorkbookFactory.create(file).getSheet(Sheetname).getRow(rowno).getCell(colno).getStringCellValue();
			return value;
	 }

}
