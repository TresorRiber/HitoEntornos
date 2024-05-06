package org.example;

import org.junit.jupiter.api.*;
import org.junit.platform.runner.JUnitPlatform;
import org.junit.platform.suite.api.SelectPackages;
import org.junit.runner.RunWith;

import static org.junit.jupiter.api.Assertions.*;
@RunWith(JUnitPlatform.class)
@SelectPackages("org.example.CalculadoraLoca")

class CalculadoraLocaTest {

    @BeforeAll
    void setUpAll() {
    }

    @AfterAll
    void tearDownAll() {
    }

    @Test
    void main() {
    }

    @Test
    void calculate() {
    }
}