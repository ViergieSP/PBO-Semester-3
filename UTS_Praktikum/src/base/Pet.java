package base;

public abstract class Pet {
    private String name;
    private int age;
    protected int energy;
    private static final int MAX_ENERGY = 100;
    private static final int MIN_ENERGY = 0;

    public Pet(String name, int age) {
        this.name = name;
        this.age = age;
        this.energy = MAX_ENERGY;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public int getEnergy() {
        return energy;
    }
    
    protected void increaseEnergy(int amount) {
        this.energy += amount;
        if (this.energy > MAX_ENERGY) {
            this.energy = MAX_ENERGY;
            System.out.println("Energi " + getName() + " sudah penuh!");
        }
    }
    
    protected boolean decreaseEnergy(int amount) {
    	if (this.energy <= MIN_ENERGY) {
            System.out.println(getName() + " terlalu lelah untuk bermain...");
            return false;
        }

        this.energy -= amount;

        if (this.energy < MIN_ENERGY) {
            this.energy = MIN_ENERGY;
        }
        
        return true;
    }

    public void eat() {
        System.out.println(name + " sedang makan...");
        increaseEnergy(20);
        System.out.println("Energi " + name + " bertambah menjadi " + this.energy);
    }

    public void sleep() {
        System.out.println(name + " sedang tidur...");
        this.energy = 100;
        System.out.println("Energi " + name + " pulih sepenuhnya!");
    }

    public abstract void makeSound();

    public void displayInfo() {
        System.out.println("Nama: " + name + ", Umur: " + age + ", Energi: " + energy);
    }
}