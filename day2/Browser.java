package week1.day2;

public class Browser {
	
	 String launchBrowser (String browserName)
	{
		System.out.println("Browser Launched Sucessfully");
		return browserName;
	}
public void loadUrl() {
	System.out.println("Application url loaded successfully");
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
Browser name = new Browser();
System.out.println(name.launchBrowser("safari"));
name.loadUrl();
	}

}
