package com.vytrack.step_definitions;

import io.cucumber.java.After;
import io.cucumber.java.Before;

public class Hooks {

    @Before
    public void setup() {
        System.out.println("\tThis is coming from BEFORE");
    }

    @After
    public void tearDown() {
        System.out.println("\tThis is coming from AFTER");
    }

    @Before("@db")
    public void setupDB() {
        System.out.println("\tThis is coming from BEFORE");
        System.out.println("\tConnecting to database...");
    }

    @After("@db")
    public void tearDownDB() {
        System.out.println("\tThis is coming from AFTER");
        System.out.println("\tReconnecting from database...");
    }
}
