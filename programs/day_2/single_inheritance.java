package day_2;

class One {
    void disp1() {
        System.out.println("Class one");
    }
}

class Two extends One {
    void disp2() {
        System.out.println("Class Two");
    }
}

public class single_inheritance {
    public static void main(String[] args) {
        Two obj = new Two();
        obj.disp1();
        obj.disp2();
    }

}
