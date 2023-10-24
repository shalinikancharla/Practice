import { BaseHands, BaseEyes, BaseDependencies } from './baseRobot';
import data from  '../../integration/fixtures/example.json';

export class AddressPageRobotEyes extends BaseEyes{
    seesAddressTitle(){
        this.seesDomTitle("Your Addresses")
        }
        seesAddressSaved(){
            cy.get(".a-alert-heading").should('be.visible')
            
        }

}
export class AddressPageRobotHands extends BaseHands{
    clickOnDeliveryOption(){
        this.clickOnDomElement("div[data-card-identifier='AddressesAnd1Click']")
     }
     clickOnAddAddress(){
        this.clickOnDomElement("#ya-myab-address-add-link > .a-box")
     }
     enterFullName(){
            
     this.typeTextonId("address-ui-widgets-enterAddressFullName",data.FullName)
        
    }
    enterPhoneNumber(){
            
        this.typeTextonId("address-ui-widgets-enterAddressPhoneNumber",data.PhoneNumber)
            //cy.clear()
        
    }
    enterPinCode(){
        this.typeTextonId("address-ui-widgets-enterAddressPostalCode",data.PinCode)
            //cy.clear()
        
    }
    
    enterAddress(){
        this.typeTextonId("address-ui-widgets-enterAddressLine1",data.Address)
        
    }
    enterArea(){
        this.typeTextonId("address-ui-widgets-enterAddressLine2",data.Area)
        
    }
       
    enterLandMark(){
        this.typeTextonId("address-ui-widgets-landmark",data.LandMark)
        
    }
    enterCity(){
        this.typeTextonId("address-ui-widgets-enterAddressCity",data.City)
        
    }
    clickOnSelectCheckBox(){
        cy.get("#address-ui-widgets-use-as-my-default").check()
    }
    selectAnAddressType(){
        //this.clickOnSelectItem("select[class='a-native-dropdown']",'Home (7 am – 9 pm delivery)')
        cy.contains('Add preferences, notes, access codes and more').click();
        cy.get("span > button[aria-label='House']").click()
        cy.get("div[data-a-input-name='preferredDeliveryLocationOTHER'] input[type='radio']").first().check()
    }
    clickOnButtonAddAddress(){
        this.clickOnDomElement("#address-ui-widgets-form-submit-button > .a-button-inner > .a-button-input")
    }
    

}