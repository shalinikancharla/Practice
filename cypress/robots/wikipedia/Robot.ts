import { BaseHands, BaseEyes, BaseDependencies } from '../AmazonApplication/baseRobot';


export class Dependencies extends BaseDependencies {
   
    visitWikipedia(){
        this.accessUrl('https://www.wikipedia.org/');
    }
}

export class RobotEyes extends BaseEyes{
    seesMainPage(){
        this.seesDomVisible("Main page")
    }  
}

export class RobotHands extends BaseHands{

    searchtesting(){
        this.typeTextonDom("name", "search", "Automation Testing")
            .clickOnDomElement("[class='sprite svg-search-icon']")
    }
}