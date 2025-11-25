class A {
    int age;
    int no;

    public void show() {
        System.out.println("I am in show method in class A");
    }
}

class Demo {
    public static void main(String[] args) {
        A obj = new A() {
            public void show() {
                System.out.println("I am in show method in anonymous inner class");
            }
        };
        obj.show();
    }
}
