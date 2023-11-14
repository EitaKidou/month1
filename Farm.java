public class Farm {
    private String adress;
    private int cows;
    private int horses;
    private  int sheeps;
    private String OwnerName;

    public Farm(String adress, int cows, int horses, int sheeps, String ownerName) {
        this.adress = adress;
        this.cows = cows;
        this.horses = horses;
        this.sheeps = sheeps;
        OwnerName = ownerName;
    }


    public String getAdress() {
        return adress;
    }

    public void setAdress(String adress) {
        this.adress = adress;
    }

    public int getCows() {
        return cows;
    }

    public void setCows(int cows) {
        this.cows = cows;
    }

    public int getHorses() {
        return horses;
    }

    public void setHorses(int horses) {
        this.horses = horses;
    }

    public int getSheeps() {
        return sheeps;
    }

    public void setSheeps(int sheeps) {
        this.sheeps = sheeps;
    }

    public String getOwnerName() {
        return OwnerName;
    }

    public void setOwnerName(String ownerName) {
        OwnerName = ownerName;
    }

    @Override
    public String toString() {
        return "Farm{" +
                "adress='" + adress + '\'' +
                ", cows=" + cows +
                ", horses=" + horses +
                ", sheeps=" + sheeps +
                ", OwnerName='" + OwnerName + '\'' +
                '}';
    }
}