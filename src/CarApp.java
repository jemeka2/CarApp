
public class CarApp {
    public static void main(String[] args){


        Car car1 = new Car();
        Car car2 = new Car();

        car1.setCar("Red Tesla");
        car1.setSpeed(90);

        car2.setCar("Blue Porsche");
        car2.setSpeed(50);

        print(car1.sentence());
        print(car2.sentence());

    }

    private static void print(String s) {
        System.out.println(s);
    }
}
