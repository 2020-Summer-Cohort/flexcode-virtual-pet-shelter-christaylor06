package shelter;

import java.util.ArrayList;

public class VirtualPet {

    //Fields (Properties for each Virtual Pet object)
    private String petName;
    private String petDescription;
    private int hungerMeter;
    private int thirstMeter;
    private int boredomMeter;

    //Constructors
    public VirtualPet(String petName, String petDescription){
        this.petName = petName;
        this.petDescription = petDescription;
//        hunger = 5;
//        thirst = 5;
//        boredom = 5;
    }

    public VirtualPet(String petName, String petDescription, int localHungerMeter, int localThirstMeter, int localBoredomMeter) {
        this.petName = petName;
        this.petDescription = petDescription;
        this.hungerMeter = localHungerMeter;
        this.thirstMeter = localThirstMeter;
        this.boredomMeter = localBoredomMeter;
    }

    //Methods
    public String getPetName(){
        return petName;
    }
    public String getPetDescription(){
        return petDescription;
    }
    public int getHunger() {
        return hungerMeter;
    }

    public int getThirst() {
        return thirstMeter;
    }

    public int getBoredom() {
        return boredomMeter;
    }

    public void eat() {
        hungerMeter = 0;
    }
    public void drink() {
        thirstMeter = 0;
    }

    public void plays() {
        boredomMeter = 0;
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