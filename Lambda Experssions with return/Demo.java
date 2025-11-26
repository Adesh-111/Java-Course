@FunctionalInterface
interface A {
    int add(int i, int j);
}

// Interface that have only one abstract method, Its also called sam
// lambda expressions only performed in the functional interface

public class Demo {
    public static void main(String[] args) {
        // A obj = () -> System.out.println("It is show in main");
        A obj = (i, j) ->  i+j;
        System.out.println(obj.add(5, 6) + " is the value");
    }
}
