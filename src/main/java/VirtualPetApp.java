import java.util.Scanner;

public class VirtualPetApp {

	public static void main(String[] args) {
		VirtualPet pet = new VirtualPet();
		Scanner input = new Scanner(System.in);
		System.out.println("Welcome I am your new virtual pet, Dino the dinosaur.");
		System.out.println("Here you will be able to interact with me.");
		System.out.println("Type \"Hello\" to get started and see how im feeling.");
		String command = input.nextLine();
		System.out.println(pet.getStatus());
		command = input.nextLine();
		while ((pet.boredom >= 10 || pet.hunger >= 10 || pet.sickness >= 10 || pet.thirst >= 10 || pet.waste >= 10)) {
			if (command.equalsIgnoreCase("Feed Pet")) {
				pet.feedPet();
				pet.tick();
				System.out.println(pet.getStatus());
				System.out.println("What would you like to do next?");
				command = input.nextLine();
			} else if (command.equalsIgnoreCase("Water Pet")) {
				pet.tick();
				pet.waterPet();
				System.out.println(pet.getStatus());
				command = input.nextLine();
			} else if (command.equalsIgnoreCase("let pet out")) {
				pet.letPetOut();
				pet.tick();
				System.out.println(pet.getStatus());

				command = input.nextLine();
			} else if (command.equalsIgnoreCase("play with pet")) {
				pet.playWithIt();
				pet.tick();
				System.out.println(pet.getStatus());
				command = input.nextLine();
			} else if (command.equalsIgnoreCase("treat Sickness")) {
				pet.treatSickness();
				pet.tick();
				System.out.println(pet.getStatus());
				command = input.nextLine();

			}
		}
		

	}

}