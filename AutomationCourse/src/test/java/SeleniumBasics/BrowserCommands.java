package SeleniumBasics;

public class BrowserCommands extends Base {

	public void browserCommands() {
		String url = driver.getCurrentUrl();
		System.out.println(url);
		String title=driver.getTitle();
		System.out.println(title);
		String handleid=driver.getWindowHandle();
		System.out.println(handleid);
		String pagesource=driver.getPageSource();
		System.out.println(pagesource);
	}
	public void navigationCommands() {
		driver.navigate().to("https://www.flipkart.com/");
		driver.navigate().back();
		driver.navigate().forward();
		driver.navigate().refresh();
	}
	public static void main(String args[])
	{
BrowserCommands browser=new BrowserCommands();
browser.initialiseBrowser();
browser.navigationCommands();
//browser.browserCommands();
browser.closeandQuit();
		
	}
}
