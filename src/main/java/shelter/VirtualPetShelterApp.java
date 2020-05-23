package shelter;

import java.util.Scanner;

public class VirtualPetShelterApp {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Thank you for volunteering at Big Al's Pet Shelter and Salon");
        System.out.println();
        System.out.println("This is the status of your pets: ");
        System.out.println("<METHOD TO PULL STATUS HERE>");
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

        while (!menuOption.equals("6")){
        if (menuOption.equals("1")) {
            System.out.println("You fed all the pets.");
        } else if (menuOption.equals("2")) {
            System.out.println("You gave all the pets water");
        } else if (menuOption.equals("3")) {
            System.out.println("You'd like to play with a pet. Here's who is available: ");
            System.out.println("[NAMES AND DESCRIPTIONS HERE]");
            System.out.println("Which pet would you like to play with?");
            System.out.println("You played with [pet name]");
        } else if (menuOption.equals("4")) {
            System.out.println("Someone is looking to adopt a pet. Here's who is available: ");
            System.out.println("[NAMES AND DESCRIPTIONS HERE]");
            System.out.println("Which pet did they select?");
            System.out.println("[pet name] was adopted");
        } else if (menuOption.equals("5")) {
            System.out.println("A new pet has arrived. Tells us the the pet's name:");
            System.out.println("Provide a brief description of ths pet: ");
            System.out.println("[pet name] has been admitted into the shelter");
        } else {
            System.out.println("Please enter a number between 1 and 6");
//            [NEED TICK HERE]
        }
            System.out.println("This is the status of your pets: ");
            System.out.println("<METHOD TO PULL STATUS HERE>");
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

}
