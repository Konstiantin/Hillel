package Swets;

public class MainTotal {

    public static void main(String[] args) {

        Candies candies = new Candies(12);
        Chocolate chocolate = new Chocolate(2);
        Drops drops = new Drops (10);
        Caramel caramel = new Caramel (50);

        System.out.println (candies.getWeight()+ chocolate.getWeight()+ drops.getWeight()+ caramel.getWeight());
    }
}


