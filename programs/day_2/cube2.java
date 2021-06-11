package day_2;

public class cube2 {
    static int CalculateCube(int side) {
        return (side * side * side);
    }

    static { // static block
        System.out.println("Hello"); // can be used anywhere in a program
    }

    public static void main(String[] args) {
        System.out.println(cube2.CalculateCube(5));
    }
}
