package shelter;

import java.util.Map;
import java.util.HashMap;

public class VirtualPetShelter {

    private Map<String, VirtualPet> allPets = new HashMap<String, VirtualPet>();

    public Map<String, VirtualPet> getInventory() {
        return allPets;
    }

    public VirtualPet getPetName(String petName) {
        return allPets.get(petName);
    }
    public void intakeNewPet(VirtualPet newPet){
        allPets.put(newPet.getPetName(), newPet);
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
    public void playWithAPet(VirtualPet playtime){
        playtime.plays();
    }



}


//  For calling HashMaps for Virtual Pet
//        Use the Hashmap for the pets in the shelter
//        Each pet within that shelter is an arrayList from Virtual Pet
//
//        HashMap Key = petID
//        HashMap Value = pet name (which is also the pet’s ArrayList)

//        Map<String, Integer> mapNameHere = new HashMap<String, Integer>();
