//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) throws InterruptedException{


        while(true) {
            AbstractBirdFactory factory = FactoryProducer.getFactory(); // Отримати випадкову фабрику
            Bird bird = factory.getBird(); // Отримати випадкового птаха
            bird.fly();

            Thread.sleep(2000);
        }
    }
}