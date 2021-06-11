package day_2;

public class nested {
    static class MyNestedClass { // if you use a nested class then make the inner class static
        public void disp() {
            System.out.println("Hello");
        }
    }

    public static void main(String[] args) {
        nested.MyNestedClass obj = new nested.MyNestedClass();
        obj.disp();
    }

}
