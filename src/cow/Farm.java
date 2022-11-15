package cow;

import java.util.Arrays;

public class Farm {
    private String address;
    private Cow[] cows;
    private Horse[] horses;
    private Sheep[] sheeps;
    private String ownerName;
    private Cow cow;
    private Horse horse;
    private Sheep sheep;

    public Farm(String address, Cow[] cows, Horse[] horses, Sheep[] sheeps, String ownerName) {
        this.address = address;
        this.cows = cows;
        this.horses = horses;
        this.sheeps = sheeps;
        this.ownerName = ownerName;
    }

    public Farm(String address, Cow cow, Horse horse, Sheep sheep,String ownerName) {
        this.address = address;
        this.cow = cow;
        this.horse = horse;
        this.sheep = sheep;
        this.ownerName = ownerName;
    }
}
