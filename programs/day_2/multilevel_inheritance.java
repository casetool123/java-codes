package day_2;

class One { // parent class
    void disp1() {
        System.out.println("Class one");
    }
}

class Two extends One {
    void disp2() {
        System.out.println("Class Two");
    }
}

class Three extends Two {
    void disp3() {
        System.out.println("Class Three");
    }
}

class Four extends Three {
    void disp4() {
        System.out.println("Class Four");
    }
}

class Five extends Four {
    void disp5() {
        System.out.println("Class Five");
    }
}

public class multilevel_inheritance {
    public static void main(String[] args) {

        Five obj = new Five();
        obj.disp1();
        obj.disp2();
        obj.disp3();
        obj.disp5();
        obj.disp4();

        // Four obj1 = new Four();
        // obj1.disp1();
        // obj1.disp2();
        // obj1.disp3();
        // obj1.disp4();

    }
}
