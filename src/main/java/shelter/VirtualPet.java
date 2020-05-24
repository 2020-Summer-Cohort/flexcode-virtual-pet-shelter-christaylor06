package shelter;

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
        if(hungerMeter < 1){
            return 0;
        }else if(hungerMeter > 10){
            return 10;
        }
        return hungerMeter -= 1;
    }

    public void drink() {
        thirstMeter -= 1;
    }

    public void plays() {
        boredomMeter -= 1;
        hungerMeter +=1;
        thirstMeter +=2;
    }
}
