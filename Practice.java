package challenges;

//import org.openqa.selenium.firefox.GeckoDriverInfo;
import org.openqa.selenium.chrome.ChromeDriver;
//import org.openqa.selenium.edge.EdgeDriver;
//import org.openqa.selenium.safari.SafariDriver;

public class Practice {
	
	public static void main(String[] args)
	{
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com");
		driver.manage().window().maximize();
		String title = driver.getTitle();
		System.out.println(title);
		
		if(title.contains("Facebook"))
		{
			System.out.println("pass");
		}
		else
		{
			System.out.println("fail");
		}
		
		driver.quit();
	}
	
//	public static void main(String[] args) {
//		EdgeDriver driver = new EdgeDriver();
//		driver.get("https://www.google.com");
//		driver.manage().window().maximize();
//	}
	
//	public static void main(String[] args) {
//		SafariDriver driver = new SafariDriver();
//		driver.get("https://www.google.com");
//		driver.manage().window().maximize();
//	}

}
