import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        gameLoop();
    }

    public static PetNeeds birthMenu () {        
        Scanner input = new Scanner(System.in);
        System.out.println("Greetings, young one... welcome to the world. By what name shall your friends call you?");
        String petName = input.nextLine();

        System.out.println(
            "It's a pleasure to meet you, " + petName + "! I hope you will care for yourself during your time in this place...\n" +
            "\n" +
            "\n" +
            "\n" +
            "\n" +
            "\n" 
        );
    
        PetNeeds pet = new PetNeeds(petName);

        input.close();

        return pet;

    }

    public static void gameLoop () {
        int userSelection = -1; 

        while(userSelection != 0){
            PetNeeds pet = birthMenu();
            System.out.println(pet);
            // Scanner action = new Scanner(System.in);
            System.out.println(
                "What would you like " + pet.getName() + " to do?" + "\n" +
                "1. Feed Pet" + "\n" +
                "2. Water Pet" + "\n" + 
                "0. Exit" + "\n"
                );
                
            
            // switch (input) {
            //     case "1": pet.feedPet();
            //             break;
            //     case "2": pet.drinkPet();
            //             break;
            //     case "0": userSelection = 0;
            //             action.close();
            //             break;
            //     default: break;
            // }
            pet.tick();
        }
    }
}
