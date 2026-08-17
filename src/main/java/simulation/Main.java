package simulation;

import core.Country;

public class Main {
    public static void main(String[] args) {

        Country portugal = new Country(
            "Portugal",
            10_000_000,
            1_000_000,
            500_000_000
        );

        System.out.println(portugal.getName());
        System.out.println(portugal.getPopulation());
        System.out.println(portugal.getMoney());
        System.out.println(portugal.getWheat());

        Country spain = new Country(
            "Spain",
            47_000_000,
            2_000_000,
            400_000_000
        );

        System.out.println(spain.getName());
        System.out.println(spain.getPopulation());
        System.out.println(spain.getMoney());
        System.out.println(spain.getWheat());

        SimulationEngine engine = new SimulationEngine();
        engine.addCountry(portugal);
        engine.addCountry(spain);

        engine.run(10, true); // Run the simulation for 10 years with statistics enabled
    }
}