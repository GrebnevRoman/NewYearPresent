package com.epam.logic;

import com.epam.data.Candy;
import com.epam.data.Present;
import java.util.List;

public class Calculator {
    public float getWeight(Present present) {
        float currentWeight = 0;
        List<Candy> candyList = present.getCandyList();
        for (Candy candy : candyList) {
            currentWeight += candy.getWeight();
        }
        return currentWeight;
    }

}
