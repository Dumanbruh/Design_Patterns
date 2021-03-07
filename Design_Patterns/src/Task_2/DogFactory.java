package Task_2;

public class DogFactory extends Factory {
    public Animal create() {
        return new Dog();
    }
}
