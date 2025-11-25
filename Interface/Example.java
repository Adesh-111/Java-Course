package Interface;

interface Computer {
    void code();
}

class Laptop implements Computer {
    public void code() {
        System.out.println("Code and compile");
    }
}

class Desktop implements Computer {
    public void code() {
        System.out.println("Code and compile but Faster");
    }
}

class Developer {
    public void develop(Computer c) {
        c.code();
        System.out.println("I am doing the coding part");
    }
}

public class Example {
    public static void main(String[] args) {
        Computer lap = new Laptop();
        Computer desk = new Desktop();
        Developer adesh = new Developer();
        adesh.develop(lap);
    }
}
