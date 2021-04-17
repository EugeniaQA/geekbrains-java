public class Cat {
    private String name;
    private int appetite;
    private boolean isFullness;
    public Cat(String name, int appetite) {
        this.name = name;
        this.appetite = appetite;
        this.isFullness = false;
    }
    public void eat(Plate plate) {
        int wasEaten = plate.decreaseFood(appetite);
        if (wasEaten == appetite) {
            this.isFullness = true;
        }

        System.out.println("Cat is fullness = " + this.isFullness);
    }
}
