package model;

import base.Pet;
import behavior.Interactable;

public class Cat extends Pet implements Interactable {

    public Cat(String name, int age) {
        super(name, age);
    }

    @Override
    public void makeSound() {
        System.out.println(getName() + " bersuara: Meow!");
    }

    public void eat(String treat) {
        System.out.println(getName() + " sedang makan ikan " + treat);
        increaseEnergy(40);
        System.out.println("Energi " + getName() + " bertambah menjadi " + this.energy);
    }

    @Override
    public void play() {
    	if (decreaseEnergy(10)) {
            System.out.println(getName() + " sedang bermain lempar tangkap!");
            System.out.println("Energi " + getName() + " sekarang: " + this.energy);
        }
    }
}