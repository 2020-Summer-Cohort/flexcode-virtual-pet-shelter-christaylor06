package shelter;

import java.util.List;
import java.util.Map;
import java.util.ArrayList;
import java.util.HashMap;

public class VirtualPetShelter {

    public static void main(String[] args) {
        Map<String, ArrayList<String>> pets = new HashMap<String, ArrayList<String>>();

        ArrayList<String> petDetails = new ArrayList<>();
        petDetails.add("Black cat with green eyes and a fluffy tail.");
        petDetails.add("Hunger Here");
        petDetails.add("Thirst Here");
        petDetails.add("Boredom Here");

        pets.put("Tommy", petDetails);
    }

    ArrayList<VirtualPet> newPets = new ArrayList<>();
    public void intakePet(VirtualPet virtualPet) {
        newPets.add(virtualPet);
    }

    public int getInventoryCount() {
        int pets = 0;
        for(VirtualPet );
    }

    public void adoptPet(String tester2) {
    }
}



//  For calling HashMaps for Virtual Pet
//        Use the Hashmap for the pets in the shelter
//        Each pet within that shelter is an arrayList from Virtual Pet
//
//        HashMap Key = petID
//        HashMap Value = pet name (which is also the pet’s ArrayList)

//        Map<String, Integer> mapNameHere = new HashMap<String, Integer>();
