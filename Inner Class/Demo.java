class A {
    int age;
    int no;

    public void show() {
        System.out.println("I am in show method");
    }

    class B {
        public void innerShow() {
            System.out.println("I am in inner show method");
        }
    }
}

class Demo{
    public static void main(String[] args) {
        A obj = new A();
        obj.show();
        A.B obj1 = obj.new B();
        obj1.innerShow();
    }
}
