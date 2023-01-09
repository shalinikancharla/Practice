package Pages;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;
import testUtil.utility;

import java.util.List;

public class AddressPage extends utility {
     WebDriver driver;
     @FindBy(xpath="//div[@class='a-box-inner a-padding-extra-large']")
    WebElement addAddress;
    @FindBy(xpath="//input[@name='address-ui-widgets-enterAddressFullName']")WebElement fullName;
    //mobile number
    @FindBy(xpath="//input[@id='address-ui-widgets-enterAddressPhoneNumber']")WebElement mobileNumber;
    //Pin Number
    @FindBy(css="#address-ui-widgets-enterAddressPostalCode")WebElement pinNumber;
    //enter address
    @FindBy(xpath="//input[@id='address-ui-widgets-enterAddressLine1']")WebElement address;
    //give area
    @FindBy(xpath="//input[@id='address-ui-widgets-enterAddressLine2']")WebElement area;
    //landmark
    @FindBy(xpath="//input[@id='address-ui-widgets-landmark']")WebElement landmark;
    @FindBy(xpath="//input[@aria-labelledby='address-ui-widgets-form-submit-button-announce']")
    WebElement defaultAddress;
    @FindBy(xpath="//select[@class='a-native-dropdown']")WebElement addressType;
    @FindBy(xpath="//div[@id='a-popover-8']//ul[@role='listbox']/li")
    List<WebElement> addresses;


    @FindBy(xpath="//input[@aria-labelledby='address-ui-widgets-form-submit-button-announce']")
    WebElement addAddressBtn;
    @FindBy(css="#a-autoid-10")WebElement saveAddress;
    @FindBy(css="#ya-myab-display-address-block-5 #address-ui-widgets-FullName")WebElement verifyAdd;



    public AddressPage(WebDriver driver) {
        super(driver);
        PageFactory.initElements(driver,this);
        this.driver=driver;
    }
    public void selectAddAddress(){
        addAddress.click();
    }
    public void verifyAddressPage(){
        String verifyAddress= driver.getTitle();
        System.out.println(verifyAddress);
        Assert.assertEquals(verifyAddress,"Your Addresses");
    }
    By clickName= By.cssSelector("#address-ui-widgets-enterAddressFullName");
//    public void addressPageDetails(String fUName,String mobNm,String pinNum,
//                                   String yourAdrs,String cityArea,String landMark) throws InterruptedException {
////        visibilityOfWait(clickName);
//        fullName.clear();
//        Thread.sleep(2000);
//        fullName.sendKeys(fUName);
//        Thread.sleep(2000);
//
//        mobileNumber.clear();
//        mobileNumber.sendKeys(mobNm);
//        Thread.sleep(2000);
//
//        pinNumber.clear();
//        pinNumber.sendKeys(pinNum);
//        Thread.sleep(2000);
//
//        address.clear();
//        address.sendKeys(yourAdrs);
//        Thread.sleep(2000);
//
//        area.clear();
//        area.sendKeys(cityArea);
//        Thread.sleep(2000);
//
//        landmark.clear();
//        landmark.sendKeys(landMark);
//    }
    public void enterFullName(String fName){
        fullName.sendKeys(fName);
    }
    public void enterMobileNumber(String mobile){
        mobileNumber.sendKeys(mobile);
    }
    public void enterPinCode(String pinCode){
        pinNumber.sendKeys(pinCode);
    }
    public void enterAddress(String adrs){
        address.sendKeys(adrs);
    }
    public void enterArea(String areaCity){
        area.sendKeys(areaCity);
    }
    public void enterLandMark(String landMark){
        landmark.sendKeys(landMark);
    }
    public void selectDefaultAddress(){
        boolean checked= defaultAddress.isSelected();
        if(!checked)
        {
            defaultAddress.click();
        }
    }
    public void selectAnAddressType() throws InterruptedException {
        Thread.sleep(3000);
//        Select select=new Select(addressType);
//        select.selectByVisibleText(" Home (7 am – 9 pm delivery) ");
        for(WebElement address: addresses)
        {
            if(address.getText().equalsIgnoreCase("Home (7 am – 9 pm delivery)"))
            {
                address.click();
                break;
            }
        }
    }
    public void addAddressButton() throws InterruptedException {
        Thread.sleep(2000);
        addAddressBtn.click();
        saveAddress.click();
    }
    public void verifyAddNewAddressPage()
    {
        String addNewAddressTxt=verifyAdd.getText();
        Assert.assertEquals(addNewAddressTxt,"ShaliniIruvuru");

    }




}
