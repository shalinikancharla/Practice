import { BaseHands, BaseEyes, BaseDependencies } from './baseRobot';
import data from  '../../integration/fixtures/example.json';

export class HomePageDependencies extends BaseDependencies{
    visitAmazon(){
        this.accessUrl(data.url);
    }
    }

    export class HomePageRobotEyes extends BaseEyes{
        seesMainPage(){
            this.seesIdVisible('nav-logo-sprites')
        } 
        seesSearchBarVisible(){
            this.seesIdVisible("twotabsearchtextbox")
        }
        seesLoginText(){
            cy.contains(data.name).should('be.visible')
        }
    
      

    }
    export class HomePageRobotHands extends BaseHands{
        clickOnCart(){
            this.clickOnId('#nav-cart-count-container')
        }
        searchForMobiles(){
            this.typeTextonId("twotabsearchtextbox","Mobiles")
        }
        clickOnSearchBar(){
            this.clickOnDomElement("#nav-search-submit-button")
            this.wait(2000)
    
        }
        clickOnSignIn(){
            cy.get('#nav-link-accountList').trigger("mouseover")
            cy.get("#nav-flyout-ya-signin span[class='nav-action-inner']",).click()
        }
        amazonLogin(){
            this.typeTextonId("ap_email",data.email)
            cy.get("#continue").click()
            this.typeTextonId("ap_password", data.password)
            cy.get("#signInSubmit").click();    
            
        }
        clickOnYourOrder()
        {
           cy.get('#nav-link-accountList').click()
           cy.get('div[data-card-identifier="YourOrders"]').click();
        }
       
    
    


    }
    
