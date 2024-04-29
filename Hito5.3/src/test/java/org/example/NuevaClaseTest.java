package org.example;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.*;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvFileSource;
import org.junit.jupiter.api.condition.EnabledOnOs;
import org.junit.jupiter.api.condition.OS;
import org.junit.platform.runner.JUnitPlatform;
import org.junit.platform.suite.api.SelectPackages;
import org.junit.runner.RunWith;

@RunWith(JUnitPlatform.class)
@SelectPackages("java.org.example.NuevaClase")
class NuevaClaseTest {
    @BeforeAll
    static void setUpAll() {
        System.out.println("Van a comenzar las pruebas JUnit ");
    }

    @AfterAll
    static void tearDownAll() {
        System.out.println("Ya has realizado todas las pruebas correctamente");
    }

    @Nested
    @DisplayName("CRUD Tests")
    class CrudTests {

        @Test
        @DisplayName("Create Test")
        void createTest() {
            assertEquals(5, 2 + 3);
        }

        @Test
        @DisplayName("Read Test")
        void readTest() {
            assertNotEquals(0, 1);
        }

        @Test
        @DisplayName("Update Test")
        void updateTest() {
            assertNotNull(new Object());
        }

        @Test
        @DisplayName("Delete Test")
        void deleteTest() {
            assertFalse(false);
        }
    }

    @RepeatedTest(3)
    @DisplayName("Repeated Test")
    void repeatedTest() {
        assertArrayEquals(new int[]{1, 2, 3}, new int[]{1, 2, 3});
    }

    @Test
    @EnabledOnOs(OS.WINDOWS)
    @DisplayName("Test for Windows")
    void testForWindows() {
        assertTrue(true);
    }

    @Tag("Controller")
    @DisplayName("Controller Tests")
    @ParameterizedTest
    @CsvFileSource(resources = "/data.csv")
    void controllerTest(int param) {
        assertTrue(param > 0 && param < 100);
    }
}