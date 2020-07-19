public class ShuttleCraft extends SpaceCraft implements LandingCapiable{

    public ShuttleCraft(String UID, long maxCargo) {
        super(UID);
        this.maxCargo = maxCargo;
        this.currentCargo = 0;
    }

    public long maxCargo;
    public long currentCargo;

    public long getMaxCargo() {
        return maxCargo;
    }

    public void setMaxCargo(long maxCargo) {
        this.maxCargo = maxCargo;
    }

    public long getCurrentCargo() {
        return currentCargo;
    }

    @Override
    public int getNumberOfRequiredBays() {
    return(int) getMaxCargo()/100;
    }

    //canAccept cargo
    public void AddCargo(long cargo){
        if(acceptCargo(cargo) == true){ //if it dosnt work
            System.out.println("not enough space");
        }else{
            this.currentCargo =+ cargo;
        }
    }

    //accetCargo cargo
    public boolean acceptCargo(long cargo){
        if((currentCargo + cargo)  > maxCargo){
            return true;
        }else {
            return false;
        }
    }

}
