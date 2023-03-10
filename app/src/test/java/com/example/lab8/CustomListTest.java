package com.example.lab8;


import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;


//import org.junit.Before;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;

public class CustomListTest {

    private CustomList list = new CustomList(null, new ArrayList<>());;

    private City mockCity() {
        return new City("Edmonton", "Alberta");

    }

    @Test
    void addCityTest() {
        int listSize = list.getCount();
        list.addCity(new City("Estevan", "SK"));
        assertEquals(list.getCount(), listSize + 1);
    }


    @Test
    void hasCityTest() {
        City mockCity = mockCity();
        list.addCity(mockCity);
        assertTrue(list.hasCity(mockCity));
        City city = new City("Calgary", "Alberta");
        list.addCity(city);
        assertTrue(list.hasCity(city));
        City noCity = new City("RedDeer", "Alberta");
        assertFalse(list.hasCity(noCity));
    }

    @Test
    void deleteTest() {

        City mockCity = mockCity();
        list.addCity(mockCity);
        assertTrue(list.hasCity(mockCity));
        City delCity = new City("RedDeer", "Alberta");
        list.addCity(delCity);
        assertTrue(list.hasCity(delCity));
        list.delete(delCity);
        assertFalse(list.hasCity(delCity));
    }

    @Test
    void countCitiesTest() {
        assertEquals(1, cityList.countCities());
        City firstCity = new City("Vancouver", "BC");
        City secondCity = new City("Victoria", "BC");

        list.addCity(firstCity);
        assertEquals(2, cityList.countCities());
        list.addCity(secondCity);
        assertEquals(3, cityList.countCities());
        list.delete(firstCity);

        assertEquals(2, cityList.countCities());

    }




}

