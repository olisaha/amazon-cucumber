package pageObject;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class searchedProductPage {
	public WebDriver driver;
	int cost=0;
	String p;
	String selectedmobilename;
	public searchedProductPage(WebDriver driver) {
		this.driver=driver;
	}
	
By mobileprice=By.xpath("//*[@class=\"a-price-whole\"]");	
By currencychangedropdown=By.xpath("//*[@id=\"icp-nav-flyout\"]/span/span[2]");
By currencychangebutton=By.xpath("//*[@id='icp-currency-dropdown-selected-item-prompt']");
By INRoption=By.xpath("//*[@id=\"INR\"]");
By savechangesoption= By.xpath("//span[@id=\"icp-save-button\"]");


public void dollartoINR() {
	
	driver.findElement(currencychangedropdown).click();
	driver.findElement(currencychangebutton).click();
	driver.findElement(INRoption).click();
	driver.findElement(savechangesoption).click();
}

public void sortingansselectingproduct() throws InterruptedException {
Thread.sleep(3000);
	List<WebElement> price =driver.findElements(mobileprice);
	ArrayList <Integer>a= new ArrayList<Integer>();	
for( int i=0;i<7;i++) 	
{
	String pricevalue = price.get(i).getText();
	//System.out.println(pricevalue +"and lenght=" +pricevalue.length() );
	
	
	if(pricevalue.length()==5) {
		String substring1= pricevalue.substring(0, 1);
		String substring2= pricevalue.substring(2,pricevalue.length());
		String actualprice =substring1.concat(substring2);
		//System.out.println(actualprice);}
		cost=Integer.parseInt(actualprice);}
	
	if (pricevalue.length()==6){
		
		String substring1= pricevalue.substring(0, 2);
		String substring2= pricevalue.substring(3,pricevalue.length());
		String actualprice =substring1.concat(substring2);
		//System.out.println(actualprice);}}}
		cost=Integer.parseInt(actualprice);
	}
	
	a.add(cost);
	Collections.sort(a); 
}
System.out.print("The prices are:" +a);
int lowp= a.get(0);
System.out.println("The lowest price among these is:"+lowp);
String stringp =String.valueOf(lowp);
String s1= stringp.substring(0, 1);
String s2= stringp.substring(1,stringp.length());
 p= s1+ ","+ s2;
System.out.println(p);}

public final By createXapthForCart(String fieldName)
{
	 By mycartXPATH=By.xpath(".//*[text()='"+fieldName+"']/parent::node()/parent::node()/following::button[text()='Add to cart']");
	return mycartXPATH;
	}

public void selectingprod() {
By Xpath1=createXapthForCart(p);
driver.findElement(Xpath1).click();

}
public final By createXapthForprodname(String fieldName)
{
	 By prodnameXPATH=By.xpath(".//*[text()='"+fieldName+"']/ancestor::div[@class='puisg-row']/descendant::div[@data-cy='title-recipe']/descendant::span");
	return prodnameXPATH;
	}


	public String getmobilename() 
	{
		By Xpath2=createXapthForprodname(p);
     String selectedmobilename= driver.findElement(Xpath2).getText();
     return selectedmobilename;
}}
	

