package Tut02;

import java.util.ArrayList;
import java.util.List;

public class Tut02a_Map {

    private List <Tut02a_City> cities;

    public Tut02a_Map() {
        cities = new ArrayList<>();
    }

    public void addCity(Tut02a_City city) {
        cities.add(city);
    }

    public void printCityNames() {
        for (Tut02a_City city : cities) {
            city.printCityDetails();
        }
    }

    public static void main(String[] args) {
        Tut02a_Map worldMap = new Tut02a_Map();

        Tut02a_City newYork = new Tut02a_City("New York", 40.7128, -74.0060, 8804190);
        Tut02a_City paris = new Tut02a_City("Paris", 48.8566, 2.3522, 2140526);

        worldMap.addCity(newYork);
        worldMap.addCity(paris);

        worldMap.printCityNames();
    }
}



