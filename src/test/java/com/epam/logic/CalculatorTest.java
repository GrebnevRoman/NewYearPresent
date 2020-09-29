package com.epam.logic;

import com.epam.data.*;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class CalculatorTest {
    Calculator calculator = new Calculator();
    Present present = new Present();
    ChocolateCandy chocolateCandy = new ChocolateCandy(5.5f);
    CaramelCandy caramelCandy = new CaramelCandy(8.9f);
    NutCandy nutCandy = new NutCandy(4.1f);

@Test
    void shouldCalculateAllWeight(){
    present.addCandy(chocolateCandy);
    present.addCandy(caramelCandy);
    present.addCandy(nutCandy);
    float variable  = calculator.getWeight(present);
    Assertions.assertEquals(variable,18.5f);
    }



}