package designPatterns.Behavioral.Strategy.strategyEx1;

public class Squeak implements QuackBehavior{
    @Override
    public void quack() {
        System.out.println("squeak");
    }
}
