public class Plate {
    private int food;
    public Plate(int food) {
        this.food = food;
    }
    public void decreaseFood(int n) {
        if (n > food) {
            n = food;
        }
        food -= n;
    }
    public void info() {
        System.out.println("plate: " + food);
    }
}
