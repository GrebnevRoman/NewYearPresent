package com.epam.data;

import java.util.*;


public class Present {
    private final List<Candy> list = new ArrayList<Candy>();

    public List<Candy> getCandyList() {
        return list;
    }

    public boolean addCandy(Candy candy) {
       return list.add(candy);
    }

}


