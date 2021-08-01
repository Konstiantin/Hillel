package Task1;

import Task2.CanMove;

public class Platypus extends Mammal implements CanEat,CanSwim {
    public Platypus() { super(); }

    @Override
    public boolean equals(Object o) { return super.equals(o); }

    @Override
    public int hashCode() { return super.hashCode(); }

    @Override
    public String toString() { return "Platypus{}"; }

    @Override
    public void canEat() { System.out.println("I can eat bugs!!"); }

    @Override
    public void canSwim() { System.out.println("I can eat Swim!! "); }
}
