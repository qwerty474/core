package Pages;

import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class GradleHomePage implements WebPage {

    @Override
    public <T extends WebPage> T navigate() {
        ChromeDriver driver = new ChromeDriver();

        driver.get("https://www.google.com/");

        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));

        driver.get("https://docs.gradle.org/current/userguide/getting_started.html");

        return null;
    }
}
