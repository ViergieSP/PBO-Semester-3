package model;

import base.Pet;
import behavior.Interactable;

public class Dog extends Pet implements Interactable {

    public Dog(String name, int age) {
        super(name, age);
    }

    @Override
    public void makeSound() {
        System.out.println(getName() + " bersuara: Guk! Guk!");
    }

    public void eat(String treat) {
        System.out.println(getName() + " sedang makan cemilan favoritnya: " + treat);
        increaseEnergy(50);
        System.out.println("Energi " + getName() + " bertambah menjadi " + this.energy);
    }

    @Override
    public void play() {
        if (decreaseEnergy(15)) {
            System.out.println(getName() + " sedang bermain lempar tangkap!");
            System.out.println("Energi " + getName() + " sekarang: " + this.energy);
        }
    }
}