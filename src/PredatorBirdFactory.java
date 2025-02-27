
import java.util.Random;

public class PredatorBirdFactory extends AbstractBirdFactory{
    private static final PredatorBird[] BIRDS = PredatorBird.values();
    private static final Random RANDOM = new Random();


    @Override
    public Bird getBird(){

        Bird bird = null;

        switch (BIRDS[new Random().nextInt(BIRDS.length)])
        {
            case EAGLE:
                bird = new Eagle();
                break;
            case HAWK:
                bird = new Hawk();
                break;
            case FALCON:
                bird = new Falcon();
                break;

        }
        return bird;

    }
}
