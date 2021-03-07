package Task_2;

public abstract class Factory {
    public void playSound() {
        Animal instrument = this.create();
        instrument.playSound();
    }

    public abstract Animal create();

}
