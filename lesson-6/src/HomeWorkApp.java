import java.util.Arrays;
import java.util.Random;

public class HomeWorkApp {

    public static void main(String[] args)
    {
        Animal[] zoo = {
                new Cat("Барсик"),
                new Dog("Тузик"),
                new Cat("Борис"),
                new Dog("Шарик"),
                new Cat("Тарас"),
                new Dog("Рекс"),
                new Cat("Парамон")
        };

        callMoveFrom(zoo);
    }


    public static void callMoveFrom(Animal[] animals)
    {
        int catCount = 0;
        int dogCount = 0;
        for (Animal animal : animals)
        {
            animal.run(getRandomNumber(0, animal.getMaxRunMeters() * 2));
            animal.swim(getRandomNumber(0, animal.getMaxSwimMeters() * 2));

            if (animal instanceof Cat) {
                catCount++;
            }
            else if(animal instanceof Dog) {
                dogCount++;
            }
        }

        System.out.println("Всего кошек: " + catCount);
        System.out.println("Всего собак: " + dogCount);
        System.out.println("Всего животных: " + animals.length);
    }

    public static double getRandomNumber(double min, double max) {
        return ((Math.random() * (max - min)) + min);
    }
}

