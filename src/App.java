import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner input = new Scanner(System.in);
        System.out.println("Greetings, young one... welcome to the world. By what name shall your friends call you?");
        String petName = input.nextLine();

        PetNeeds pet = new PetNeeds(petName);
        
        birthMenu(pet);
        input.close();
    }

    public static void birthMenu (PetNeeds newPet) {
        System.out.println(
            "It's a pleasure to meet you, " + newPet.getName() + "! I hope you will care for yourself during your time in this place...\n" +
            "\n" +
            "\n" +
            "\n" +
            "\n" +
            "\n" 
        );
    }

    public static void gameLoop (PetNeeds newPet) {
        int userSelection = -1; 
        Scanner input2 = new Scanner(System.in);

        while (userSelection != 0) {
            System.out.println(
                "What would you like to do?" +
                "1. Feed Pet" +
                "2. Water Pet" +
                "0. Exit"
                );

            userSelection = input2.nextInt();
            switch (userSelection) {
                case 1: newPet.feedPet();
                        break;
                case 2: newPet.drinkPet();
                        break;
                case 0: userSelection = 0;
                        input2.close();
                        break;
                default: break;
            }
            newPet.tick();
        }
    }
}
