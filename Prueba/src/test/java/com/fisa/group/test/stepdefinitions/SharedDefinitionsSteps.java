package com.fisa.group.test.stepdefinitions;

import com.fisa.group.test.tasks.Task_URL;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.es.Cuando;
import io.cucumber.java.es.Dado;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;
import net.thucydides.core.annotations.Managed;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.Actions;

import static com.fisa.group.test.stepdefinitions.ParameterDefinitionsStatics.FISA;
import static com.fisa.group.test.tasks.Task_Notas.task_Notas;

public class SharedDefinitionsSteps {

    @Managed(driver = "chrome")
    public static WebDriver driver;
    public static Actions actions;

    @Before
    public void config() {
        actions = new Actions(driver);
        FISA.can(BrowseTheWeb.with(driver));
    }

    @After
    public void tearDown() {
        try {
            Thread.sleep(2000);
            Runtime.getRuntime().exec("taskkill /F /IM chromedriver.exe"); // Para ChromeDriver
            Runtime.getRuntime().exec("taskkill /F /IM chrome.exe"); // Para Google Chrome
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @Dado("que se ingresa al piano")
    public void que_se_ingresa_al_piano() {
        FISA.attemptsTo(Task_URL.task_url());
    }

    @Cuando("se tocan las notas {string} con {string}")
    public void se_tocan_las_notas_con(String notas, String repeticion) {
        FISA.attemptsTo(task_Notas(notas, repeticion));
    }
}