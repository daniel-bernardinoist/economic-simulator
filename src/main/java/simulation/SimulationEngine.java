package simulation;

import java.util.ArrayList;
import java.util.List;

import core.Country;

public class SimulationEngine {

    private int year;
    private List<Country> countries;
    
    // Constructor
    public SimulationEngine() {
        this.year = 0;
        this.countries = new ArrayList<>();
    }

    public void addCountry(Country country) {
        countries.add(country);
    }

    public void advanceYear() {
        for (Country country : countries) {
            //consumeWheat(country);

            int population = country.getPopulation();
            int wheat = country.getWheat();
            int shortage = population - wheat;
            
            if (shortage > 0) {

                System.out.println(country.getName() + " has insufficient wheat for its population.");
                
                //Reduce population and wheat based on the shortage
                country.setPopulation((int) Math.round(population * (1 - (shortage / (double) population) * 0.01)));
                country.setWheat(0);

            } else {
                country.setWheat(wheat - population);
                country.setPopulation((int) Math.round(population * 1.01)); // Increase population by 1% due to growth
            }
        }
        year++;
    }

    public void printStatistics() {
        for (Country country : countries) {
            System.out.println("Country: " + country.getName());
            System.out.println("Population: " + country.getPopulation());
            System.out.println("Money: " + country.getMoney());
            System.out.println("Wheat: " + country.getWheat());
            System.out.println("---------------------------");
        }
    }
    
    public void run(int years) {
        run(years, false);
    }

    public void run(int years, boolean statsEnabled) {

        if (statsEnabled) {
            System.out.println("Year: " + year);
            printStatistics();
        }

        for (int i = 0; i < years; i++) {
            System.out.println("\n--- Advancing to Year " + (year + 1) + " ---");

            advanceYear();

            if (statsEnabled) {
                System.out.println("Year: " + year);
                printStatistics();
            }
        }
    }
}