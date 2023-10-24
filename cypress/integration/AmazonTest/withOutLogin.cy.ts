import { HomePageDependencies,HomePageRobotEyes,HomePageRobotHands } from "../../robots/AmazonApplication/homePage";
import { TodaysDealsRobotEyes,TodaysDealsRobothands } from "../../robots/AmazonApplication/todaysDealPage";
import { AddToCartEyes,AddToCartHands} from "../../robots/AmazonApplication/addToCartPage";
import { MobileSearchRobotHands,MobileSearchRobotEyes } from "../../robots/AmazonApplication/mobileSearchPage";
import { constant } from "cypress/types/lodash";
context('Amazon Application Without Login',()=>{
    const homePageRobotEyes = new HomePageRobotEyes;
    const homePageRobotHands =new HomePageRobotHands;
    const homePageDependencies=new HomePageDependencies;
    const todaysDealsRobotEyes=new TodaysDealsRobotEyes;
    const todaysDealsRobothands=new TodaysDealsRobothands;
    const addToCartEyes =new AddToCartEyes;
    const addToCartHands=new AddToCartHands
    const mobileSearchRobotEyes= new MobileSearchRobotEyes
    const mobileSearchRobotHands =new MobileSearchRobotHands;

    describe('Search the required information for Amazon shopping',()=>{
        before(()=> {
            homePageDependencies.visitAmazon();
        })
        it("navigate to Home page", () => {
            homePageRobotEyes.seesMainPage()
            
        });
        it('navigate to TodaysDeals Page',()=>{
            todaysDealsRobothands.clickOnTodaysDeals();
            todaysDealsRobotEyes.seesTodaysDealsPage();
            todaysDealsRobothands.clickOnThirdDeal();
            todaysDealsRobothands.clickOnInnerThirdDeal();
        })
        it('navigate to AddtoCart Page',()=>{
            addToCartEyes.seesQuantity;
            addToCartHands.clickOnSelectItem;
            cy.wait(2000);

            //addToCartEyes.seesAddToCartText();
            addToCartHands.clickOnAddToCart();
            cy.wait(2000)

            addToCartHands.clickOnSkipButton();
            cy.wait(2000)


            //addToCartEyes.seesMinimumNumberOfElements;
            //homePageRobotHands.clickOnCart();
            
            //addToCartEyes.seesCartSuccessFullMessage();

        })

 })
 describe.skip('Search for Mobiles', ()=>{
    Cypress.on('uncaught:exception', (err, runnable) => {
        return false
      })
    before(()=> {
        homePageDependencies.visitAmazon()
    })
    it('search for Mobiles',()=>{
        homePageRobotEyes.seesSearchBarVisible()
        homePageRobotHands.searchForMobiles()
        homePageRobotHands.clickOnSearchBar()
    })
    it('get the Last Displayed Item',()=>{

        mobileSearchRobotHands.clickonLastDisplayedItem()
        mobileSearchRobotEyes.seesChildWindowText();       

    })
    it('childwindow navigation to select mobiles',()=>{
        mobileSearchRobotHands.clickOnLeftNavigation();
        mobileSearchRobotHands.clickOnMobilesComputers()
        mobileSearchRobotHands.clickOnAllMobilePhones();
        mobileSearchRobotHands.navigateToMainMenu();
        mobileSearchRobotEyes.seesParentWindowText()

    })


 })


})
