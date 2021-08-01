package Task2;

public class Class implements CanFly {
    @Override
    public Double speed(CanFly fly) { return fly.speed() / 7;}
    @Override
    public Double speed (){return 8.6;}
}


