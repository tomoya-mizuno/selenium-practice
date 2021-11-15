package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class SeleniumSample {
	public static void main(String[] args) {
		try {
			System.setProperty("webdriver.chrome.driver", "./exe/chromedriver.exe");
			
			WebDriver driver = new ChromeDriver(); // ChromeDriverの作成
			driver.get("http://www.google.com/xhtml"); // get()でブラウザ起動
			Thread.sleep(5000);
			WebElement searchBox = driver.findElement(By.name("q"));
			searchBox.sendKeys("youtube");
			searchBox.submit();
			Thread.sleep(5000);
			driver.navigate().to("https://www.youtube.com/");
			Thread.sleep(5000);
			WebElement youtubeSerchbox = driver.findElement(By.cssSelector("#search"));
			youtubeSerchbox.sendKeys("java シューティングゲーム");
			youtubeSerchbox.submit();
			Thread.sleep(5000);
			driver.quit(); // ブラウザを閉じる。
		} catch (InterruptedException e) {
			e.printStackTrace();
		} // 処理を停止(動作確認の為)
			// ブラウザの要素を指定 メソッド名がわかりやすいですよね。
	}
}
