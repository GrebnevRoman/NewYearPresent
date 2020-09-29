package com.epam.data;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;


class PresentTest {
    Present present = new Present();
    ChocolateCandy chocolateCandy = new ChocolateCandy(5.5f);
    @Test
    void shouldAddCandy(){
        boolean addCandy = present.addCandy(chocolateCandy);
        Assertions.assertEquals(addCandy,true);
    }

}