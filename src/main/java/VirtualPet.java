
public class VirtualPet {
	int hunger;
	int thirst;
	int waste;
	int boredom;
	int sickness;

	public VirtualPet(int hunger, int thirst, int waste, int boredom, int sickness) {
		this.hunger = hunger;
		this.thirst = thirst;
		this.waste = waste;
		this.boredom = boredom;
		this.sickness = sickness;
	}

	public VirtualPet() {
		this(25, 25, 25, 25, 25);
	}

	public int getHunger() {
		return hunger;

	}

	public void feedPet() {
		hunger = hunger - 25;
	}

	public int getThirst() {
		return thirst;
	}

	public void waterPet() {
		thirst = thirst - 20;
	}

	public int getWaste() {
		return waste;
	}

	public void letPetOut() {
		waste = waste - 15;
	}

	public int getBoredom() {
		return boredom;

	}

	public void playWithIt() {
		boredom = boredom - 15;
	}

	public int getSickness() {
		return sickness;

	}

	public void treatSickness() {
		sickness = sickness - 15;
	}

	public void tick() {
		sickness++;
		hunger++;
		waste++;
		thirst++;
		boredom++;

	}

	public String getStatus() {
		String status = "";
		status += "boredom: " + boredom;
		status += "\n";
		status += "thirst: " + thirst;
		status += "\n";
		status += "waste: " + waste;
		status += "\n";
		status += "sickness: " + sickness;
		status += "\n";
		status += "hunger: " + hunger;
		System.out.println(
				"What would you like to do next? Options are feed pet, water pet, let pet out, play with pet, treat sickness");
		return status;
	}

}