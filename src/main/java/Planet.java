public abstract class Planet {
    private String planetName;

    public Planet(String planetName) { //constructor
        this.planetName = planetName;
    }

    public String getPlanetName() {
        return planetName;
    }

    public void setPlanetName(String planetName) {
        this.planetName = planetName;
    }
}
