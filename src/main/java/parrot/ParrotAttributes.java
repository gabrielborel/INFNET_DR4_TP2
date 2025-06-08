package parrot;

public class ParrotAttributes {
    private final int numberOfCoconuts;
    private final double voltage;
    private final boolean isNailed;

    public ParrotAttributes(int numberOfCoconuts, double voltage, boolean isNailed) {
        this.numberOfCoconuts = numberOfCoconuts;
        this.voltage = voltage;
        this.isNailed = isNailed;
    }

    public int getNumberOfCoconuts() {
        return numberOfCoconuts;
    }

    public double getVoltage() {
        return voltage;
    }

    public boolean isNailed() {
        return isNailed;
    }
}