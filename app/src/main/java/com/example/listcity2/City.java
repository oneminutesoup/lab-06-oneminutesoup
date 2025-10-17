package com.example.listcity2;

import java.util.Objects;

/**
 * Represents a city with its name and province.
 */
public class City implements Comparable<City> {
    private String city;
    private String province;

    /**
     * Creates a new city instance.
     * @param city the city name
     * @param province the province name
     */
    City(String city, String province) {
        this.city = city;
        this.province = province;
    }

    /**
     * Returns the name of the city.
     * @return the city name
     */
    String getCityName() {
        return this.city;
    }

    /**
     * Returns the name of the province.
     * @return the province name
     */
    String getProvinceName() {
        return this.province;
    }

    /**
     * Compares cities by name, then province when names match.
     * @param other the city to compare
     * @return comparison result using city and province names
     */
    @Override
    public int compareTo(City other) {
        int nameComparison = city.compareTo(other.getCityName());
        if (nameComparison != 0) {
            return nameComparison;
        }
        return province.compareTo(other.getProvinceName());
    }

    /**
     * Evaluates equality based on city and province names.
     * @param obj the object to compare
     * @return true when both name and province match
     */
    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof City)) {
            return false;
        }
        City other = (City) obj;
        return Objects.equals(city, other.city) && Objects.equals(province, other.province);
    }

    /**
     * Generates a hash code consistent with equals.
     * @return hash code for the city
     */
    @Override
    public int hashCode() {
        return Objects.hash(city, province);
    }
}
