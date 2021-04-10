/**
 * Кот
 */
public class Cat extends Animal {

    private String name;

    public Cat(String name) {
        super(0, 200);
        this.name = name;
    }

    @Override
    protected void internalRun(double meters) {
        System.out.println(name + " пробежал " + meters + " м.");
    }

    @Override
    protected void internalSwim(double meters) {
        System.out.println(name + " не умеет плавать.");
    }
}
