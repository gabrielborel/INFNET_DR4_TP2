package parrot;

public class AfricanParrot extends Parrot {
    private static final double BASE_SPEED = 12.0;
    private static final double LOAD_FACTOR = 9.0;

    public AfricanParrot(ParrotAttributes attributes) {
        super(attributes);
    }

    @Override
    public double calculateSpeed() {
        double loadPenalty = LOAD_FACTOR * attributes.getNumberOfCoconuts();
        return Math.max(0, BASE_SPEED - loadPenalty);
    }

    @Override
    public String generateCry() {
        return "Sqaark!";
    }
}
