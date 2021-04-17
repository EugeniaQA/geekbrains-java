public class Plate {
    private int food;
    public Plate(int food) {
        this.food = food;
    }
    public int decreaseFood(int n) {
        if (n > food) {
            n = food;
        }
        food -= n;

        return n;
    }
    public void info() {
        System.out.println("plate: " + food);
    }
    public int getFood() {
        return food;
    }
}
