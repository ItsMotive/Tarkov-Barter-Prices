import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.firefox.FirefoxBinary;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.openqa.selenium.firefox.FirefoxProfile;
import org.openqa.selenium.firefox.*;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;


public class DriverSetup {
	
	//1000000 --> 1,000,000
	private static String regexCommafy(String inputNum)
    {
        String regex = "(\\d)(?=(\\d{3})+$)";
        String [] splittedNum = inputNum.split("\\.");
        if(splittedNum.length==2)
        {
            return splittedNum[0].replaceAll(regex, "$1,")+"."+splittedNum[1];
        }
        else
        {
            return inputNum.replaceAll(regex, "$1,");
        }
    }
	
	
	//THICC Items Barter
	public static String THICCItems(int m, int v, int w)
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Austin\\Desktop\\Drivers\\chromedriver.exe");
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--headless");
		WebDriver driver = new ChromeDriver(options);
		
		
		int numVodka = 50 - v;
		int numMoon = 50 - m;
		int numWhisk = 30 - w;
		

		//Moonshine
		driver.get("https://tarkov-market.com/item/fierce_hatchling_moonshine");
		String moonShine = driver.findElement(By.xpath("//*[@id=\"__layout\"]/div/div/div[2]/div[2]/div[3]/div[1]/div[2]/div/div[1]/div[3]/div[2]/span")).getText();
		//creating a constructor of StringBuffer class  
		StringBuffer moon= new StringBuffer(moonShine);  
		//invoking the method  
		String c = moon.deleteCharAt(moon.length()-1).toString();  
		c = c.replace(",","");
		//prints the string after deleting the character
		int k=Integer.parseInt(c);
		System.out.println("Moonshine Price: "+c);  
		System.out.println("Need: "+numMoon+"\nWhich costs: "+(k*numMoon)+"\n"); 
		
		//Whiskey
		driver.get("https://tarkov-market.com/item/Bottle_of_Dan_Jackiel_Whiskey");
		String whiskey = driver.findElement(By.xpath("//*[@id=\"__layout\"]/div/div/div[2]/div[2]/div[3]/div[1]/div[2]/div/div[1]/div[3]/div[2]/span")).getText();
		//creating a constructor of StringBuffer class  
		StringBuffer jD= new StringBuffer(whiskey);  
		//invoking the method  
		String a = jD.deleteCharAt(jD.length()-1).toString(); 
		a = a.replace(",","");
		//prints the string after deleting the character   
		int i=Integer.parseInt(a);
		System.out.println("Whiskey Price: "+a);  
		System.out.println("Need: "+numWhisk+"\nWhich costs: "+(i*numWhisk)+"\n"); 
		
		//Vodka
		driver.get("https://tarkov-market.com/item/Bottle_of_vodka_Tarkovskaya");
		String vodka = driver.findElement(By.xpath("//*[@id=\"__layout\"]/div/div/div[2]/div[2]/div[3]/div[1]/div[2]/div/div[1]/div[3]/div[2]/span")).getText();
		//creating a constructor of StringBuffer class  
		StringBuffer tarkVod= new StringBuffer(vodka);  
		//invoking the method  
		String b = tarkVod.deleteCharAt(tarkVod.length()-1).toString();  
		b = b.replace(",","");
		//prints the string after deleting the character   
		int j=Integer.parseInt(b);
		System.out.println("Vodka Price: "+b);  
		System.out.println("Need: "+numVodka+"\nWhich costs: "+(j*numVodka)+"\n"); 
		
		//calculates the total price
		int results = (i*numWhisk)+(j*numVodka)+(k*numMoon);
		String result = String.valueOf(results);
		result = regexCommafy(result);
		System.out.println("THICC Items Case Barter Price: "+result);
		return result;
		
	}

	
	//Weapon Case Barter
	public static String WeaponCase(int m, int w, int l, int a)
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Austin\\Desktop\\Drivers\\chromedriver.exe");
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--headless");
		WebDriver driver = new ChromeDriver(options);
		
		int numMotor = 8 - m;
		int numWires = 15 - w;
		int numLCD = 4 - l;
		int numAESA = 1 - a;
		

		//Motor
		driver.get("https://tarkov-market.com/item/Electric_motor");
		String moonShine = driver.findElement(By.xpath("//*[@id=\"__layout\"]/div/div/div[2]/div[2]/div[3]/div[1]/div[2]/div/div[1]/div[3]/div[2]/span")).getText();
		//creating a constructor of StringBuffer class  
		StringBuffer moon= new StringBuffer(moonShine);  
		//invoking the method  
		String y = moon.deleteCharAt(moon.length()-1).toString();  
		y = y.replace(",","");
		//prints the string after deleting the character  
		int i=Integer.parseInt(y);
		System.out.println("Motor Price: "+y); 
		System.out.println("Need: "+numMotor+" Which costs: "+(i*numMotor)+"\n"); 
		
		//Wires
		driver.get("https://tarkov-market.com/item/Wires");
		String whiskey = driver.findElement(By.xpath("//*[@id=\"__layout\"]/div/div/div[2]/div[2]/div[3]/div[1]/div[2]/div/div[1]/div[3]/div[2]/span")).getText();
		//creating a constructor of StringBuffer class  
		StringBuffer jD= new StringBuffer(whiskey);  
		//invoking the method  
		String b = jD.deleteCharAt(jD.length()-1).toString();  
		b = b.replace(",","");
		//prints the string after deleting the character
		int j=Integer.parseInt(b);
		System.out.println("Wires Price: "+b);  
		System.out.println("Need: "+numWires+" Which costs: "+(j*numWires)+"\n"); 
		
		//LCD
		driver.get("https://tarkov-market.com/item/Broken_LCD");
		String vodka = driver.findElement(By.xpath("//*[@id=\"__layout\"]/div/div/div[2]/div[2]/div[3]/div[1]/div[2]/div/div[1]/div[3]/div[2]/span")).getText();
		//creating a constructor of StringBuffer class  
		StringBuffer tarkVod= new StringBuffer(vodka);  
		//invoking the method  
		String c = tarkVod.deleteCharAt(tarkVod.length()-1).toString(); 
		c = c.replace(",","");
		//prints the string after deleting the character  
		int k=Integer.parseInt(c);
		System.out.println("LCD Price: "+k);  
		System.out.println("Need: "+numLCD+" Which costs: "+(k*numLCD)+"\n"); 
		
		
		//AESA
		driver.get("https://tarkov-market.com/item/Phased_array_element");
		String AESA = driver.findElement(By.xpath("//*[@id=\"__layout\"]/div/div/div[2]/div[2]/div[3]/div[1]/div[2]/div/div[1]/div[3]/div[2]/span")).getText();
		//creating a constructor of StringBuffer class  
		StringBuffer ASA= new StringBuffer(AESA);  
		//invoking the method  
		String d = ASA.deleteCharAt(ASA.length()-1).toString(); 
		d = d.replace(",","");
		//prints the string after deleting the character  
		int x=Integer.parseInt(d);
		System.out.println("AESA Price: "+d); 
		System.out.println("Need: "+numAESA+" Which costs: "+(x*numAESA)+"\n");
		
		//calculates the total price
		int results = (i*numMotor)+(j*numWires)+(k*numLCD)+(x*numAESA);
		String result = String.valueOf(results);
		result = regexCommafy(result);
		System.out.println("THICC Items Case Barter Price: "+result);
		return result;
		
	}
	
	//Medicine Case Barter
	public static String MedCase(int m, int w, int l, int a)
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Austin\\Desktop\\Drivers\\chromedriver.exe");
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--headless");
		WebDriver driver = new ChromeDriver(options);
		
		int numBlood = 7 - m;
		int numSyringe = 7 - w;
		int numVase = 2 - l;
		int numMed = 1 - a;
		

		//BloodSet
		driver.get("https://tarkov-market.com/item/Medical_bloodset");
		String moonShine = driver.findElement(By.xpath("//*[@id=\"__layout\"]/div/div/div[2]/div[2]/div[3]/div[1]/div[2]/div/div[1]/div[3]/div[2]/span")).getText();
		//creating a constructor of StringBuffer class  
		StringBuffer moon= new StringBuffer(moonShine);  
		//invoking the method  
		String y = moon.deleteCharAt(moon.length()-1).toString();  
		y = y.replace(",","");
		//prints the string after deleting the character  
		int i=Integer.parseInt(y);
		System.out.println("Bloodset Price: "+y); 
		System.out.println("Need: "+numBlood+" Which costs: "+(i*numBlood)+"\n"); 
		
		//Syringe
		driver.get("https://tarkov-market.com/item/Disposable_syringe");
		String whiskey = driver.findElement(By.xpath("//*[@id=\"__layout\"]/div/div/div[2]/div[2]/div[3]/div[1]/div[2]/div/div[1]/div[3]/div[2]/span")).getText();
		//creating a constructor of StringBuffer class  
		StringBuffer jD= new StringBuffer(whiskey);  
		//invoking the method  
		String b = jD.deleteCharAt(jD.length()-1).toString();  
		b = b.replace(",","");
		//prints the string after deleting the character
		int j=Integer.parseInt(b);
		System.out.println("Syringe Price: "+b);  
		System.out.println("Need: "+numSyringe+" Which costs: "+(j*numSyringe)+"\n"); 
		
		//Vaseline
		driver.get("https://tarkov-market.com/item/Vaseline");
		String vodka = driver.findElement(By.xpath("//*[@id=\"__layout\"]/div/div/div[2]/div[2]/div[3]/div[1]/div[2]/div/div[1]/div[3]/div[2]/span")).getText();
		//creating a constructor of StringBuffer class  
		StringBuffer tarkVod= new StringBuffer(vodka);  
		//invoking the method  
		String c = tarkVod.deleteCharAt(tarkVod.length()-1).toString(); 
		c = c.replace(",","");
		//prints the string after deleting the character  
		int k=Integer.parseInt(c);
		System.out.println("Vaseline Price: "+k);  
		System.out.println("Need: "+numVase+" Which costs: "+(k*numVase)+"\n"); 
		
		
		//MedTools
		driver.get("https://tarkov-market.com/item/medical_tools");
		String AESA = driver.findElement(By.xpath("//*[@id=\"__layout\"]/div/div/div[2]/div[2]/div[3]/div[1]/div[2]/div/div[1]/div[3]/div[2]/span")).getText();
		//creating a constructor of StringBuffer class  
		StringBuffer ASA= new StringBuffer(AESA);  
		//invoking the method  
		String d = ASA.deleteCharAt(ASA.length()-1).toString(); 
		d = d.replace(",","");
		//prints the string after deleting the character  
		int x=Integer.parseInt(d);
		System.out.println("Medtools Price: "+d); 
		System.out.println("Need: "+numMed+" Which costs: "+(x*numMed)+"\n");
		
		//calculates the total price
		int results = (i*numBlood)+(j*numSyringe)+(k*numVase)+(x*numMed);
		String result = String.valueOf(results);
		result = regexCommafy(result);
		System.out.println("Medicine Case Barter Price: "+result);
		return result;
		
	}
	

}
