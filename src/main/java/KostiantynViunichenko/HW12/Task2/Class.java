package KostiantynViunichenko.HW12.Task2;

public class Class implements Task2.CanFly {
    @Override
    public Double speed(Task2.CanFly fly) { return fly.speed() / 7;}
    @Override
    public Double speed (){return 8.6;}
}


