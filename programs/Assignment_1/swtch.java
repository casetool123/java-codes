package Assignment_1;

public class swtch {
    public static void main(String[] args) {
        // int
        // int x = 10;

        // switch (x) {
        // case 1:
        // System.out.println("The value of x is 1");
        // break;
        // case 2:
        // System.out.println("The value of x is 2");
        // break;
        // case 3:
        // System.out.println("The value of x is 3");
        // break;
        // default:
        // System.out.println("The value of x is other than 1,2,3");
        // break;

        // }

        // // char
        // char x = 'F';
        // switch (x) {
        // case 'a':
        // case 'A':
        // System.out.println("The value of x is a");
        // break;
        // case 'b':
        // case 'B':
        // System.out.println("The value of x is b");
        // break;
        // case 'c':
        // case 'C':
        // System.out.println("The value of x is c");
        // break;
        // default:
        // System.out.println("The value of x is other than a,b,c");
        // break;
        // }

        // string
        String name = "te";

        switch (name.toLowerCase()) {
            case "author":
                System.out.println("Vikas");
                break;
            case "team":
                System.out.println("Team Java Full Stack");
                break;
            case "editor":
                System.out.println("Vishnu & Krishna");
                break;
            default:
                System.out.println("Invalid entry");
                break;
        }

    }

}
