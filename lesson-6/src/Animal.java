/**
 * Животное
 */
public abstract class Animal {
    private double maxSwimMeters;
    private double maxRunMeters;

    protected Animal(double maxSwimMeters, double maxRunMeters) {
        this.maxSwimMeters = maxSwimMeters;
        this.maxRunMeters = maxRunMeters;
    }

    /**
     * Бег животного
     * @param meters
     */
    public final void run(double meters) {
        internalRun(Math.min(maxRunMeters, meters));
    }

    /**
     * Плавание животного
     * @param meters
     */
    public final void swim(double meters) {
        internalSwim(Math.min(maxSwimMeters, meters));
    }

    /**
     * Максимальная дистанция заплыва
     * @return
     */
    public final double getMaxSwimMeters() {
        return maxSwimMeters;
    }

    /**
     * Максимальная дистанция забега
     * @return
     */
    public final double getMaxRunMeters() {
        return maxRunMeters;
    }

    /**
     * Логика бега
     * @param meters
     */
    protected abstract void internalRun(double meters);

    /**
     * Логика плавания
     * @param meters
     */
    protected abstract void internalSwim(double meters);
}
