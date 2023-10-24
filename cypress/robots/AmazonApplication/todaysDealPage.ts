import { BaseHands,BaseEyes,BaseDependencies } from "./baseRobot";
 export class TodaysDealsRobotEyes extends BaseEyes{
    seesTodaysDealsPage(){
        this.seesDomTitle("Amazon.in - Today's Deals")
    } 
 }
 export class TodaysDealsRobothands extends BaseHands{
    clickOnTodaysDeals(){
        this.clickOnDomElement(".nav-a[href='/deals?ref_=nav_cs_gb']")
    }
    clickOnThirdDeal(){
        this.clickOnDomElement("div[data-testid='grid-deals-container'] [class$='DealGridItem-module__dealItemDisplayGrid_e7RQVFWSOrwXBX4i24Tqg DealGridItem-module__withBorders_2jNNLI6U1oDls7Ten3Dttl DealGridItem-module__withoutActionButton_2OI8DAanWNRCagYDL2iIqN']:nth-of-type(3)")
    }
    clickOnInnerThirdDeal(){
        this.clickOnDomElement("ul[class='a-unordered-list a-nostyle a-horizontal a-spacing-none'] li:nth-of-type(3)")

    }
 }