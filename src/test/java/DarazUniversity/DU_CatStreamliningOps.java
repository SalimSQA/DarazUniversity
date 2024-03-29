package DarazUniversity;

import io.qameta.allure.Allure;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.asserts.SoftAssert;

import java.time.Duration;

public class DU_CatStreamliningOps {

    public DU_CatStreamliningOps(WebDriver driver) {
        PageFactory.initElements(driver, this);
    }

    String PageTitle;

    @FindBy(xpath="//*[text()=\"Categories\"]")
    public WebElement Categories;

    @FindBy(xpath="//*[text()=\"Streamlining Operations\"]")
    public WebElement StreamliningOps;

    @FindBy(xpath="//*[text()=\"View all \"]")
    public WebElement Viewall;

    @FindBy(xpath="//*[text()=\"Introduction to Seller API\"]")
    public WebElement IntroToSellerAPI;

    @FindBy(xpath="//*[text()=\"Reference Material\"]")
    public WebElement TutorailMaterial;

    public void StreamOps (WebDriver driver) throws InterruptedException {

        SoftAssert softAssert = new SoftAssert();

        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(15));

        Thread.sleep(1500);
        wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[text()=\"Categories\"]")));
        Categories.click();
        Allure.step("Clicked on Categories Tab on the Navigation bar");

        Thread.sleep(1500);
        wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[text()=\"Streamlining Operations\"]")));
        StreamliningOps.click();
        Allure.step("Clicked on Streamlinig Operations module");

        Thread.sleep(1500);
        wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[text()=\"View all \"]")));
        Viewall.click();
        Allure.step("Clicked on View All button");

        Thread.sleep(1000);
        wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//head//*[text()=\"Streamlining Operations\"]")));
        WebElement PageTile = driver.findElement(By.xpath("//head//*[text()=\"Streamlining Operations\"]"));
        wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//head//*[text()=\"Streamlining Operations\"]")));
        PageTitle = PageTile.getAttribute("innerHTML");

        String Venture = DU_Portal.Venture;

        switch (Venture) {

            case "LK":

                try {
                    Thread.sleep(1500);
                    wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[text()=\"Introduction to Seller API\"]")));
                    IntroToSellerAPI.click();
                    Allure.step("Clicked on Introduction to Seller API course");
                }catch (Exception e){
                    driver.navigate().to("https://university.daraz.lk/course/learn?spm=du-lk-pc.du-lk-pc-list.courserlist_courses.3.219c4984qPxrv0&id=1101&type=tutorials");
                    Allure.step("Clicked on Introduction to Seller API course");
                }

                break;

            case "PK":

                try {
                    Thread.sleep(1500);
                    wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[text()=\"Introduction to Seller API\"]")));
                    IntroToSellerAPI.click();
                    Allure.step("Clicked on Introduction to Seller API course");
                }catch (Exception e){
                    driver.navigate().to("https://university.daraz.pk/course/learn?spm=du-pk-pc.du-pk-pc-list.courserlist_courses.37.53364984hSbhgB&id=8290&type=tutorialsvvv");
                    Allure.step("Clicked on Introduction to Seller API course");
                }

                break;

            case "NP":

                try {
                    Thread.sleep(1500);
                    wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[text()=\"Introduction to Seller API\"]")));
                    IntroToSellerAPI.click();
                    Allure.step("Clicked on Introduction to Seller API course");
                }catch (Exception e){
                    driver.navigate().to("https://university.daraz.com.np/course/learn?spm=du-np-pc.du-np-pc-list.courserlist_courses.19.6e784984ETLzVv&id=12285&type=tutorials");
                    Allure.step("Clicked on Introduction to Seller API course");
                }

                break;

            case "BD":

                try {
                    Thread.sleep(1500);
                    wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[text()=\"Introduction to Seller API\"]")));
                    IntroToSellerAPI.click();
                    Allure.step("Clicked on Introduction to Seller API course");
                }catch (Exception e){
                    driver.navigate().to("https://university.daraz.com.bd/course/learn?spm=du-bd-pc.du-bd-pc-list.courserlist_courses.5.1ab94984CX6Uta&id=1046&type=tutorials");
                    Allure.step("Clicked on IImprove Your Order Processing Time Tutorial");
                }

                break;

        }


        Thread.sleep(1500);
        boolean Material;

        try{
            Material = TutorailMaterial.isDisplayed();;
        }
        catch(Exception e)
        {
            Material = false;
        }

        System.out.println("***************************************");
        System.out.println("Module is: " + PageTitle);

        if (Material){

            System.out.println("Check 1: Tutorial Material Available");
            System.out.println("Case 17: Streamlining Ops Module Passed");
            System.out.println("****************************************");
            System.out.println("");
            Allure.step("Tutorial Material Available");

        }
        else
        {
            System.out.println("");
            System.out.println("************************************");
            System.out.println("Check 2: Tutorial Material Not Found");
            System.out.println("Case 17: Streamlining Ops Module Failed");
            System.out.println("****************************************");
            System.out.println("");
            Allure.step("Tutorial Material Not Found");

            softAssert.assertFalse(true, "Tutorial Material Not Found");

        }
        softAssert.assertAll();
    }
}
