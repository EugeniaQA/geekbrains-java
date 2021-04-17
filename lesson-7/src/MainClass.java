public class MainClass {
    public static void main(String[] args) {
        Cat[] cats = new Cat[] {
                new Cat("Barsik", 100),
                new Cat("Musya", 50),
                new Cat("Vasya", 150),
                new Cat("Murzik", 80),
                new Cat("Felix", 20),
            };

        Plate commonPlate = new Plate(340);
        commonPlate.info();
        for (int i = 0; i < cats.length; i++) {
            cats[i].eat(commonPlate);
            cats[i].info();
            commonPlate.info();
        }
    }
}
