@FunctionalInterface
interface A{
    void show();
}
//Interface that have only one abstract method, Its also called sam

class B implements A{

    @Override
    public void show() {
        System.out.println("It is the show method");
    }
    
}

public class Demo {
    public static void main(String[] args) {
        A obj = new A() {
            public void show(){
                System.out.println("It is in the inner class of A ref");
            }
        };
        obj.show();
    }
}
