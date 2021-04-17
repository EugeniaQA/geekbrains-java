public class MainClass {
    public static void main(String[] args) {
        Cat cat = new Cat("Barsik", 100);
        Plate plate = new Plate(150);
        plate.info();
        cat.eat(plate);
        plate.info();
    }
}
