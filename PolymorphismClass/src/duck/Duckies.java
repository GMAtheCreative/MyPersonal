package duck;

public class Duckies {
    public static void main(String[] args) {
        Duck myDuck = new Duck(new IllasaFly(),new IllasaQuack());
        myDuck.fly();
        myDuck.quack();
    }
}
