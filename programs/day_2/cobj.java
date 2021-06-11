package day_2;

//classes and objects

class Car {
    private String doors; // data encaptulation using private keyword
    private String engine;
    private int speed;

    public void setSpeed(int speed) {
        this.speed = speed; // this keyword will avoid confusion for same variable in a program.
                            // this takes the immediate value
    }

    public int getSpeed() {
        return speed;
    }
}

public class cobj {
    public static void main(String[] args) {
        Car obj = new Car();
        obj.setSpeed(80);
        System.out.println(obj.getSpeed());
    }

}
