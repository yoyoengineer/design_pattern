package strategy_pattern;

public class RubberDuck extends Duck implements QuackBehavior{

    @Override
    public void display() {
        //外观是橡皮鸭
    }

    @Override
    public void quack() {

    }
}