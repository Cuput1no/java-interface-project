import java.util.Random;

public class NonPredatorFactory extends AbstractBirdFactory {
    private static final NonPredatorBird[] BIRDS = NonPredatorBird.values();
    private static final Random RANDOM = new Random();

    @Override
    public Bird getBird()
    {
        Bird bird = null;

        switch (BIRDS[new Random().nextInt(BIRDS.length)])
        {
            case JAY:
                bird = new Jay();
                break;
            case WOODPECKER:
                bird = new Woodpecker();
                break;
            case CUCKOO:
                bird = new Cuckoo();
                break;

        }
        return bird;
    }
}
