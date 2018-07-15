import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class FirstTest {
    FirefoxDriver wd;
    @BeforeMethod
    public void init(){
        wd = new FirefoxDriver();
    }

    @Test
    public  void firstTestScript(){
   //     wd.get("https://search.maven.org");
     wd.get("https://search.maven.org");



    }

    @AfterMethod
    public  void stop() throws InterruptedException {
        Thread.sleep(3000);
        wd.quit();
    }







}
