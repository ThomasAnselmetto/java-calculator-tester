package org.lessons;


import org.junit.jupiter.api.*;
import static org.junit.jupiter.api.Assertions.*;
class CalculatorTest {
//l'annotation test identifica all'interno di una qualsiasi classe effettivamente un metodo di test (void peche' non c'e alcun tipo di return)



    //    dichiaro Calculator
    private Calculator calculator;
    //    @BeforeAll
//    static void setup(){
//        System.out.println("Before all tests");
//    }
    @BeforeEach
    void init(){
        System.out.println("Before each test");
//        prima di ogni test inizializzo con una Calcolatrice vuota
        calculator = new Calculator();
    }

    @Test

    void add() {
//        uso gli assertion con il parametro atteso e quello dato
//        mi faccio aiutare da intellij perche' avevo messo dei double e non dei float'
        Assertions.assertEquals(3, calculator.add(1, 2));
        Assertions.assertEquals(10.6, calculator.add(5.3F, 5.3F));
    }

    @Test
    void subtract() {
        Assertions.assertEquals(3,calculator.subtract(8,5));
        Assertions.assertEquals(1,calculator.subtract(5.5F,4.5F));
    }

    @Test
    void divide() {
        Assertions.assertEquals(3,calculator.subtract(8,5));
        assertThrows(IllegalArgumentException.class,() -> calculator.divide(10,0));
    }

    @Test
    void multiply() {
        Assertions.assertEquals(50,calculator.subtract(10,5));

    }
//@AfterEach
//    void clear(){
//    System.out.println("After each test");
//}
//
//@AfterAll
//    static void close(){
//    System.out.println("At the end of all tests");
//}
}