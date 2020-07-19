import java.util.HashSet;
import java.util.Set;

public class RockeyPlanet extends Planet {
    Set<LandingCapiable> landedSpaceCraft = new HashSet<>(); //set the has set\

    public RockeyPlanet(String planetName, Set<LandingCapiable> landedSpaceCraft) {
        super(planetName);
        this.landedSpaceCraft = landedSpaceCraft;
    }

    public int occupiedBays;

    public RockeyPlanet(String planetName, int occupiedBays) {
        super(planetName);
        this.occupiedBays = occupiedBays;
    }

    public RockeyPlanet(String planetName) {
        super(planetName);
    }

    //host
    public void hoastASpacrCraft(SpaceCraft spaceCraft){ //push it to a set
        if(spaceCraft instanceof Fighter){
            setOccupiedBays(getOccupiedBays()-1);
            landedSpaceCraft.add((LandingCapiable) spaceCraft);
        }else if(spaceCraft instanceof ShuttleCraft){
            setOccupiedBays(getOccupiedBays()-((ShuttleCraft) spaceCraft).getNumberOfRequiredBays());
        }

    }


    //unhoast
    public void unhostSpaceCraft(String uid){
        //foreach to detect which spacecraft to unhoats
        for (LandingCapiable temp: landedSpaceCraft ) {
            if(temp instanceof SpaceCraft){
                if(((SpaceCraft) temp).getUID().equals(uid)){
                    this.occupiedBays -= temp.getNumberOfRequiredBays();
                    this.landedSpaceCraft.remove(temp);
                    return;
                }
            }



                //identify the space craft that i want to unhoast
        }
    }


    //getOccupiedBays
    public int getOccupiedBays() {
        return occupiedBays;
    }

    public void setOccupiedBays(int occupiedBays) {
        this.occupiedBays = occupiedBays;
    }
}
