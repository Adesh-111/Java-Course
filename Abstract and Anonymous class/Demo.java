abstract class A {
    public abstract void show();
}

public class Demo {
    public static void main(String args[]) {
        A obj = new A() {
            public void show() {
                System.out.println("I am in show method");
            }
        };
        obj.show();
    }

}
