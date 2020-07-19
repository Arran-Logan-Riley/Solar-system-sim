public abstract class SpaceCraft {

    public SpaceCraft(String UID) {
        this.UID = UID;
    }

    private String UID;

    public String getUID() {
        return UID;
    }

    public void setUID(String UID) {
        this.UID = UID;
    }
}
