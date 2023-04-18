import java.util.Scanner;

public class App {
    private static Scanner input = new Scanner(System.in);
    public static void main(String[] args) throws Exception {
        gameLoop();
    }

    public static PetNeeds creationMenu () {        
        
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

        

        return pet;

    }

    public static void gameLoop () {
        int userSelection = -1; 
        int option = -1;
        PetNeeds pet = creationMenu();
        while(userSelection != 0){
            System.out.println(pet);
            System.out.print(
                "What would you like " + pet.getName() + " to do?" + "\n" +
                "1. Feed Pet" + "\n" +
                "2. Water Pet" + "\n" + 
                "0. Exit" + "\n" +
                "\nChoose: "
                );
            
            // option = Integer.parseInt(input.nextLine());
            option = input.nextInt();
            input.nextLine();
            switch (option) {
                case 1: pet.feedPet();
                        break;
                case 2: pet.drinkPet();
                        break;
                case 0: userSelection = 0;
                        break;
                default: break;
            }
            pet.tick();
        }
        input.close();
    }
}
