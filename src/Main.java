package Java;

import java.util.Scanner;

import Java.Beasts.Camel;
import Java.Beasts.Donkey;
import Java.Pets.Cat;
import Java.Pets.Dog;

public class Main {
    public static void main(String[] args) {

        Farm<Animal> animalFarm = new Farm<>();

        animalFarm.adopt(new Cat(1009, "Филя", "2023-12-12", true));
        animalFarm.adopt(new Donkey(1019, "Муся", "2023-01-12", 12));
        animalFarm.adopt(new Camel(1091, "Степаша", "2023-07-15", 15));
        animalFarm.adopt(new Dog(1209, "Яша", "2023-07-15", false));

        try {
            while (true) {

                Menu.showMainMenu();
                try (
                        Scanner sc = new Scanner(System.in)) {
                    int i = sc.nextInt();
                    switch (i) {
                        case 1 -> Farm.printAnimals();
                        case 2 -> Menu.printOnlyThisClass(animalFarm);
                        case 3 -> Menu.Comands();
                        case 4 -> Menu.newComand();
                        case 5 -> Menu.newAnimal();
                    }
                }
            }
        } catch (Exception e) {
            System.out.println("Try one more time");
        }
    }

}