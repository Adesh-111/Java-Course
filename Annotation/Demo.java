package Annotation;

// @Deprecated
class A{
    public void show(){
        System.out.println("In the show method of A");
    }
}

class B extends A{
    @Override
    public void show() {
        System.out.println("In the show method of B");
    }
}

public class Demo {
    public static void main(String[] args) {
        A a = new A();
        a.show();
    }
}
