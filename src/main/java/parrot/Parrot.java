package parrot;

public abstract class Parrot {
    protected final ParrotAttributes attributes;

    public Parrot(ParrotAttributes attributes) {
        this.attributes = attributes;
    }

    public abstract double calculateSpeed();
    public abstract String generateCry();
}
