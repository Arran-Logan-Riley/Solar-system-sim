public class Probe extends SpaceCraft{

    public Probe(String UID, boolean active) {
        super(UID);
        this.active = active;
    }

    private boolean active;

    public boolean isActive() {
        return active;
    }

    public void setActive(boolean active) {
        this.active = active;
    }
}
