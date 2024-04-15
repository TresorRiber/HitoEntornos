package com.pruebas;

import static org.junit.jupiter.api.Assertions.*;

import com.pruebas.service.SmartPhoneServiceImpl;
import org.junit.jupiter.api.*;

import java.util.Scanner;
@DisplayName("Test para la clase SmartPhoneServiceImpl ")
@TestMethodOrder(MethodOrderer.OrderAnnotation.class)
public class pruebaCount {
    private SmartPhoneServiceImpl smartPhone;
    @DisplayName("Prueba del metodo count()")
    @Test
    @Order(1)
    public void count(){
        SmartPhoneServiceImpl s  = new SmartPhoneServiceImpl();

        assertNotNull(s.count()," El metodo devuelve count() devuelve NULL");
        assertTrue(s.count()>0," El valor devuelto por count() no es mayor que 0");
        assertEquals(3,s.count(),"El valor devuelto por count() no es 3");
    }
    @DisplayName("Prueba del metodo findOne() con id NULL")
    @Test
    @Order(2)
    public void findOne(){
        SmartPhoneServiceImpl s = new SmartPhoneServiceImpl();
        assertThrows(IllegalArgumentException.class,()->{
        s.findOne(null);
        });
    }
    @DisplayName("Prueba del metodo count() con assertAll")
    @Test
    @Order(3)
    public void countAll(){
        SmartPhoneServiceImpl s  = new SmartPhoneServiceImpl();

        assertAll("Method assertions",
                ()->assertNotNull(s.count()),
                ()->assertTrue(s.count()>0),
                ()->assertEquals(3,s.count())
        );
    }
    @AfterEach
    void afterEach(){
        System.out.println("Despues de cada método");
    }
    @AfterAll
    static void afterAll(){
        System.out.println("Despues de cada clase");
    }
    @BeforeEach
    void beforeEach(){
        System.out.println("Antes de cada método");
    }
    @BeforeAll
    static void beforeAll(){
        System.out.println("Antes de cada clase");
    }
}
