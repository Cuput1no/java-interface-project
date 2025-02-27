import java.util.Random;

public class FactoryProducer {
    private static final Random RANDOM = new Random();

    public static AbstractBirdFactory getFactory() {
        return RANDOM.nextBoolean() ? new PredatorBirdFactory() : new NonPredatorFactory();
    }
}
