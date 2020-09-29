package com.epam;

import com.epam.data.*;
import com.epam.logic.Calculator;

public class Main {
    public static void main(String[] args) {
        Present present = new Present();
        Calculator calculator = new Calculator();
        ChocolateCandy chocolateCandy = new ChocolateCandy(5.5f);
        CaramelCandy caramelCandy = new CaramelCandy(4.4f);
        NutCandy nutCandy = new NutCandy(7);
        FileDataAcquirer fileDataAcquirer = new FileDataAcquirer();

        present.addCandy(caramelCandy);
        present.addCandy(chocolateCandy);
        present.addCandy(nutCandy);
        fileDataAcquirer.inputIn(calculator.getWeight(present));



    }
}
