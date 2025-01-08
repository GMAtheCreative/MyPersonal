package duck;

public class Duck {
    private Flyable flys;
    private Quackable quacks;
    public Duck(Flyable flys, Quackable quacks) {
        this.flys = flys;

        this.quacks = quacks;
    }
    public void fly() {
        flys.fly();
    }
    public void quack() {
        quacks.quack();
    }
}
