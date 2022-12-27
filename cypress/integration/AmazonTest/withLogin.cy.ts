import { RobotEyes, RobotHands, Dependencies } from '../../robots/AmazonApplication/Amazon';

context('Amazon Test Without Login', () => {
    const robotEyes = new RobotEyes();
    const robotHands = new RobotHands();
    const dependencies = new Dependencies();
    
        describe('Search the required information for Amazon Shopping', ()=>{
            before(()=> {
                dependencies.visitAmazon();
                
                
            })
    
            it("navigate to Orders page", () => {
                robotHands.clickOnSignIn()
                robotHands.amazonLogin();
                robotEyes.seesLoginText();//Assertion for login text
                robotHands.clickOnYourOrder()
                robotEyes.seesOrderTitle();
                robotHands.clickOnDeliveryCheckBox();
                robotEyes.seesGetFirtstItem();
                robotHands.clickOnViewOrderDetails()
                robotEyes.seesDelivreyStatus()
                robotHands.clickOnReturnYourOrder()
                robotHands.clickOnPastOneYearOrder();
                robotEyes.seesPastOneYearOrder()
                


            })
            it('Payment Page',()=>{
                robotHands.clickOnReturnYourAccount();
                robotHands.clickOnPaymentOption()
                robotHands.amazonLogin()
                robotEyes.seesPaymentTitle();//Assertion for title
                robotEyes.seesPaymentOption();//Assertion for text
                robotHands.clickOnYourAccountFromPayment()

                
            })
            it("Delivery Page",()=>{
                robotHands.clickOnDeliveryOption();
                robotHands.amazonLogin();
                robotHands.clickOnAddAddress()
                robotEyes.seesAddressTitle();
                //robotHands.enterFullName();
                robotHands.enterPhoneNumber();
                robotHands.enterPinCode();
                robotHands.enterAddress();
                robotHands.enterArea();
                robotHands.enterLandMark();
                //robotHands.enterCity();
                robotHands.enterFullName();
                robotHands.clickOnSelectCheckBox()
                robotHands.selectAnAddressType()
                robotHands.clickOnButtonAddAddress()
                robotEyes.seesAddressSaved

            })
        })
    })