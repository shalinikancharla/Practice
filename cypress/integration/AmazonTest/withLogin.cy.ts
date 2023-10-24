import { HomePageDependencies,HomePageRobotEyes,HomePageRobotHands } from "../../robots/AmazonApplication/homePage";
import { OrderPageRobotEyes,OrderPageRobotHands } from "../../robots/AmazonApplication/orderDetailsPage";
import { PaymentRobotEyes,PaymentRobotHands } from "../../robots/AmazonApplication/paymentpage";
import { AddressPageRobotHands,AddressPageRobotEyes } from "../../robots/AmazonApplication/addressPage";
import { get, method } from "cypress/types/lodash";
context('Amazon Application Without Login',()=>{
    const homePageRobotEyes = new HomePageRobotEyes;
    const homePageRobotHands =new HomePageRobotHands;
    const homePageDependencies=new HomePageDependencies;
    const orderPageRobotEyes =new OrderPageRobotEyes
    const orderPageRobotHands=new OrderPageRobotHands;
    const paymentRobotEyes = new PaymentRobotEyes;
    const paymentRobotHands=new PaymentRobotHands;
    const addressPageRobotEyes=new AddressPageRobotEyes;
    const addressPageRobotHands=new AddressPageRobotHands;
    describe('Search the required information for Amazon Shopping', ()=>{
        before(()=> {
            homePageDependencies.visitAmazon();
            
            
         })
         it('Login to Amazon Application with valid credentials',()=>{
            homePageRobotHands.clickOnSignIn();
            homePageRobotHands.amazonLogin();
            homePageRobotEyes.seesLoginText();
            homePageRobotHands.clickOnYourOrder();
            orderPageRobotEyes.seesOrderTitle();
            orderPageRobotHands.clickOnPastOneYearOrder();
            orderPageRobotEyes.seesGetFirtstItem();
            orderPageRobotHands.clickOnViewOrderDetails();
         })
         it('Payment Page',()=>{
            orderPageRobotHands.clickOnReturnYourAccount();
            paymentRobotHands.clickOnPaymentOption()
            homePageRobotHands.amazonLogin();
            paymentRobotEyes.seesPaymentTitle();//Assertion for title
            paymentRobotEyes.seesPaymentOption();//Assertion for text

         })
         it("Delivery Page",()=>{
            paymentRobotHands.clickOnYourAccountFromPayment()
            addressPageRobotHands.clickOnDeliveryOption();
            homePageRobotHands.amazonLogin();
            addressPageRobotHands.clickOnAddAddress()
            addressPageRobotEyes.seesAddressTitle();
            addressPageRobotHands.enterPhoneNumber();
            addressPageRobotHands.enterPinCode();
            addressPageRobotHands.enterAddress();
            addressPageRobotHands.enterArea();
            addressPageRobotHands.enterLandMark();
            addressPageRobotHands.enterFullName();
            addressPageRobotHands.clickOnSelectCheckBox()
            addressPageRobotHands.selectAnAddressType()
            addressPageRobotHands.clickOnButtonAddAddress()
            addressPageRobotEyes.seesAddressSaved()

        })


    })
    describe.skip('API calls swagger pet store',()=>{
        it('find Australia locator',()=>{
            cy.visit('https://www.amazon.in/deals?ref_=nav_cs_gb')
            cy.get('div[class="navFooterLine navFooterLinkLine navFooterPadItemLine"] ul li').contains('China').click()
        })
    
    })

  
})