package com.example.listcity2;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * Maintains an ordered collection of cities.
 */
public class CityList {
    private List<City> cities = new ArrayList<>();

    /**
     * Adds a city when it is not already stored.
     * @param city the city to add
     */
    public void add(City city) {
        if (cities.contains(city)) {
            throw new IllegalArgumentException();
        }
        cities.add(city);
    }

    /**
     * cities sorted by name.
     * @return sorted list of cities
     */
    public List<City> getCities() {
        List<City> list = new ArrayList<>(cities);
        Collections.sort(list);
        return list;
    }

    /**
     * Checks whether the list contains the city.
     * @param city the city to search
     * @return true when the city exists
     */
    public boolean hasCity(City city) {
        return cities.contains(city);
    }

    /**
     * Remov the city when present.
     * @param city the city to remove
     * @throws IllegalArgumentException when the city does not exist
     */
    public void delete(City city) {
        if (!cities.remove(city)) {
            throw new IllegalArgumentException();
        }
    }

    /**
     * Countshow many cities are stored.
     * @return number of cities
     */
    public int countCities() {
        return cities.size();
    }
}
