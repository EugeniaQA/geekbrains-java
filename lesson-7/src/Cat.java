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
        int food = plate.getFood();
        if (food < appetite) {
            System.out.println("Cat " + this.name + " doesn't eat food. Food are not enough." );
            return;
        }

        int wasEaten = plate.decreaseFood(appetite);
        if (wasEaten == appetite) {
            this.isFullness = true;
        }
    }

    public void info() {
        System.out.println("Cat " + this.name + " is fullness = " + this.isFullness);
    }
}
