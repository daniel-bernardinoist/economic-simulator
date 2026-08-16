public class Country {
    private String name;
    private int population;
    private double money;
    private int wheat;

    // Constructor
    public Country(String name, int population, double money, int wheat) {
        this.name = name;
        this.population = population;
        this.money = money;
        this.wheat = wheat;
    }

    // Getters and Setters
    public String getName() {
        return name;
    }   

    public int getPopulation() {
        return population;
    }

    public double getMoney() {
        return money;
    }

    public int getWheat() {
        return wheat;
    }

    public void setName(String name) {
        this.name = name;
    }   

    public void setPopulation(int population) {
        this.population = population;
    }

    public void setMoney(double money) {
        this.money = money;
    }

    public void setWheat(int wheat) {
        this.wheat = wheat;
    }