package Hooks;

import io.cucumber.java.After;
import io.cucumber.java.Before;


public class myHooks {
    @Before ("@Subscription")
    public void beforeHook()
    {
        System.out.println(">>>>>>>>>>>>>>Before every Scenario execute<<<<<<<<<<<<<<<<< ");
    }
    @After
    public void afterHook()
    {
        System.out.println(">>>>>>>>>>>>>>After every Scenario execute<<<<<<<<<<<<<<<<< ");
    }
}
