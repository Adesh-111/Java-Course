package Interface;

interface A {
    int area = 10; // all the variables are final and static so we have to define it 
    void show();
    void run();
}

interface C {
    void config();
}

interface D extends C{
    void see();
}

class B implements A,D{
    public void show(){
        System.out.println("I am showing");
    }
    public void run(){
        System.out.println("I am running");
    }
    public void config(){
        System.out.println("I am Config");
    }
    public void see(){
        System.out.println("I am seeing");
    }
}

public class Demo {
    public static void main(String[] args) {
        B obj = new B();
        A obj1 = new B();
        obj.show();
        obj1.run();
        obj.see();
        System.out.println(A.area);
    }
}
