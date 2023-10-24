import { BaseEyes, BaseHands } from "./baseRobot";

export class AddToCartEyes extends BaseEyes{
    seesQuantity(){
        this.seesDomContainText("#quantity",'Quantity')
    }
        
    
    seesMinimumNumberOfElements(){
        
        cy.get(".a-size-small").should('be.visible')
}
seesAddToCartText(){
    this.seesDomContainText("#add-to-cart-button",'Add to Cart')
}

seesCartSuccessFullMessage(){
    //cy.contains("Added to Cart")
    cy.get(".a-size-medium-plus").should('be.visible')
}
}

export class AddToCartHands extends BaseHands{
    
    selectQuantity(){
    this.clickOnSelectItem("#quantity",'2')
    }
    clickOnAddToCart(){
    this.clickOnDomElement("#add-to-cart-button")

    }
    clickOnSkipButton(){
        //this.clickOnId('attachSiNoCoverage-announce')
        cy.get("#attachSiNoCoverage-announce").click({force:true})
        this.wait(2000)
    }
    



}