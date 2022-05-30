import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class FirstTest {

    @Test
    public void checkMinPaymentSum(){

        System.setProperty("webdriver.chrome.driver","src/main/resources/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(2));

        driver.get("https://next.privat24.ua/money-transfer/card");

        By numberCard = By.xpath("//input[@data-qa-node='numberdebitSource']");
        By exp = By.xpath("//input[@data-qa-node='expiredebitSource']");
        By cvv = By.xpath("//input[@data-qa-node='cvvdebitSource']");
        By firstname = By.xpath("//input[@data-qa-node='firstNamedebitSource']");
        By lastname = By.xpath("//input[@data-qa-node='lastNamedebitSource']");
        By numberReceiver = By.xpath("//input[@data-qa-node='numberreceiver']");
        By firstname1 = By.xpath("//input[@data-qa-node='firstNamereceiver']");
        By lastname1 = By.xpath("//input[@data-qa-node='lastNamereceiver']");
        By amount = By.xpath("//input[@data-qa-node='amount']");
        By currency = By.xpath("//button[@data-qa-value='UAH']");
        By currencyUSD = By.xpath("//button[@data-qa-value='USD']");
        By commentclick = By.xpath("//span[@data-qa-node='toggle-comment']");
        By comment = By.xpath("//textarea[@data-qa-node='comment']");
       By submitbtn = By.xpath("//button[@class='sc-VigVT hcHAAV']");




        driver.findElement(numberCard).sendKeys("4558032855841715");
        driver.findElement(exp).sendKeys("1128");
        driver.findElement(cvv).sendKeys("156");
        driver.findElement(firstname).sendKeys("Mariia");
        driver.findElement(lastname).sendKeys("Mariia");
        driver.findElement(numberReceiver).sendKeys("5309233034765085");
        driver.findElement(firstname1).sendKeys("Bobik");
        driver.findElement(lastname1).sendKeys("Bobovich");
        driver.findElement(amount).sendKeys("600");
        driver.findElement(currency).click();
        driver.findElement(currencyUSD).click();
        driver.findElement(commentclick).click();
        driver.findElement(comment).sendKeys("Переказ власних коштів");
        driver.findElement(submitbtn).click();



        // driver.close();


    }
}
