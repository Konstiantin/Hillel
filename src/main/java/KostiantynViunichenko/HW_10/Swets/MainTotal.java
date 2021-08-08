package Swets;

public class MainTotal {

<<<<<<< HEAD
=======

>>>>>>> 3719f12 (Hillel_HW)
    public static void main(String[] args) {

        Candies chocolate1 = new Chocolate(120);
        Candies chocolate2 = new Chocolate(555);

        Candies drops1 = new Drops(111);
        Candies drops2 = new Drops(1028);

        Candies caramel1 = new Caramel(777);
        Candies caramel2 = new Caramel(999);

        Candies[] array = new Candies[Candies.arrayLength];
        array[0] = chocolate1;
        array[1] = chocolate2;
        array[2] = drops1;
        array[3] = drops2;
        array[4] = caramel1;
        array[5] = caramel2;

        for (Candies item : array) {
            System.out.print(item+" ");
            System.out.println(item.getWeight());
        }
<<<<<<< HEAD

    public static void main(String[] args) {

        Candies candies = new Candies(12);
        Chocolate chocolate = new Chocolate(2);
        Drops drops = new Drops (10);
        Caramel caramel = new Caramel (50);

        System.out.println (candies.getWeight()+ chocolate.getWeight()+ drops.getWeight()+ caramel.getWeight());

    }
}
=======
    }
}



>>>>>>> 3719f12 (Hillel_HW)
