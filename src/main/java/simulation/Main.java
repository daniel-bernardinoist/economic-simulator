package simulation;

import core.Country;

public class Main {
    public static void main(String[] args) {

        Country portugal = new Country(
            "Portugal",
            10_000_000,
            1_000_000,
            500
        );

        System.out.println(portugal.getName());
        System.out.println(portugal.getPopulation());
        System.out.println(portugal.getMoney());
        System.out.println(portugal.getWheat());
    }
}