package ru.shashy.restfulbegin;

public class Country {

    private String name;
    private int population;

    public static Country createContry(String name, int population){
        Country country = new Country();
        country.setName(name);
        country.setPopulation(population);
        return country;
    }

    public void setPopulation(int population) {
        this.population = population;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getPopulation() {
        return population;
    }

    public String getName() {
        return name;
    }
}
