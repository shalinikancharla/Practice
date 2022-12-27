//import { data } from 'cypress/types/jquery';
import { BaseHands, BaseEyes, BaseDependencies } from '../../robots/AmazonApplication/BaseRobot';
//import {data} from '../../fixtures/example'


export class Dependencies extends BaseDependencies {
    
    visitAmazon(){
        this.accessUrl("https://www.amazon.in/");
    }
    
    
}
export class RobotEyes extends BaseEyes{
    seesMainPage(){
        this.seesIdVisible('nav-logo-sprites')
    } 
    seesTodaysDealsPage(){
        this.seesDomTitle("Amazon.in - Today's Deals")
    } 
    // seesTodaysDealsPage(){
    //     cy.title().should('eq',"Amazon.in - Today's Deals")
    //
    
    
    seesMinimumNumberOfElements(){
        //let value=2;
        //cy.contains("Proceed to checkout ("{value}"  items)").should('be.visible')
        //cy.get("input[value='Proceed to checkout']").should('be.visible')
        cy.get(".a-size-small").should('be.visible')
    }
    seesSearchBarVisible(){
        this.seesIdVisible("twotabsearchtextbox")
    }
    seesChildWindowText(){
        this.seesIdVisible("breadcrumb-back-link")//child window showing back to results
    }
    seesParentWindowText(){
        
        //this.seesDomUrl("https://www.amazon.in/s?k=Mobiles&crid=34K5L8EUX4O5Q&sprefix=mobiles%2Caps%2C526&ref=nb_sb_noss_1")
        //cy.contains("Related searches").should('be.visible')
        //cy.scrollTo('Top')
        //this.seesDomContainText("twotabsearchtextbox","Mobiles")
        cy.get(".a-color-state").should('be.visible');
    }

    //with login
    seesLoginText(){
        cy.contains("Hello, pradad").should('be.visible')
    }
    seesOrderTitle(){
        this.seesDomTitle("Your Orders")
    }
    seesGetFirtstItem(){
        cy.contains("1 November 2022").should('be.visible')
        
    }
    seesDelivreyStatus(){
        cy.contains("Ordered on 1 November 2022 ").should('be.visible')
    }
    seesPastOneYearOrder(){
        cy.contains("You have not placed any orders in 2021. View orders in 2020").should('be.visible')
    }
    seesPaymentTitle(){
        this.seesDomTitle("Manage Payment Methods")
    }
    seesPaymentOption(){
        cy.contains("Your Payment Options").should('be.visible')
    }
    seesAddressTitle(){
        this.seesDomTitle("Your Addresses")
        }
        seesAddressSaved(){
            cy.get(".a-alert-heading").should('be.visible')
            
        }
    }



export class RobotHands extends BaseHands{

    clickOnTodaysDeals(){
        this.clickOnDomElement(".nav-a[href='/deals?ref_=nav_cs_gb']")
    }
    clickOnThirdDeal(text:string){
        //this.clickOnDomElement("div[data-testid='grid-deals-container'] [class$='DealGridItem-module__dealItemDisplayGrid_e7RQVFWSOrwXBX4i24Tqg DealGridItem-module__withBorders_2jNNLI6U1oDls7Ten3Dttl DealGridItem-module__withoutActionButton_2OI8DAanWNRCagYDL2iIqN']:nth-of-type(3)")
        //this.clickOnChildDom("div[data-testid='grid-deals-container'] [class$='DealGridItem-module__dealItemDisplayGrid_e7RQVFWSOrwXBX4i24Tqg DealGridItem-module__withBorders_2jNNLI6U1oDls7Ten3Dttl DealGridItem-module__withoutActionButton_2OI8DAanWNRCagYDL2iIqN']");
        this.clickOnDomElement(text)
    }
    clickonInnerThirdDeal(text:string){
        //this.clickOnDomElement("ul[class='a-unordered-list a-nostyle a-horizontal a-spacing-none'] li:nth-of-type(3)")
        //this.clickOnDomElement("div[class='s-widget-container s-spacing-small s-widget-container-height-small celwidget slot=MAIN template=SEARCH_RESULTS widgetId=search-results_3']")
        //cy.get(".a-link-normal.s-no-outline").invoke('removeAttr','target').click()
        this.clickOnDomElement(text)
    }
    // clickOnSeeAllDetails(){
    //     this.clickOnDomElement("a[data-click-type='GOTODETAILPAGE']")
    // }
    selectQuantity(){
        
        this.clickOnSelectItem("#quantity",'2')
        //this.clickOnDomElement("select[name='quantity']")
        //cy.get("select[id='quantity']").select('2')
    }
    //Add to cart
    clickOnAddToCart(){
    this.clickOnDomElement("#add-to-cart-button")

    }
    searchForMobiles(){
        this.typeTextonId("twotabsearchtextbox","Mobiles")
    }
    clickOnSearchBar(){
        this.clickOnDomElement("#nav-search-submit-button")
        this.wait(2000)

    }
    clickonLastDisplayedItem(){
        //cy.scrollTo(0,4000);
        this.wait(5000)

        cy.get(".sg-col-inner img[class='s-image']").last().scrollIntoView()
       cy.get("a[class='a-link-normal s-no-outline']").last().invoke('removeAttr','target',).click({force: true});
        //this.ClickOnTextWithClassAndIndex("s-image","35")
    }
    clickOnLeftNavigation(){
        this.clickOnId("nav-hamburger-menu")
    }
    clickOnMobilesComputers(){
        
        //this.clickOnDomElement("a[class='hmenu-item'] > div[css='7']")
        cy.contains("Mobiles, Computers").click();
    }
    clickOnAllMobilePhones(){
        this.wait(2000)
        //this.clickOnDomElement("ul[class='hmenu hmenu-visible hmenu-translateX'] li:nth-child(1) a:nth-child(1)")
        cy.contains("All Mobile Phones").click()
    }
    navigateToMainMenu(){
        this.wait(2000)
        cy.go('back')
        cy.go('back')
    }


    //with login details
    clickOnSignIn(){
        cy.get('#nav-link-accountList').trigger("mouseover")
        cy.get("#nav-flyout-ya-signin span[class='nav-action-inner']",).click()
    }

    amazonLogin(){
        cy.fixture("example.json").then((data) => {
        this.typeTextonId("ap_email",data.email)
        cy.get("#continue").click()
        this.typeTextonId("ap_password", data.password)
        cy.get("#signInSubmit").click();    
        })
        
    }
 clickOnYourOrder()
 {
    cy.get('#nav-tools a').eq(1).trigger("mouseover")
    cy.get('.nav-text').contains('Your Orders',).click()
 }
 clickOnDeliveryCheckBox(){
    //cy.get('#a-autoid-1-announce').click()
    //this.clickOnSelectItem(".a-popover-inner ul>li","past 3 months");
    //cy.get("#orderFilter").select('past 3 months')
   //cy.get("a-autoid-1-announce").click()
   //cy.get('select').select('last30')
    cy.get('#a-autoid-1-announce').click()
    cy.get("#time-filter_1").click()
    //cy.get("#orderFilter >option:nth-child(1)").click()  
    //this.clickOnSelectItem("#orderFilter",'2022') 
 }
 clickOnViewOrderDetails(){
    cy.contains("View order details").click()

 }
 clickOnReturnYourOrder(){
    this.clickOnDomElement("a[title='Return to Your Orders']");
 }
 clickOnPastOneYearOrder(){
    cy.get('#a-autoid-1-announce').click()
   cy.get("#time-filter_3").click()
 }
 clickOnReturnYourAccount(){
    this.clickOnDomElement("a[title='Return to Your Account']");
 }

 //payment details
 clickOnPaymentOption(){
    this.clickOnDomElement("div[data-card-identifier='PaymentOptions']")
 }
 clickOnYourAccountFromPayment(){
    this.clickOnDomElement("[data-testid='cpe-yourAccount-header']")
 }
 //Address details
 clickOnDeliveryOption(){
    this.clickOnDomElement("div[data-card-identifier='AddressesAnd1Click']")
 }
 clickOnAddAddress(){
    this.clickOnDomElement("#ya-myab-address-add-link > .a-box")
 }
 enterFullName(){
    cy.fixture("example.json").then((data)=>{
        
    this.typeTextonId("address-ui-widgets-enterAddressFullName",data.FullName)
    //cy.clear();
    
 })
}
enterPhoneNumber(){
    cy.fixture('example.json').then((data)=>{
        
        this.typeTextonId("address-ui-widgets-enterAddressPhoneNumber",data.PhoneNumber)
        //cy.clear()
    })
}
enterPinCode(){
    cy.fixture("example.json").then((data)=>{
        this.typeTextonId("address-ui-widgets-enterAddressPostalCode",data.PinCode)
        //cy.clear()
    })


}

enterAddress(){
    cy.fixture("example.json").then((data)=>{
        this.typeTextonId("address-ui-widgets-enterAddressLine1",data.Address)
    })
}
enterArea(){
    cy.fixture("example.json").then((data)=>{
        this.typeTextonId("address-ui-widgets-enterAddressLine2",data.Area)
    })
}
   
enterLandMark(){
    cy.fixture("example.json").then((data)=>{
        this.typeTextonId("address-ui-widgets-landmark",data.LandMark)
    })
}
enterCity(){
    cy.fixture("example.json").then((data)=>{
        this.typeTextonId("address-ui-widgets-enterAddressCity",data.City)
    })
}
clickOnSelectCheckBox(){
    cy.get("#address-ui-widgets-use-as-my-default").check()
}
selectAnAddressType(){
    this.clickOnSelectItem("select[class='a-native-dropdown']",'Home (7 am – 9 pm delivery)')
}
clickOnButtonAddAddress(){
    this.clickOnDomElement("input[aria-labelledby='address-ui-widgets-form-submit-button-announce']")
}

}


