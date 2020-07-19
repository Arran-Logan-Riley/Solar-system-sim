public class Fighter extends SpaceCraft implements LandingCapiable{

    public Fighter(String UID, String weapon) {
        super(UID);
        this.weapon = weapon;
    }

    private String weapon;

    public String getWeapon() {
        return weapon;
    }

    public void setWeapon(String weapon) {
        this.weapon = weapon;
    }



    @Override
    public int getNumberOfRequiredBays() {
        return 1;
    }
}
