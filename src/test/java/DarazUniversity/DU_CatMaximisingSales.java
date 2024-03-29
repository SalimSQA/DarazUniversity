package DarazUniversity;

import io.qameta.allure.Allure;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.asserts.SoftAssert;

import java.time.Duration;

public class DU_CatMaximisingSales {

    public DU_CatMaximisingSales(WebDriver driver) {
        PageFactory.initElements(driver, this);
    }

    String PageTitle;

    @FindBy(xpath="//*[text()=\"Categories\"]")
    public WebElement Categories;

    @FindBy(xpath="//*[text()=\"Maximising Sales\"]")
    public WebElement MaximisingSalesModule;

    @FindBy(xpath="//*[text()=\"View all \"]")
    public WebElement Viewall;

    @FindBy(xpath="//input[@placeholder='Search by Tag']")
    public WebElement Tag_Filter;

    @FindBy(xpath="//span[normalize-space()='Management']")
    public WebElement Tag_Value;

    @FindBy(xpath="//div[@id='pagination']")
    public WebElement Focus_Shift;

    @FindBy(xpath="//*[text()='Why is Customer Service Important?']")
    public WebElement Tutorial_PK;

    @FindBy(xpath="//*[text()=\"10 Ways to Boost your Sales\"]")
    public WebElement Tutorial_LK;

    @FindBy(xpath="//*[text()=\"10 Ways to Boost your Sales\"]")
    public WebElement Tutorial_BD;

    @FindBy(xpath="//*[text()=\"Boost your Products using Seller Picks \"]")
    public WebElement Tutorial_NP;

    @FindBy(xpath="//*[text()=\"Reference Material\"]")
    public WebElement TutorialMaterial1;

    @FindBy(xpath="//*[@placeholder=\"Content type\"]")
    public WebElement ContentType_Filter;

    @FindBy(xpath="//*[text()=\"Tutorials\"]")
    public WebElement Filter_Selection;

    public void MaximisingSales(WebDriver driver) throws InterruptedException {

        SoftAssert softAssert = new SoftAssert();

        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(15));

        Thread.sleep(1500);
        wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[text()=\"Categories\"]")));
        Categories.click();
        Allure.step("Clicked on Categories Tab on the Navigation bar");

        Thread.sleep(1500);
        wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[text()=\"Maximising Sales\"]")));
        MaximisingSalesModule.click();
        Allure.step("Clicked on Maximising Sales module");

        Thread.sleep(1500);
        wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[text()=\"View all \"]")));
        Viewall.click();
        Allure.step("Clicked on View All button");

        Thread.sleep(1000);
        wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//head//*[text()=\"Maximising Sales\"]")));
        WebElement PageTile = driver.findElement(By.xpath("//head//*[text()=\"Maximising Sales\"]"));
        wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//head//*[text()=\"Maximising Sales\"]")));
        PageTitle = PageTile.getAttribute("innerHTML");

        String Venture = DU_Portal.Venture;

        switch (Venture)
        {
            case "PK":
/*
                Thread.sleep(1500);
                Tag_Filter.click();

                Thread.sleep(1500);
                Tag_Value.click();

                Thread.sleep(1500);
                Focus_Shift.click();

 */

                try {
                    Thread.sleep(1500);
                    wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[text()='Why is Customer Service Important?']")));
                    Tutorial_PK.click();
                    Allure.step("Clicked on Guide to Creating Collectible Vouchers tutorial");
                }catch (Exception e){
                    driver.navigate().to("https://university.daraz.pk/course/learn?spm=du-pk-pc.du-pk-pc-list.courserlist_courses.5.c79f49845XXc9m&id=968&type=tutorials");
                    Allure.step("Clicked on Getting Started On Daraz tutorial");
                }


                break;


            case "BD":
/*
                Thread.sleep(2000);
                wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@placeholder=\"Content type\"]")));
                ContentType_Filter.click();

                wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[text()=\"Tutorials\"]")));
                Filter_Selection.click();

                Thread.sleep(2000);
                wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@placeholder=\"Sort By\"]")));
                driver.findElement(By.xpath("//*[@placeholder=\"Sort By\"]")).click();

                Thread.sleep(2000);
                wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[text()=\"Alphabetical Order\"]")));
                driver.findElement(By.xpath("//*[text()=\"Alphabetical Order\"]")).click();
 */

                try {
                    Thread.sleep(1500);
                    wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[text()=\"10 Ways to Boost your Sales\"]")));
                    Tutorial_BD.click();
                    Allure.step("Clicked on All About DarazMall tutorial");
                }catch (Exception e){
                    driver.navigate().to("https://university.daraz.com.bd/course/learn?spm=du-bd-pc.du-bd-pc-list.courserlist_courses.9.602f4984OU68di&id=13965&type=tutorials");
                    Allure.step("Clicked on Improve Your Chat Response Rate tutorial");
                }

                break;

            case "LK":

                /*
                Thread.sleep(2000);
                wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@placeholder=\"Content type\"]")));
                ContentType_Filter.click();

                wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[text()=\"Tutorials\"]")));
                Filter_Selection.click();

                Thread.sleep(2000);
                wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@placeholder=\"Sort By\"]")));
                driver.findElement(By.xpath("//*[@placeholder=\"Sort By\"]")).click();

                Thread.sleep(2000);
                wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[text()=\"Alphabetical Order\"]")));
                driver.findElement(By.xpath("//*[text()=\"Alphabetical Order\"]")).click();
                 */

                try {
                    Thread.sleep(1500);
                    wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[text()=\"10 Ways to Boost your Sales\"]")));
                    Tutorial_LK.click();
                    Allure.step("Clicked on Guide to Creating Collectible Vouchers tutorial");
                }catch (Exception e)
                {
                    driver.navigate().to("https://university.daraz.lk/course/learn?spm=du-lk-pc.du-lk-pc-list.courserlist_courses.1.2a2f4984PqE62p&id=1105&type=tutorials");
                    Allure.step("Clicked on Guide to Creating Collectible Vouchers tutorial");
                }

                break;

            case "NP":

                try {
                    Thread.sleep(1500);
                    wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[text()=\"Boost your Products using Seller Picks \"]")));
                    Tutorial_NP.click();
                    Allure.step("Clicked on Guide to Creating Collectible Vouchers tutorial");
                }catch (Exception e){
                    driver.navigate().to("https://university.daraz.com.np/course/learn?spm=du-np-pc.du-np-pc-list.courserlist_courses.5.76db4984zi0EPI&id=1370&type=tutorials");
                    Allure.step("Clicked on Guide to Creating Collectible Vouchers tutorial");
                }

                break;
        }

        Thread.sleep(1500);
        boolean Material1;

        try
        {
            Material1 = TutorialMaterial1.isDisplayed();
        }
        catch(Exception e)
        {
            Material1 = false;
        }

        System.out.println("************************************");
        System.out.println("Module is: " + PageTitle);

        if (Material1)
        {
            System.out.println("Check 1: Tutorial Material Available");
            Allure.step("Tutorial Material Available");
            System.out.println("Case 14: Maximising Sales Module Passed");
            System.out.println("***************************************");
            Allure.step("Maximising Sales Module Passed");
            System.out.println("");

        }
        else
        {
            System.out.println("");
            System.out.println("************************************");
            System.out.println("Check 2: Tutorial Material Not Found");
            Allure.step("Tutorial Material Not Found");
            System.out.println("Case 14: Maximising Sales Module Failed");
            System.out.println("***************************************");
            Allure.step("Maximising Sales Module Failed");
            System.out.println("");

            softAssert.assertFalse(true, "Tutorial Material Not Found");
        }
        softAssert.assertAll();
    }
}

