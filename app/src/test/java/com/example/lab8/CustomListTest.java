package com.example.lab8;


import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;


//import org.junit.Before;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;

public class CustomListTest {

    private CustomList list;

    private City mockCity() {
        return new City("Edmonton", "Alberta");

    }

    public CustomList MockCityList() {
        list = new CustomList(null, new ArrayList<>());
        return list;
    }

    @Test
    void addCityTest() {
        list = MockCityList();
        int listSize = list.getCount();
        list.addCity(new City("Estevan", "SK"));
        assertEquals(list.getCount(), listSize + 1);
    }


    @Test
    void hasCityTest() {
        CustomList cityList = MockCityList();
        City mockCity = mockCity();
        cityList.add(mockCity);
        assertTrue(cityList.hasCity(mockCity));
        City city = new City("Calgary", "Alberta");
        cityList.add(city);
        assertTrue(cityList.hasCity(city));
        City noCity = new City("RedDeer", "Alberta");
        assertFalse(cityList.hasCity(noCity));
    }

    


}

