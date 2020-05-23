package shelter;

import java.util.Random;

public class VirtualPet {


    //Fields (Properties for each Virtual Pet object)
    private String petName;
    private String petDescription;
    private int hungerMeter;
    private int thirstMeter;
    private int boredomMeter;

    //Constructors
    public VirtualPet(String petName, String petDescription) {
        this.petName = petName;
        this.petDescription = petDescription;
        this.hungerMeter = (int) getRandomIntegerBetweenRange(0,10);
        this.thirstMeter = (int) getRandomIntegerBetweenRange(0,10);
        this.boredomMeter = (int) getRandomIntegerBetweenRange(0,10);
    }


    public static double getRandomIntegerBetweenRange(double min, double max){
        double x = (int)(Math.random()*((max-min)+1))+min;
        return x;
    }

    public VirtualPet(String petName, String petDescription, int localHungerMeter, int localThirstMeter, int localBoredomMeter) {
        this.petName = petName;
        this.petDescription = petDescription;
        this.hungerMeter = localHungerMeter;
        this.thirstMeter = localThirstMeter;
        this.boredomMeter = localBoredomMeter;
    }

//    public static void remove(String petName) {
//    }

    //Methods
    public String getPetName() {
        return petName;
    }

    public String getPetDescription() {
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
        hungerMeter += 1;
    }

    public void drink() {
        thirstMeter += 1;
    }

    public void plays() {
        boredomMeter += 1;
    }
}
//        This page should create an arraylist for each new pet added
//          The name and description should come from user input
//          Hunger, thirst and boredom should be auto-generated
//        ArrayList = includes all of the descriptive info about the pet - name, description