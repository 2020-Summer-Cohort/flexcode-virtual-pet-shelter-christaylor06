package shelter;

public class VirtualPet {


    //Fields (Properties for each Virtual Pet object)
    private final String petName;
    private final String petDescription;
    private int hungerMeter;
    private int thirstMeter;
    private int boredomMeter;

    //Constructors
    public VirtualPet(String petName, String petDescription) {
        this.petName = petName;
        this.petDescription = petDescription;
        this.hungerMeter = (int) getRandomStartingMeterLevelBetween2And8(2, 8);
        this.thirstMeter = (int) getRandomStartingMeterLevelBetween2And8(2,8);
        this.boredomMeter = (int) getRandomStartingMeterLevelBetween2And8(2,8);
    }


    public static double getRandomStartingMeterLevelBetween2And8(double min, double max){
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

    public int eat() {
        while (hungerMeter < 1){
            hungerMeter = 0;
        }
        while (hungerMeter > 10){
            hungerMeter = 10;
        }
        return hungerMeter -= 3;
    }

    public void drink() {
        while (thirstMeter < 1) {
            thirstMeter = 0;
        }
        while(thirstMeter > 10){
            thirstMeter = 10;
        }
        thirstMeter -= 3;
    }

    public void plays() {
        while (boredomMeter < 1) {
            boredomMeter = 0;
        }
        while(boredomMeter > 10){
            boredomMeter = 10;
        }
        boredomMeter -= 3;
        hungerMeter += 3;
        thirstMeter += 4;
    }
    public void timeTick(){
        boredomMeter += 1;
        hungerMeter +=1;
        thirstMeter +=1;
    }
}
