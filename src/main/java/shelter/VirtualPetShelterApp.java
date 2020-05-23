package shelter;

import java.util.Map;
import java.util.Map.Entry;
import java.util.Scanner;

public class VirtualPetShelterApp {
    public static void main(String[] args) {

        VirtualPetShelter misfitPetShelter = new VirtualPetShelter();
        VirtualPet pet1 = new VirtualPet("Josie", "A social calico kitten with a penchant for rock music");
        VirtualPet pet2 = new VirtualPet("Thomas", "Tuxedo adult male cat. Good companion. Bad mouser.");
        VirtualPet pet3 = new VirtualPet("Selina", "Adult female cat. A tad mischievous... but always with the best intentions.");
        VirtualPet pet4 = new VirtualPet("Salem", "Adult male cat. Black with magical green eyes.");
        VirtualPet pet5 = new VirtualPet("Bubbles", "A loving but very confused little bulldog.");

        misfitPetShelter.intakeNewPet(pet1);
        misfitPetShelter.intakeNewPet(pet2);
        misfitPetShelter.intakeNewPet(pet3);
        misfitPetShelter.intakeNewPet(pet4);
        misfitPetShelter.intakeNewPet(pet5);

        Scanner input = new Scanner(System.in);
        System.out.println("Thank you for volunteering at The Island of Misfit Pets.");
        System.out.println();
        System.out.println("Here's who is staying with us right now: ");
        showPetStatuses(misfitPetShelter);
        System.out.println();
        System.out.println("What would you like to do?");
        System.out.println();
        System.out.println("1. Feed the pets");
        System.out.println("2. Water the pets");
        System.out.println("3. Play with a pet");
        System.out.println("4. Adopt a pet");
        System.out.println("5. Admit a pet");
        System.out.println("6. Quit");
        String menuOption = input.nextLine();

        while (!menuOption.equals("6")) {
            if (menuOption.equals("1")) {
                misfitPetShelter.feedAllPets();
                System.out.println("You fed all of the pets.");
            } else if (menuOption.equals("2")) {
                misfitPetShelter.waterForAllPets();
                System.out.println("You gave all the pets water");
            } else if (menuOption.equals("3")) {
                System.out.println("You'd like to play with a pet. Here's who is available: ");
                System.out.println();
                showPetNames(misfitPetShelter);
                System.out.println();
                System.out.println("Enter the name of the pet that you would like to play with: ");
                String petName = input.nextLine();
                if (misfitPetShelter.contains(petName)) {
                    VirtualPet playtime = misfitPetShelter.getPet(petName);
                    playtime.plays();
                }
                System.out.println("You played with " + petName);
            } else if (menuOption.equals("4")) {
                System.out.println("Someone is looking to adopt a pet. Here's who is available: ");
                showPetNamesAndDescriptions(misfitPetShelter);
                System.out.println("Enter the name of the pet to be adopted: ");
                String petName = input.nextLine();
//                if (misfitPetShelter.contains(petName)) {
//                    VirtualPet adoptPet = misfitPetShelter.getPet(petName);
//                    adoptPet.remove(VirtualPet);
//                }
                System.out.println(petName + " was adopted");
            } else if (menuOption.equals("5")) {
                System.out.println("A new pet has arrived. Tells us the the pet's name:");
                String newPetName = input.nextLine();
                System.out.println("Provide a brief description of ths pet: ");
                String newPetDescription = input.nextLine();
                System.out.println("[pet name] has been admitted into the shelter");
            } else {
                System.out.println("Please enter a number between 1 and 6");
//            [NEED TICK HERE]
            }
            System.out.println("This is the status of your pets: ");
            showPetStatuses(misfitPetShelter);
            System.out.println();
            System.out.println("What would you like to do next");
            System.out.println();
            System.out.println("1. Feed the pets");
            System.out.println("2. Water the pets");
            System.out.println("3. Play with a pet");
            System.out.println("4. Adopt a pet");
            System.out.println("5. Admit a pet");
            System.out.println("6. Quit");
            menuOption = input.nextLine();
        }

        if (menuOption.equals("6")) {
            input.close();
        }
    }

    public static void showPetStatuses(VirtualPetShelter allPets) {
        System.out.println("Pet Name\t|Hunger\t|Thirst\t|Boredom");
        System.out.println("________\t|______\t|______\t|_______");
        Map<String, VirtualPet> shelter = allPets.getInventory();
        for (Map.Entry<String, VirtualPet> entry : shelter.entrySet()) {
            VirtualPet petVariable = entry.getValue();
            System.out.println(petVariable.getPetName() + "\t\t|" + petVariable.getHunger() + "\t\t|" + petVariable.getThirst() + "\t\t|" + petVariable.getBoredom());
        }
    }

    private static void showPetNamesAndDescriptions(VirtualPetShelter allPets) {
        Map<String, VirtualPet> shelter = allPets.getInventory();
        for (Map.Entry<String, VirtualPet> entry : shelter.entrySet()) {
            VirtualPet petVariable = entry.getValue();
            System.out.println(petVariable.getPetName() + ": " + petVariable.getPetDescription());
        }
    }

    private static void showPetNames(VirtualPetShelter allPets) {
        Map<String, VirtualPet> shelter = allPets.getInventory();
        for (Map.Entry<String, VirtualPet> entry : shelter.entrySet()) {
            VirtualPet petVariable = entry.getValue();
            System.out.println(petVariable.getPetName());
        }
    }


}
