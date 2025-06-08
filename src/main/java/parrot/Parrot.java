package parrot;

public class Parrot {

    private final ParrotTypeEnum type;
    private final int numberOfCoconuts;
    private final double voltage;
    private final boolean isNailed;
    private static final double BASE_SPEED = 12.0;
    private static final double MAX_NORWEGIAN_SPEED = 24.0;
    private static final double LOAD_FACTOR = 9.0;

    public Parrot(ParrotTypeEnum type, int numberOfCoconuts, double voltage, boolean isNailed) {
        this.type = type;
        this.numberOfCoconuts = numberOfCoconuts;
        this.voltage = voltage;
        this.isNailed = isNailed;
    }

    public double getSpeed() {
        return switch (type) {
            case EUROPEAN -> getEuropeanSpeed();
            case AFRICAN -> getAfricanSpeed();
            case NORWEGIAN_BLUE -> getNorwegianBlueSpeed();
            default -> throw new RuntimeException("Unknown parrot type");
        };
    }

    private double getEuropeanSpeed() {
        return BASE_SPEED;
    }

    private double getAfricanSpeed() {
        double loadPenalty = LOAD_FACTOR * numberOfCoconuts;
        double adjustedSpeed = BASE_SPEED - loadPenalty;
        return Math.max(0, adjustedSpeed);
    }

    private double getNorwegianBlueSpeed() {
        if (isNailed) return 0;

        double voltageAdjustedSpeed = voltage * BASE_SPEED;
        return Math.min(MAX_NORWEGIAN_SPEED, voltageAdjustedSpeed);
    }

    public String getCry() {
        return switch (type) {
            case EUROPEAN -> "Sqoork!";
            case AFRICAN -> "Sqaark!";
            case NORWEGIAN_BLUE -> voltage > 0 ? "Bzzzzzz" : "...";
        };
    }
}
