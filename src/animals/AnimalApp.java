package animals;

public class AnimalApp {
    public static void main(String[] args) {

        Cat cat1 = new Cat("Fluffy");
        Cat cat2 = new Cat("Spot");
        Fish fish1 = new Fish("Dot");
        Fish fish2 = new Fish("Nemo");
        Bird bird1 = new Bird("Squabby");
        Bird bird2 = new Bird("Peanut");
        Snake snake1 = new Snake("SSSsssmith");
        Snake snake2 = new Snake("Snek");

        printAnimal(cat1);
        printAnimal(cat2);
        printAnimal(fish1);
        printAnimal(fish2);
        printAnimal(bird1);
        printAnimal(bird2);
        printAnimal(snake1);
        printAnimal(snake2);


    }
    private static void printAnimal(Animal animal){
        System.out.println("This animal is named " + animal.getName());
        animal.move();
        animal.makeNoise();
        System.out.println();
    }
}
