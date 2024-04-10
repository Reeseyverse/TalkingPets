package io.zipcoder.polymorphism;

import java.util.ArrayList;
import java.util.Scanner;

public class MainApplication {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        ArrayList<Pet> pets = new ArrayList<>();

        //ask user for inout of pets
        System.out.println("How many pets do you have?");
        int numPets = scanner.nextInt();
        scanner.nextLine();

        // get pet name and types
        for(int i = 0; i < numPets; i++){
            System.out.println("Enter the type of pet: ");
            String petsTypes = scanner.nextLine().toLowerCase();

            System.out.println("Enter the name of pet: ");
            String petsNames = scanner.nextLine().toLowerCase();

            switch (petsTypes){
                case "dog":
                    pets.add(new Dog(petsNames));
                    break;
                case "cat":
                    pets.add(new Cat(petsNames));
                    break;
                case "wolf":
                    pets.add(new Wolf(petsNames));
                    break;
                default:
                    System.out.println("Not a pet type!");
            }
        }
        // pets and their sound
        System.out.println("\nYour pets: ");
        for (Pet pet : pets) {
            System.out.println(pet.getName() + ": ");
            pet.speak();
        }
    }
}