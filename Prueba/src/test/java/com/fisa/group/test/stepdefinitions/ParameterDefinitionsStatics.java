package com.fisa.group.test.stepdefinitions;

import net.serenitybdd.screenplay.Actor;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class ParameterDefinitionsStatics {

    public static Actor FISA = Actor.named("FISA");

    public static Properties properties = new Properties();

    public static int waitElements;
    public static int waitSleep;
    public static int waitDatabase;
    public static String url;
    public static String[] sNotas;

    public ParameterDefinitionsStatics() {
        loadProperties();
    }

    public static void loadProperties() {
        try {
            properties = new Properties();
            FileInputStream fileInputStream = new FileInputStream("serenity.properties");
            properties.load(fileInputStream);

            url = getPropertyOrEnv("URL");

        } catch (IOException | NumberFormatException e) {
            throw new RuntimeException(e);
        }
    }

    private static String getPropertyOrEnv(String key) {
        return System.getenv(key) == null ? properties.getProperty(key) : System.getenv(key);
    }
}