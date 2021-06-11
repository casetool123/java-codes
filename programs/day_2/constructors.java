package day_2;

class Car {
    private String doors; // data encaptulation using private keyword
    private String engine;
    private int speed;

    public Car() { // default constructor
        doors = "open";
        engine = "off";
    }

    public Car(int speed) { // parameterised constructor
        this.speed = speed;
    }

    public int getSpeed() {
        return speed;
    }
}

public class constructors {
    public static void main(String[] args) {
        Car obj = new Car(80);
        System.out.println(obj.getSpeed());
    }

}
