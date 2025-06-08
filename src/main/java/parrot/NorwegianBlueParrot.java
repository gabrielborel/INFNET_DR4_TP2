package parrot;

public class NorwegianBlueParrot extends Parrot {
    private static final double BASE_SPEED = 12.0;
    private static final double MAX_SPEED = 24.0;

    public NorwegianBlueParrot(ParrotAttributes attributes) {
        super(attributes);
    }

    @Override
    public double calculateSpeed() {
        if (attributes.isNailed()) return 0;
        return Math.min(MAX_SPEED, attributes.getVoltage() * BASE_SPEED);
    }

    @Override
    public String generateCry() {
        return attributes.getVoltage() > 0 ? "Bzzzzzz" : "...";
    }
}
