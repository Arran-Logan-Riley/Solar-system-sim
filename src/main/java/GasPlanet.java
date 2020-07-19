public class GasPlanet extends Planet {
    public String mainGasName;

    public GasPlanet(String planetName, String mainGasName) {
        super(planetName);
        this.mainGasName = mainGasName;
    }

    public GasPlanet(String planetName) {
        super(planetName);
    }

    public String getMainGasName() {
        return mainGasName;
    }

    public void setMainGasName(String mainGasName) {
        this.mainGasName = mainGasName;
    }
}
