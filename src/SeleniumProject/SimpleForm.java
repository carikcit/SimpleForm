package SeleniumProject;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import java.util.List;



public class SimpleForm {



        public static void main(String[] args) {
            System.setProperty( "webdriver.chrome.driver", "/Users/tahs/Selenium/ChromeDriver/chromedriver79" );
            WebDriver driver = new ChromeDriver();
            driver.get( "https://www.techlistic.com/p/selenium-practice-form.html" );
            WebElement firstname = driver.findElement(By.name("firstname"));
            firstname.sendKeys("Tahsin");

            WebElement lastname = driver.findElement(By.name("lastname"));
            lastname.sendKeys("Carikci");

            WebElement element = driver.findElement(By.id("sex-0"));
            element.click();

            List<WebElement> experience = driver.findElements(By.name("exp"));
            experience.get(1).click();

            WebElement datepicker = driver.findElement(By.id("datepicker"));
            datepicker.sendKeys("12/16/2019");

            WebElement element1 = driver.findElement(By.id("profession-1"));
            element1.click();

            WebElement elementm = driver.findElement(By.id("profession-0"));
            elementm.click();

            WebElement element2 = driver.findElement(By.id("tool-2"));
            element2.click();

            WebElement continent = driver.findElement(By.name("continents"));
            Select dropdown = new Select(continent);
            dropdown.selectByIndex(5);

            Select select = new Select(driver.findElement(By.id("selenium_commands")));
            // select.deselectAll();
            List<WebElement> select31Options = select.getOptions();
            for (WebElement option : select31Options) {
                select.selectByVisibleText(option.getText());
            }




        }
    }

