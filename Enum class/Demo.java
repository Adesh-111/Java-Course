enum Laptop {
    Macbook(2000), Lenova(1000), Dell, Tuf(1500); // named constants

    private int price;

    private Laptop() {
        this.price = 1400;
    }

    private Laptop(int price) {
        this.price = price;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }
}

public class Demo {
    public static void main(String[] args) {
        Laptop lap = Laptop.Macbook;
        System.out.println(lap.getPrice());

        for (Laptop l : Laptop.values()) {
            System.out.println(l + ": " + l.getPrice());
        }

        System.out.println(lap.getClass().getSuperclass()); // class : java.lang.Enum
    }
}

// enum class is not extends
