public class PetNeeds {
    private String petName;
    private int hunger;
    private int thirst;
    private int lonliness;
    private int bladder;
    private int exhaustion;
    private int dirtiness;

    public PetNeeds(String newPetName) {
        petName = newPetName;
        hunger = 1;
        thirst = 1;
        lonliness = 1;
        bladder = 1;
        exhaustion = 1;
        dirtiness = 1;
    }
    
    public void feedPet() {
        this.hunger = 0;
    }


    public void drinkPet() {
        this.thirst = 0;
    }
    
    // Simulate the passage of time by degrading the pet's stats
    public void tick() {
        hunger += 1;
        thirst += 1;
        lonliness += 1;
        bladder += 1;
        exhaustion += 1;
        dirtiness += 1;
    }

    // Increment Stats
    public void changeHunger(int newHunger) {
        hunger += newHunger;
    }

    public void changeThirst(int newThirst) {
        thirst += newThirst;
    }

    public void changeLonliness(int newLonliness) {
        thirst += newLonliness;
    }

    public void changeExhaustion(int newExhaustion) {
        thirst += newExhaustion;
    }

    public void changeDirtiness(int newDirtiness) {
        dirtiness += newDirtiness;
    }

    // Setters
    public void setName(String newName) {
        this.petName = newName;
    }

    public void setHunger(int newHunger){
        this.hunger = newHunger;
    }

    public void setThirst(int newThirst) {
        this.thirst = newThirst;
    }

    public void setLonliness(int newLonliness) {
        this.lonliness = newLonliness;
    }

    public void setBladder(int newBladder) {
        this.bladder = newBladder;
    }

    public void setExhaustion(int newExhaustion) {
        this.exhaustion = newExhaustion;
    }

    public void setDirtiness(int newDirtiness) {
        this.dirtiness = newDirtiness;
    }

    // Getters
    public String getName() {
        return petName;
    }

    public int getHunger() {
        return hunger;
    }

    public int getThirst() {
        return thirst;
    }

    public int getLonliness() {
        return lonliness;
    }

    public int getBladder() {
        return bladder;
    }

    public int getExhaustion() {
        return exhaustion;
    }

    public int getDirtiness() {
        return dirtiness;
    }
}
