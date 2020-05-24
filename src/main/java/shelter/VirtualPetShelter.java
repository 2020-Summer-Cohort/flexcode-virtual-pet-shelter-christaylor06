package shelter;

import java.util.Map;
import java.util.HashMap;

public class VirtualPetShelter {

    private Map<String, VirtualPet> allPets = new HashMap<String, VirtualPet>();

    public Map<String, VirtualPet> getInventory() {
        return allPets;
    }

    public void intakeNewPet(VirtualPet newArrival) {
        allPets.put(newArrival.getPetName(), newArrival);
    }
    public void adoptPet(String petName){
        allPets.remove(petName);
    }

    public void feedAllPets(){
        for(Map.Entry<String, VirtualPet> entry : allPets.entrySet()){
            VirtualPet feedPets = entry.getValue();
            feedPets.eat();
        }
    }
    public void waterForAllPets(){
        for(Map.Entry<String, VirtualPet> entry : allPets.entrySet()){
            VirtualPet waterPets = entry.getValue();
            waterPets.drink();
        }
    }
public void tickForAllPets(){
    for(Map.Entry<String, VirtualPet> entry : allPets.entrySet()){
        VirtualPet tick = entry.getValue();
        tick.timeTick();
    }
}
    public boolean contains(String petName) {
        return allPets.containsKey(petName);
    }

    public VirtualPet getPet(String petName) {
        return allPets.get(petName);
    }

}

