import {BaseEyes,BaseHands } from "./baseRobot";

export class MobileSearchRobotEyes extends BaseEyes{
    seesChildWindowText(){
        this.seesIdVisible("breadcrumb-back-link")
    }
    seesParentWindowText(){
        
        cy.get(".a-color-state").should('be.visible');
    }
}

export class MobileSearchRobotHands extends BaseHands{
        clickonLastDisplayedItem(){
            //cy.scrollTo(0,4000);
            this.wait(5000)
    
            cy.get(".sg-col-inner img[class='s-image']").last().scrollIntoView()
           cy.get("a[class='a-link-normal s-no-outline']").last().invoke('removeAttr','target').click({force: true});
        }
        clickOnLeftNavigation(){
            this.clickOnId("nav-hamburger-menu")
        }
        clickOnMobilesComputers(){
            
            cy.contains("Mobiles, Computers").click();
        }
        clickOnAllMobilePhones(){
            this.wait(3000)
            cy.contains("All Mobile Phones").click({force: true} )
        }
        navigateToMainMenu(){
            this.wait(2000)
            cy.go('back')
            cy.go('back')
            cy.scrollTo('top')
        }
    
    }


