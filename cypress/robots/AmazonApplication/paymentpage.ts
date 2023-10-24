import { BaseEyes,BaseHands } from "./baseRobot";
export class PaymentRobotEyes extends BaseEyes{
    seesPaymentTitle(){
        this.seesDomTitle("Manage Payment Methods")
    }
    seesPaymentOption(){
        cy.contains("Your Payment Options").should('be.visible')
    }

}
export class PaymentRobotHands extends BaseHands{
    clickOnPaymentOption(){
        this.clickOnDomElement("div[data-card-identifier='PaymentOptions']")
     }
     clickOnYourAccountFromPayment(){
        this.clickOnDomElement("[data-testid='cpe-yourAccount-header']")
     }

}