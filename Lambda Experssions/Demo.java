@FunctionalInterface
interface A {
    void show(int i);
}

// Interface that have only one abstract method, Its also called sam
// lambda expressions only performed in the functional interface
class B implements A {

    @Override
    public void show(int i) {
        System.out.println("It is the show method");
    }

}

public class Demo {
    public static void main(String[] args) {
        // A obj = () -> System.out.println("It is show in main");
        A obj1 = (i) -> {
            System.out.println("value: " + i);
        };
        obj1.show(5);
    }
}
