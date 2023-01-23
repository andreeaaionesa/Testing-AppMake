package Steps;

import Pages.AppMakePage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AppMakeSteps {
    WebDriver driver = new ChromeDriver();
    AppMakePage appMakePage = new AppMakePage(driver);

    @Given("User open the site")
    public void userOpenTheSite(){

        appMakePage.navigateTo();
    }

    @And("User enter a description in the field as {string}")
    public void userEnterADescriptionInTheFieldAs(String descr){

        appMakePage.enterDescription(descr);
    }

    @And("User choose a small dimension")
    public void userChooseASmallDimension(){

        appMakePage.enterSmall();
    }

    @And("User selects web and mobile as platforms")
    public void userSelectsWebAndMobileAsPlatforms(){
        appMakePage.webPlatform();
        appMakePage.mobilePlatform();
    }

    @And("The application will be an android app")
    public void theApplicationWillBeAnAndroidApp(){

        appMakePage.androidType();
    }

    @And("User click on basic UI")
    public void userClickOnBasicUi(){
        appMakePage.basicUI();
    }

    @And("User choose speed and quality as the importance of the project")
    public void userChooseSpendAndQualityAsTheImportanceOfTheProject(){
        appMakePage.qualityImportance();
        appMakePage.speedImportance();
    }

    @And("User press the next button")
    public void userPressTheNextButton(){
        appMakePage.pressNext();
    }

    @And("Application is intended for the customer")
    public void applicationIsIntendedForTheCustomer(){
        appMakePage.customerUser();
    }

    @And("User move to the next page")
    public void userMoveToTheNextPage(){
        appMakePage.nextButton();
    }

    @And("User want landing page and about us page as Presentation features")
    public void userWantLandingPageAndAboutUsPageAsPresentationFeatures(){
        appMakePage.landingPage();
        appMakePage.aboutUsPage();
    }

    @And("User register and login with email")
    public void userRegisterAndLoginWithEmail(){
        appMakePage.loginEmail();
    }

    @And("The application will have user profile and feedback section")
    public void theApplicationWillHaveUserProfileAndFeedbackSection(){
        appMakePage.userProfile();
        appMakePage.feedbackReview();
    }

    @And("User choose manage ads")
    public void userChooseManageAds(){
        appMakePage.manageAds();
    }

    @And("User click on online store")
    public void userClickOnOnlineStore(){
        appMakePage.onlineStore();
    }

    @And("The application will have management of tickets")
    public void theApplicationWillHaveManagementOfTickets(){
        appMakePage.manageTickets();
    }

    @And("User choose simple report")
    public void userChooseSimpleReport(){
        appMakePage.simpleReport();
    }

    @And("User click on email notification")
    public void userClickOnEmailNotification(){
        appMakePage.emailNotification();
    }

    @And("User choose payments")
    public void userChoosePayments(){
        appMakePage.payments();
    }

    @When("User enter the email as {string}")
    public void userEnterTheEmail(String email){
        appMakePage.enterEmailAccount(email);
    }

    @And("User check the first checkbox")
    public void userCheckTheFirstBox(){
        appMakePage.checkBox1();
    }

    @And("User check the second checkbox")
    public void userCheckTheSecondBox(){
        appMakePage.checkBox2();
    }

    @Then("User press the send button")
    public void userPressTheSendButton(){
        appMakePage.sendButton();
    }























}
