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

class Three extends One {
    void disp3() {
        System.out.println("Class Three");
    }
}

class Four extends One {
    void disp4() {
        System.out.println("Class Four");
    }
}

class Five extends One {
    void disp5() {
        System.out.println("Class Five");
    }
}

public class heirarchical_inheritance {
    public static void main(String[] args) {
        Two obj = new Two();
        obj.disp1();
        obj.disp2();

        Five obj1 = new Five();
        obj1.disp1();
        obj1.disp5();

        Four obj2 = new Four();
        obj2.disp1();
        obj2.disp4();
    }
}
