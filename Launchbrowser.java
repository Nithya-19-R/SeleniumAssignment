package week1.week1assgnt;

import org.openqa.selenium.chrome.ChromeDriver;

public class Launchbrowser {
    public static void main(String[] args) { 
      ChromeDriver driver=new ChromeDriver(); 
      driver.get("http://leaftaps.com/opentaps/control/main");  
    }
}
