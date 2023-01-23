package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class AppMakePage {
    private WebDriver driver;

    public AppMakePage(WebDriver driver) {
        this.driver = driver;
    }

    public void navigateTo(){
        driver.get("https://appmake.io/estimate");
    }

    public void enterDescription(String descr){
        WebElement description = driver.findElement(By.id("mat-input-0"));
        description.sendKeys(descr);
    }

    public void enterSmall(){
        WebElement small = driver.findElement(By.xpath("//*[@id=\"cdk-step-content-0-0\"]/app-form-section[2]/form/app-material/app-material-body/app-form-section-feature-card[1]"));
        small.click();
    }

    public void enterMedium(){
        WebElement medium = driver.findElement(By.xpath("//*[@id=\"cdk-step-content-0-0\"]/app-form-section[2]/form/app-material/app-material-body/app-form-section-feature-card[2]"));
        medium.click();
    }

    public void enterLarge(){
        WebElement large = driver.findElement(By.xpath("//*[@id=\"cdk-step-content-0-0\"]/app-form-section[2]/form/app-material/app-material-body/app-form-section-feature-card[3]"));
        large.click();
    }

    public void webPlatform(){
        WebElement web = driver.findElement(By.xpath("//*[@id=\"cdk-step-content-0-0\"]/app-form-section[3]/form/app-material/app-material-body/app-form-section-feature-card[1]"));
        web.click();
    }

    public void mobilePlatform(){
        WebElement mobile = driver.findElement(By.xpath("//*[@id=\"cdk-step-content-0-0\"]/app-form-section[3]/form/app-material/app-material-body/app-form-section-feature-card[2]"));
        mobile.click();
    }

    public void desktopPlatform(){
        WebElement desktop = driver.findElement(By.xpath("//*[@id=\"cdk-step-content-0-0\"]/app-form-section[3]/form/app-material/app-material-body/app-form-section-feature-card[3]"));
        desktop.click();
    }

    public void apiPlatform(){
        WebElement api = driver.findElement(By.xpath("//*[@id=\"cdk-step-content-0-0\"]/app-form-section[3]/form/app-material/app-material-body/app-form-section-feature-card[4]"));
        api.click();
    }

    public void iosType(){
        WebElement ios = driver.findElement(By.xpath("//*[@id=\"cdk-step-content-0-0\"]/app-form-section[4]/form/app-material/app-material-body/app-form-section-feature-card[1]"));
        ios.click();
    }

    public void androidType(){
        WebElement android = driver.findElement(By.xpath("//*[@id=\"cdk-step-content-0-0\"]/app-form-section[4]/form/app-material/app-material-body/app-form-section-feature-card[2]"));
        android.click();
    }

    public void hybridType(){
        WebElement hybrid = driver.findElement(By.xpath("//*[@id=\"cdk-step-content-0-0\"]/app-form-section[4]/form/app-material/app-material-body/app-form-section-feature-card[3]"));
        hybrid.click();
    }

    public void mvpUI(){
        WebElement mvp = driver.findElement(By.xpath("//*[@id=\"cdk-step-content-0-0\"]/app-form-section[4]/form/app-material/app-material-body/app-form-section-feature-card[1]"));
        mvp.click();
    }

    public void basicUI(){
        WebElement basic = driver.findElement(By.xpath("//*[@id=\"cdk-step-content-0-0\"]/app-form-section[4]/form/app-material/app-material-body/app-form-section-feature-card[2]"));
        basic.click();
    }

    public void polishedUI(){
        WebElement polished = driver.findElement(By.xpath("//*[@id=\"cdk-step-content-0-0\"]/app-form-section[4]/form/app-material/app-material-body/app-form-section-feature-card[3]"));
        polished.click();
    }

    public void speedImportance(){
        WebElement speed = driver.findElement(By.xpath("//*[@id=\"cdk-step-content-0-0\"]/app-form-section[5]/form/app-material/app-material-body/app-form-section-feature-card[1]"));
        speed.click();
    }

    public void priceImportance(){
        WebElement price = driver.findElement(By.xpath("//*[@id=\"cdk-step-content-0-0\"]/app-form-section[5]/form/app-material/app-material-body/app-form-section-feature-card[2]"));
        price.click();
    }

    public void qualityImportance(){
        WebElement quality = driver.findElement(By.xpath("//*[@id=\"cdk-step-content-0-0\"]/app-form-section[5]/form/app-material/app-material-body/app-form-section-feature-card[3]"));
        quality.click();
    }

    public void pressNext(){
        WebElement next = driver.findElement(By.xpath("//*[@id=\"cdk-step-content-0-0\"]/div/button[2]/span[1]"));
        next.click();
    }

    public void adminUser(){
        WebElement admin = driver.findElement(By.xpath("//*[@id=\"cdk-step-content-0-1\"]/app-form-section/form/app-material/app-material-body/app-form-section-feature-card[1]"));
        admin.click();
    }

    public void customerUser(){
        WebElement customer = driver.findElement(By.xpath("//*[@id=\"cdk-step-content-0-1\"]/app-form-section/form/app-material/app-material-body/app-form-section-feature-card[2]"));
        customer.click();
    }

    public void internalUser(){
        WebElement internal = driver.findElement(By.xpath("//*[@id=\"cdk-step-content-0-1\"]/app-form-section/form/app-material/app-material-body/app-form-section-feature-card[3]"));
        internal.click();
    }

    public void otherTypes(String type){
        WebElement other = driver.findElement(By.xpath("//*[@id=\"mat-input-1\"]"));
        other.sendKeys(type);
    }

    public void plusButton(){
        WebElement plus = driver.findElement(By.xpath("//*[@id=\"cdk-step-content-0-1\"]/app-form-section/form/app-material/app-material-body/app-multiple-input/mat-form-field/div/div[1]/div[2]/mat-icon"));
        plus.click();
    }

    public void nextButton(){
        WebElement button = driver.findElement(By.xpath("//*[@id=\"cdk-step-content-0-1\"]/div/button[2]/span[1]"));
        button.click();
    }

    public void backButton(){
        WebElement back = driver.findElement(By.xpath("//*[@id=\"cdk-step-content-0-1\"]/div/button[1]"));
        back.click();
    }

    public void landingPage(){
        WebElement landing = driver.findElement(By.xpath("//*[@id=\"cdk-step-content-0-2\"]/app-form-section[1]/form/app-material/app-material-body/app-form-section-feature-card[1]"));
        landing.click();
    }

    public void aboutUsPage(){
        WebElement aboutUs = driver.findElement(By.xpath("//*[@id=\"cdk-step-content-0-2\"]/app-form-section[1]/form/app-material/app-material-body/app-form-section-feature-card[2]"));
        aboutUs.click();
    }

    public void howItWorksPage(){
        WebElement howItWorks = driver.findElement(By.xpath("//*[@id=\"cdk-step-content-0-2\"]/app-form-section[1]/form/app-material/app-material-body/app-form-section-feature-card[3]"));
        howItWorks.click();
    }

    public void contactPage(){
        WebElement contact = driver.findElement(By.xpath("//*[@id=\"cdk-step-content-0-2\"]/app-form-section[1]/form/app-material/app-material-body/app-form-section-feature-card[4]"));
        contact.click();
    }

    public void GDPRpage(){
        WebElement gdpr = driver.findElement(By.xpath("//*[@id=\"cdk-step-content-0-2\"]/app-form-section[1]/form/app-material/app-material-body/app-form-section-feature-card[5]"));
        gdpr.click();
    }

    public void cookiesPage(){
        WebElement cookies = driver.findElement(By.xpath("//*[@id=\"cdk-step-content-0-2\"]/app-form-section[1]/form/app-material/app-material-body/app-form-section-feature-card[6]"));
        cookies.click();
    }

    public void otherFunctionality(String text){
        WebElement functionality = driver.findElement(By.xpath("//*[@id=\"mat-input-2\"]"));
        functionality.sendKeys(text);
    }

    public void addButton(){
        WebElement add = driver.findElement(By.xpath("//*[@id=\"cdk-step-content-0-2\"]/app-form-section[1]/form/app-material/app-material-body/app-multiple-input/mat-form-field/div/div[1]/div[2]/mat-icon"));
        add.click();
    }

    public void loginEmail(){
        WebElement email = driver.findElement(By.xpath("//*[@id=\"cdk-step-content-0-2\"]/app-form-section[2]/form/app-material/app-material-body/app-form-section-feature-card[1]"));
        email.click();
    }

    public void loginFacebook(){
        WebElement facebook = driver.findElement(By.xpath("//*[@id=\"cdk-step-content-0-2\"]/app-form-section[2]/form/app-material/app-material-body/app-form-section-feature-card[2]"));
        facebook.click();
    }

    public void loginGoogle(){
        WebElement google = driver.findElement(By.xpath("//*[@id=\"cdk-step-content-0-2\"]/app-form-section[2]/form/app-material/app-material-body/app-form-section-feature-card[3]"));
        google.click();
    }

    public void loginApple(){
        WebElement apple = driver.findElement(By.xpath("//*[@id=\"cdk-step-content-0-2\"]/app-form-section[2]/form/app-material/app-material-body/app-form-section-feature-card[4]"));
        apple.click();
    }

    public void loginLinkedIn(){
        WebElement linkedIn = driver.findElement(By.xpath("//*[@id=\"cdk-step-content-0-2\"]/app-form-section[2]/form/app-material/app-material-body/app-form-section-feature-card[5]"));
        linkedIn.click();
    }

    public void twoAuthentication(){
        WebElement two = driver.findElement(By.xpath("//*[@id=\"cdk-step-content-0-2\"]/app-form-section[2]/form/app-material/app-material-body/app-form-section-feature-card[6]"));
        two.click();
    }

    public void accessToken(){
        WebElement access = driver.findElement(By.xpath("//*[@id=\"cdk-step-content-0-2\"]/app-form-section[2]/form/app-material/app-material-body/app-form-section-feature-card[7]"));
        access.click();
    }

    public void otherAuthentication(String authentication){
        WebElement otherWay = driver.findElement(By.xpath("//*[@id=\"mat-input-3\"]"));
        otherWay.sendKeys(authentication);
    }

    public void plusAdd(){
        WebElement plusadd = driver.findElement(By.xpath("//*[@id=\"cdk-step-content-0-2\"]/app-form-section[2]/form/app-material/app-material-body/app-multiple-input/mat-form-field/div/div[1]/div[2]/mat-icon"));
        plusadd.click();
    }

    public void userProfile(){
        WebElement user = driver.findElement(By.xpath("//*[@id=\"cdk-step-content-0-2\"]/app-form-section[3]/form/app-material/app-material-body/app-form-section-feature-card[1]"));
        user.click();
    }

    public void complexUserProfile(){
        WebElement complex = driver.findElement(By.xpath("//*[@id=\"cdk-step-content-0-2\"]/app-form-section[3]/form/app-material/app-material-body/app-form-section-feature-card[2]"));
        complex.click();
    }

    public void profileSettings(){
        WebElement settings = driver.findElement(By.xpath("//*[@id=\"cdk-step-content-0-2\"]/app-form-section[3]/form/app-material/app-material-body/app-form-section-feature-card[3]"));
        settings.click();
    }

    public void blogPosts(){
        WebElement blog = driver.findElement(By.xpath("//*[@id=\"cdk-step-content-0-2\"]/app-form-section[3]/form/app-material/app-material-body/app-form-section-feature-card[4]"));
        blog.click();
    }

    public void commentSection(){
        WebElement comment = driver.findElement(By.xpath("//*[@id=\"cdk-step-content-0-2\"]/app-form-section[3]/form/app-material/app-material-body/app-form-section-feature-card[5]"));
        comment.click();
    }

    public void feedbackReview(){
        WebElement feedback = driver.findElement(By.xpath("//*[@id=\"cdk-step-content-0-2\"]/app-form-section[3]/form/app-material/app-material-body/app-form-section-feature-card[6]"));
        feedback.click();
    }

    public void tagsManagement(){
        WebElement tags = driver.findElement(By.xpath("//*[@id=\"cdk-step-content-0-2\"]/app-form-section[3]/form/app-material/app-material-body/app-form-section-feature-card[7]"));
        tags.click();
    }

    public void otherGenaralFunctionality(String otherF){
        WebElement general = driver.findElement(By.xpath("//*[@id=\"mat-input-4\"]"));
        general.sendKeys(otherF);
    }

    public void addOther(){
        WebElement othergeneral = driver.findElement(By.xpath("//*[@id=\"cdk-step-content-0-2\"]/app-form-section[3]/form/app-material/app-material-body/app-multiple-input/mat-form-field/div/div[1]/div[2]/mat-icon"));
        othergeneral.click();
    }

    public void chatMessaging(){
        WebElement chat = driver.findElement(By.xpath("//*[@id=\"cdk-step-content-0-2\"]/app-form-section[4]/form/app-material/app-material-body/app-form-section-feature-card[1]"));
        chat.click();
    }

    public void manageAds(){
        WebElement manage = driver.findElement(By.xpath("//*[@id=\"cdk-step-content-0-2\"]/app-form-section[4]/form/app-material/app-material-body/app-form-section-feature-card[2]"));
        manage.click();
    }

    public void content(){
        WebElement cont = driver.findElement(By.xpath("//*[@id=\"cdk-step-content-0-2\"]/app-form-section[4]/form/app-material/app-material-body/app-form-section-feature-card[3]"));
        cont.click();
    }

    public void otherSocial(String socialF){
        WebElement social = driver.findElement(By.xpath("//*[@id=\"mat-input-5\"]"));
        social.click();

    }

    public void plusFunctionality(){
        WebElement plusF = driver.findElement(By.xpath("//*[@id=\"cdk-step-content-0-2\"]/app-form-section[4]/form/app-material/app-material-body/app-multiple-input/mat-form-field/div/div[1]/div[2]/mat-icon"));
        plusF.click();
    }

    public void productsStocks(){
        WebElement products = driver.findElement(By.xpath("//*[@id=\"cdk-step-content-0-2\"]/app-form-section[5]/form/app-material/app-material-body/app-form-section-feature-card[1]"));
        products.click();
    }

    public void importExport(){
        WebElement export = driver.findElement(By.xpath("//*[@id=\"cdk-step-content-0-2\"]/app-form-section[5]/form/app-material/app-material-body/app-form-section-feature-card[2]"));
        export.click();
    }

    public void onlineStore(){
        WebElement online = driver.findElement(By.xpath("//*[@id=\"cdk-step-content-0-2\"]/app-form-section[5]/form/app-material/app-material-body/app-form-section-feature-card[3]"));
        online.click();
    }

    public void productComments(){
        WebElement productComm = driver.findElement(By.xpath("//*[@id=\"cdk-step-content-0-2\"]/app-form-section[5]/form/app-material/app-material-body/app-form-section-feature-card[4]"));
        productComm.click();
    }

    public void shoppingCart(){
        WebElement shopping = driver.findElement(By.xpath("//*[@id=\"cdk-step-content-0-2\"]/app-form-section[5]/form/app-material/app-material-body/app-form-section-feature-card[5]"));
        shopping.click();
    }

    public void subscriptions(){
        WebElement subs = driver.findElement(By.xpath("//*[@id=\"cdk-step-content-0-2\"]/app-form-section[5]/form/app-material/app-material-body/app-form-section-feature-card[6]"));
        subs.click();
    }

    public void invoices(){
        WebElement invoices = driver.findElement(By.xpath("//*[@id=\"cdk-step-content-0-2\"]/app-form-section[5]/form/app-material/app-material-body/app-form-section-feature-card[7]"));
        invoices.click();
    }

    public void campaignManagement(){
        WebElement campaign = driver.findElement(By.xpath("//*[@id=\"cdk-step-content-0-2\"]/app-form-section[5]/form/app-material/app-material-body/app-form-section-feature-card[8]"));
        campaign.click();
    }

    public void otherEcommerce(String ecomm){
        WebElement ecommerce = driver.findElement(By.xpath("//*[@id=\"mat-input-6\"]"));
        ecommerce.click();

    }

    public void addEcommerce(){
        WebElement addE = driver.findElement(By.xpath("//*[@id=\"cdk-step-content-0-2\"]/app-form-section[5]/form/app-material/app-material-body/app-multiple-input/mat-form-field/div/div[1]/div[2]/mat-icon"));
        addE.click();
    }

    public void manageCalendar(){
        WebElement calendar = driver.findElement(By.xpath("//*[@id=\"cdk-step-content-0-2\"]/app-form-section[6]/form/app-material/app-material-body/app-form-section-feature-card[1]"));
        calendar.click();
    }

    public void manageTickets(){
        WebElement ticket = driver.findElement(By.xpath("//*[@id=\"cdk-step-content-0-2\"]/app-form-section[6]/form/app-material/app-material-body/app-form-section-feature-card[2]"));
        ticket.click();
    }

    public void internalWork(){
        WebElement internal = driver.findElement(By.xpath("//*[@id=\"cdk-step-content-0-2\"]/app-form-section[6]/form/app-material/app-material-body/app-form-section-feature-card[3]"));
        internal.click();
    }

    public void accountingStocks(){
        WebElement accounting = driver.findElement(By.xpath("//*[@id=\"cdk-step-content-0-2\"]/app-form-section[6]/form/app-material/app-material-body/app-form-section-feature-card[4]"));
        accounting.click();
    }

    public void manageRoles(){
        WebElement roles = driver.findElement(By.xpath("//*[@id=\"cdk-step-content-0-2\"]/app-form-section[6]/form/app-material/app-material-body/app-form-section-feature-card[5]"));
        roles.click();
    }

    public void userActions(){
        WebElement action = driver.findElement(By.xpath("//*[@id=\"cdk-step-content-0-2\"]/app-form-section[6]/form/app-material/app-material-body/app-form-section-feature-card[6]"));
        action.click();
    }

    public void customerRelationship(){
        WebElement customer = driver.findElement(By.xpath("//*[@id=\"cdk-step-content-0-2\"]/app-form-section[6]/form/app-material/app-material-body/app-form-section-feature-card[7]"));
        customer.click();
    }

    public void otherBussinessProcess(String process){
        WebElement bussiness = driver.findElement(By.xpath("//*[@id=\"mat-input-7\"]"));
        bussiness.sendKeys(process);

    }

    public void plusProcess(){
        WebElement plusP = driver.findElement(By.xpath("//*[@id=\"cdk-step-content-0-2\"]/app-form-section[6]/form/app-material/app-material-body/app-multiple-input/mat-form-field/div/div[1]/div[2]/mat-icon"));
        plusP.click();
    }

    public void simpleReport(){
        WebElement simple = driver.findElement(By.xpath("//*[@id=\"cdk-step-content-0-2\"]/app-form-section[7]/form/app-material/app-material-body/app-form-section-feature-card[1]"));
        simple.click();
    }

    public void averageReport(){
        WebElement average = driver.findElement(By.xpath("//*[@id=\"cdk-step-content-0-2\"]/app-form-section[7]/form/app-material/app-material-body/app-form-section-feature-card[2]"));
        average.click();
    }

    public void complexReporting(){
        WebElement complexReport = driver.findElement(By.xpath("//*[@id=\"cdk-step-content-0-2\"]/app-form-section[7]/form/app-material/app-material-body/app-form-section-feature-card[3]"));
        complexReport.click();
    }

    public void otherReport(String report){
        WebElement otherR = driver.findElement(By.xpath("//*[@id=\"mat-input-8\"]"));
        otherR.sendKeys(report);
    }

    public void plusReport(){
        WebElement plusR = driver.findElement(By.xpath("//*[@id=\"cdk-step-content-0-2\"]/app-form-section[7]/form/app-material/app-material-body/app-multiple-input/mat-form-field/div/div[1]/div[2]/mat-icon"));
        plusR.click();
    }

    public void platformAlert(){
        WebElement alert = driver.findElement(By.xpath("//*[@id=\"cdk-step-content-0-2\"]/app-form-section[8]/form/app-material/app-material-body/app-form-section-feature-card[1]"));
        alert.click();
    }

    public void emailNotification(){
        WebElement emailN = driver.findElement(By.xpath("//*[@id=\"cdk-step-content-0-2\"]/app-form-section[8]/form/app-material/app-material-body/app-form-section-feature-card[2]"));
        emailN.click();
    }

    public void smsNotification(){
        WebElement sms = driver.findElement(By.xpath("//*[@id=\"cdk-step-content-0-2\"]/app-form-section[8]/form/app-material/app-material-body/app-form-section-feature-card[3]"));
        sms.click();
    }

    public void pushPhoneNotification(){
        WebElement push = driver.findElement(By.xpath("//*[@id=\"cdk-step-content-0-2\"]/app-form-section[8]/form/app-material/app-material-body/app-form-section-feature-card[4]"));
        push.click();
    }

    public void otherNotification(String notification){
        WebElement otherNot = driver.findElement(By.xpath("//*[@id=\"mat-input-9\"]"));
        otherNot.sendKeys(notification);
    }

    public void plusNot(){
        WebElement plusNoti = driver.findElement(By.xpath("//*[@id=\"cdk-step-content-0-2\"]/app-form-section[8]/form/app-material/app-material-body/app-multiple-input/mat-form-field/div/div[1]/div[2]/mat-icon"));
        plusNoti.click();
    }

    public void otherBasicFunctionality(String basic){
        WebElement otherBasic = driver.findElement(By.xpath("//*[@id=\"mat-input-10\"]"));
        otherBasic.sendKeys(basic);
    }

    public void addFunctionality(){
        WebElement addF = driver.findElement(By.xpath("//*[@id=\"cdk-step-content-0-2\"]/app-form-section[9]/form/app-material/app-material-body/app-multiple-input/mat-form-field/div/div[1]/div[2]/mat-icon"));
        addF.click();
    }

    public void nextBut(){
        WebElement nextB = driver.findElement(By.xpath("//*[@id=\"cdk-step-content-0-2\"]/div/button[2]/span[1]"));
        nextB.click();
    }

    public void backB(){
        WebElement backBut = driver.findElement(By.xpath("//*[@id=\"cdk-step-content-0-2\"]/div/button[1]/span[1]"));
        backBut.click();
    }

    public void managementSystem(){
        WebElement system = driver.findElement(By.xpath("//*[@id=\"cdk-step-content-0-3\"]/app-form-section/form/app-material/app-material-body/app-form-section-feature-card[1]"));
        system.click();
    }

    public void calendarIcon(){
        WebElement calendar = driver.findElement(By.xpath("//*[@id=\"cdk-step-content-0-3\"]/app-form-section/form/app-material/app-material-body/app-form-section-feature-card[2]"));
        calendar.click();
    }

    public void maps(){
        WebElement map = driver.findElement(By.xpath("//*[@id=\"cdk-step-content-0-3\"]/app-form-section/form/app-material/app-material-body/app-form-section-feature-card[3]"));
        map.click();
    }

    public void accounting(){
        WebElement calcule = driver.findElement(By.xpath("//*[@id=\"cdk-step-content-0-3\"]/app-form-section/form/app-material/app-material-body/app-form-section-feature-card[4]"));
        calcule.click();
    }

    public void payments(){
        WebElement pay = driver.findElement(By.xpath("//*[@id=\"cdk-step-content-0-3\"]/app-form-section/form/app-material/app-material-body/app-form-section-feature-card[5]"));
        pay.click();
    }

    public void contentManagement(){
        WebElement content = driver.findElement(By.xpath("//*[@id=\"cdk-step-content-0-3\"]/app-form-section/form/app-material/app-material-body/app-form-section-feature-card[6]"));
        content.click();
    }

    public void customerRelantionship(){
        WebElement customer = driver.findElement(By.xpath("//*[@id=\"cdk-step-content-0-3\"]/app-form-section/form/app-material/app-material-body/app-form-section-feature-card[7]"));
        customer.click();
    }

    public void enterpriseResource(){
        WebElement enterprise = driver.findElement(By.xpath("//*[@id=\"cdk-step-content-0-3\"]/app-form-section/form/app-material/app-material-body/app-form-section-feature-card[8]"));
        enterprise.click();
    }

    public void otherIntegration(String integration){
        WebElement otherI = driver.findElement(By.xpath("//*[@id=\"mat-input-11\"]"));
        otherI.sendKeys(integration);
    }

    public void addIntegration(){
        WebElement addI = driver.findElement(By.xpath("//*[@id=\"cdk-step-content-0-3\"]/app-form-section/form/app-material/app-material-body/app-multiple-input/mat-form-field/div/div[1]/div[2]/mat-icon"));
        addI.click();
    }

    public void getMake(){
        WebElement get = driver.findElement(By.xpath("//*[@id=\"cdk-step-content-0-3\"]/div/button[2]/span[1]"));
        get.click();
    }

    public void lastBack(){
        WebElement last = driver.findElement(By.xpath("//*[@id=\"cdk-step-content-0-3\"]/div/button[1]/span[1]"));
        last.click();
    }

    public void enterEmailAccount(String email){
        WebElement emailacc = driver.findElement(By.xpath("//*[@id=\"mat-input-12\"]"));
        emailacc.sendKeys(email);
    }

    public void checkBox1(){
        WebElement check = driver.findElement(By.xpath("//*[@id=\"mat-checkbox-1\"]/label/span[1]"));
        check.click();
    }

    public void checkBox2(){
        WebElement check2 = driver.findElement(By.xpath("//*[@id=\"mat-checkbox-2\"]/label/span[1]"));
        check2.click();
    }

    public void sendButton(){
        WebElement send = driver.findElement(By.xpath("//*[@id=\"submit-estimate-btn_sub\"]"));
        send.click();
    }












}
