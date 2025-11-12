package com.example.addieren;


import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;
public class CalculatorTest {

    @Test
    void testAdd(){

        Calculator calc = new Calculator();
        int result = calc.add(2,3);
        assertEquals(5,result,"Addition should return correct sum");


        int result2 = calc.add(4,3);
        assertEquals(7,result2,"Addition should return correct sum");
    }


}
