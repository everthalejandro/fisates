package com.fisa.group.test.tasks;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Open;

import static com.fisa.group.test.stepdefinitions.ParameterDefinitionsStatics.*;
import static com.fisa.group.test.stepdefinitions.SharedDefinitionsSteps.driver;

public class Task_URL implements Task {
String Report;
    public static Task_URL task_url(){
        return new Task_URL();
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        try {
            driver.manage().window().maximize();
            actor.wasAbleTo(Open.url(url));
            Thread.sleep(waitSleep);
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
}