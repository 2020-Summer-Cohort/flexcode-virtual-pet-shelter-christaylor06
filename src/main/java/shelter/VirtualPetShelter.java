package shelter;

import java.util.Map;
import java.util.HashMap;

public class VirtualPetShelter {

    public VirtualPetShelter() {

    }
    private String newPetName;
    private VirtualPet newPetDescription;
    public VirtualPetShelter(String newPetName, VirtualPet newPetDescription) {
        this.newPetName = newPetName;
        this.newPetDescription = newPetDescription;
    }

    private Map<String, VirtualPet> allPets = new HashMap<String, VirtualPet>();



    public Map<String, VirtualPet> getInventory() {
        return allPets;
    }
//WILL FIELDS AND CONSTRUCTORS HELP HERE LIKE IN VP?
//need to add a new pet
//need to remove a pet
    public Map<String, VirtualPet> intakePet(){
        allPets.put(newPetName, newPetDescription);
        return allPets;
    }



    public VirtualPet getPetName(String petName) {
        return allPets.get(petName);
    }
    public void intakeNewPet(VirtualPet newPet){
        allPets.put(newPet.getPetName(), newPet);
    }
//    public void adoptPet(String petName){
//        VirtualPet.remove(petName);
//    }







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

    public boolean contains(String petName) {
        return allPets.containsKey(petName);
    }

    public VirtualPet getPet(String petName) {
        return allPets.get(petName);
    }
}

