package shelter;

import java.util.ArrayList;

public class VirtualPet {

    //Fields (Properties for each Virtual Pet object)
    private int hungerMeter;
    private int thirstMeter;
    private int boredomMeter;

    //Constructors
    public VirtualPet(String petDescription, int localHungerMeter, int localThirstMeter, int localBoredomMeter) {
        this.hungerMeter = localHungerMeter;
        this.thirstMeter = localThirstMeter;
        this.boredomMeter = localBoredomMeter;
    }

    //Methods
    public int getHunger() {
        return hungerMeter;
    }

    public int getThirst() {
        return thirstMeter;
    }

    public int getBoredom() {
        return boredomMeter;
    }


//    ArrayList<String> newPetInputs = new ArrayList<String>();
//    while(in.hasPetDescription()){
//        newPetInputs.add.petDescription());
//    }
}
//        This page should create an arraylist for each new pet added
//          The name and description should come from user input
//          Hunger, thirst and boredom should be auto-generated
//        ArrayList = includes all of the descriptive info about the pet - name, description