import { BaseEyes,BaseHands } from "./baseRobot";
export class OrderPageRobotEyes extends BaseEyes{
    seesOrderTitle(){
        this.seesDomTitle("Your Orders")
    }
    seesGetFirtstItem(){
        cy.contains("1 November 2022").should('be.visible')
        
    }

}
export class OrderPageRobotHands extends BaseHands{
     
     clickOnPastOneYearOrder(){
        cy.get('#a-autoid-1-announce').click()
        //cy.get("#orderFilter").select('2022')
        cy.get("#time-filter_3").click()
     }
     clickOnViewOrderDetails(){
        cy.contains("View order details").first().click({force: true})
     }
     clickOnReturnYourAccount(){
        this.clickOnDomElement("a[title='Return to Your Account']");
     }
    
    
}