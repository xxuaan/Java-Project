package Tut02;

public class Tut02a_City {

    private String name;
    private double latitude, longitude;
    private int population;

    public Tut02a_City(String name, double latitude, double longitude, int population) {
        this.name = name;
        this.latitude = latitude;
        this.longitude = longitude;
        this.population = population;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getLatitude() {
        return latitude;
    }

    public void setLatitude(double latitude) {
        this.latitude = latitude;
    }

    public double getLongitude() {
        return longitude;
    }

    public void setLongitude(double longitude) {
        this.longitude = longitude;
    }

    public int getPopulation() {
        return population;
    }

    public void setPopulation(int population) {
        this.population = population;
    }

    public void printCityDetails(){
        Tut02a_City sg = new Tut02a_City("SG",3.342,42.242, 23765432);
        System.out.println("name: " + this.name);
        System.out.println("lati: " + this.latitude);
        System.out.println("longi: " + this.longitude);
        System.out.println("population: " + this.population);
    }
}
