package rikkei.academy;

import rikkei.academy.animal.Animal;
import rikkei.academy.animal.Chicken;
import rikkei.academy.animal.Tiger;
import rikkei.academy.edible.IEdible;
import rikkei.academy.fruit.Apple;
import rikkei.academy.fruit.Fruit;
import rikkei.academy.fruit.Orange;

public class Main {
    public static void main(String[] args) {
        // write your code here
        Animal[] animals = new Animal[2];
        animals[0] = new Tiger();
        animals[1] = new Chicken();
        for (Animal animal : animals) {
            System.out.println(animal.makeSound());

            if (animal instanceof Chicken) {
                IEdible edible = (Chicken) animal;
                System.out.println(edible.howToEat());
            }

        }
        Fruit[] fruits = new Fruit[2];
        fruits[0] = new Orange();
        fruits[1] = new Apple();
        for (Fruit fruit : fruits) {
            System.out.println(fruit.howToEat());
        }
    }
}
