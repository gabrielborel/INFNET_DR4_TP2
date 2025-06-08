package parrot;

public class EuropeanParrot extends Parrot {
    private static final double BASE_SPEED = 12.0;

    public EuropeanParrot() {
        super(null);
    }

    @Override
    public double calculateSpeed() {
        return BASE_SPEED;
    }

    @Override
    public String generateCry() {
        return "Sqoork!";
    }
}
