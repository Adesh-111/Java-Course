import java.util.Arrays;

enum Status {
    Running, Failed, Pending, Success; //named constants
}

public class Demo {
    public static void main(String[] args) {
        Status s = Status.Running;
        System.out.println(s); // Running
        System.out.println(s.ordinal()); //0
        System.out.println(Arrays.toString(Status.values())); //print all the constants in Status
    }
}
