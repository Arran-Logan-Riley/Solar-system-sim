import java.lang.reflect.Array;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        SolarSystem solarSystem = new SolarSystem(); //

        //initerlise the planets with names
         RockeyPlanet rockeyPlanetMercury = new RockeyPlanet("Mercury"); //1r
         RockeyPlanet rockeyPlanetVenus = new RockeyPlanet("Venus");  //2r
         RockeyPlanet rockeyPlanetEarth = new RockeyPlanet("Earth"); //3r
         RockeyPlanet rockeyPlanetMars = new RockeyPlanet("Mars");  //4r


         GasPlanet gasPlanetJupiter = new GasPlanet("Jupiter","hydrogen"); //1g
         GasPlanet gasPlanetNeptune = new GasPlanet("Neptune","hydrogen"); //2g
         GasPlanet gasPlanetUranus = new GasPlanet("Uranus","hydrogen");   //3g
         GasPlanet gasPlanetSaturn = new GasPlanet("Saturn","hydrogen");   //4g

        Probe probe1 = new Probe("a",true);
        Probe probe2 = new Probe("b", false);

        Fighter fighter1 = new Fighter("a","laser");
        Fighter fighter2 = new Fighter("b","laser");
        Fighter fighter3 = new Fighter("b","missile");

        ShuttleCraft shuttleCraft1 = new ShuttleCraft("a",300);
        ShuttleCraft shuttleCraft2 = new ShuttleCraft("ab",400);


        solarSystem.planetSet.addAll(Arrays.asList(rockeyPlanetMercury, rockeyPlanetVenus, rockeyPlanetEarth,rockeyPlanetMars,gasPlanetJupiter,gasPlanetNeptune,gasPlanetUranus,gasPlanetSaturn));
        //adding all the planet objects to the list


        //somehow add the new spacecraft

        //load 200 tons onto the biggest cargo
        shuttleCraft2.AddCargo(200);

        //load 100 tons then try toload 300 tons onto the smaller one
        shuttleCraft1.AddCargo(100);
        shuttleCraft1.AddCargo(200);

        rockeyPlanetMars.hoastASpacrCraft(fighter1);
        rockeyPlanetMars.hoastASpacrCraft(shuttleCraft1);
        rockeyPlanetMars.hoastASpacrCraft(shuttleCraft2);
        System.out.println(rockeyPlanetMars.getOccupiedBays()+" bays taken");

        rockeyPlanetMars.unhostSpaceCraft("ab");

    }
}
