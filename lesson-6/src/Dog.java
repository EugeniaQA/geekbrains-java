/**
 * Собака
 */
public class Dog extends Animal {

    private String name;

    public Dog(String name) {
        super(10, 500);
        this.name = name;
    }

    @Override
    protected void internalRun(double meters) {
        System.out.println(name + " пробежал " + meters + " м.");
    }

    @Override
    protected void internalSwim(double meters) {
        System.out.println(name + " проплыл " + meters + " м.");
    }
}
