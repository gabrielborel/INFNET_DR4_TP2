package parrot;

public class ParrotFactory {

    public static Parrot create(ParrotTypeEnum type, ParrotAttributes attributes) {
        return switch (type) {
            case EUROPEAN -> new EuropeanParrot();
            case AFRICAN -> new AfricanParrot(attributes);
            case NORWEGIAN_BLUE -> new NorwegianBlueParrot(attributes);
        };
    }
}
