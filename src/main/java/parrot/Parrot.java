package parrot;

public class Parrot {

    private final ParrotTypeEnum type;
    private final int numberOfCoconuts;
    private final double voltage;
    private final boolean isNailed;
    private final double BASE_SPEED = 12.0;

    public Parrot(ParrotTypeEnum type, int numberOfCoconuts, double voltage, boolean isNailed) {
        this.type = type;
        this.numberOfCoconuts = numberOfCoconuts;
        this.voltage = voltage;
        this.isNailed = isNailed;
    }

    public double getSpeed() {
        return switch (type) {
            case EUROPEAN -> getEuropeanParrotSpeed();
            case AFRICAN -> getAfricanParrotSpeed();
            case NORWEGIAN_BLUE -> getNorwegianBlueParrotSpeed();
            default -> throw new RuntimeException("Unknown parrot type");
        };
    }

    private double getEuropeanParrotSpeed() {
        return this.BASE_SPEED;
    }

    private double getAfricanParrotSpeed() {
        return Math.max(0, this.BASE_SPEED - this.getloadPenalty());
    }

    private double getNorwegianBlueParrotSpeed() {
        if (isNailed) return 0;
        double MAX_SPEED = 24.0;
        return Math.min(MAX_SPEED, getVoltageAdjustedSpeed());
    }

    private double getloadPenalty() {
        double LOAD_FACTOR = 9.0;
        return LOAD_FACTOR * this.numberOfCoconuts;
    }

    private double getVoltageAdjustedSpeed() {
        return this.voltage * this.BASE_SPEED;
    }

    public String getCry() {
        return switch (type) {
            case EUROPEAN -> "Sqoork!";
            case AFRICAN -> "Sqaark!";
            case NORWEGIAN_BLUE -> voltage > 0 ? "Bzzzzzz" : "...";
        };
    }
}
