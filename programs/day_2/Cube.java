package day_2;

public class Cube {
    int side;
    static int count = 0; // can change also

    Cube() {
        count++;
    }

    Cube(int x) {
        side = x;
        count++;
    }

    public static void main(String[] args) {
        Cube obj1 = new Cube(); // default constructor
        Cube obj2 = new Cube(5); // parameterised constructor
        Cube obj3 = new Cube(10); // def
        Cube obj4 = new Cube(); // para
        System.out.println(count);
    }
}
