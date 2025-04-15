class Product{
    // protected allows this to be 
    protected String name;
    protected double price;
    private final int productId;
    public static int nextId = 1;

    // alows this constructor to be accessible EVERYWHERE!!!!!!!! BC YAY!!! I WANT TO REFERENCE IT ALWYAS! FROM ANYWHER!!!!!!
    public Product(String name, double price) {
        this.name = name;
        this.price = price;
        productId = nextId++;
    }

    /**
     * all these are public so that the getters can be ensured to be accessible in all classes for whenever it needs to be fetched
     * @return EVEYRHTING?????? this just auto appeared im keeping it cause im baller like that ya ayea yea ya ya yeah 😎😎😎😎😎😎😎
     */

    public String getName() {
        return name;
    }

    public double getPrice() {
        return price;
    }

    public int getProductId() {
        return productId;
    }

    @Override
    public String toString() {
        return ("Name: " + getName() + "\nPrice: " + getPrice() + "\nProduct ID: " + getProductId());
    }

    @Override
    public boolean equals(Object o) {
        if (this == o){
            return true;
        }

        if (o instanceof Product){
            return ((Product)o).equals(this.name) && ((Product)o).equals(this.productId);
            
        } else {
            return false;
        }
    }

}

class Electronics extends Product{
    private String brand;
    private boolean hasBattery;

    // alows this constructor to be accessible EVERYWHERE!!!!!!!! BC YAY!!! I WANT TO REFERENCE IT ALWYAS! FROM ANYWHER!!!!!!
    public Electronics(String name, double price, String brand, boolean hasBattery) {
        super(name, price);
        this.brand = brand;
        this.hasBattery = hasBattery;

    }

    @Override
    public String toString() {
        return ("Name: " + getName() + "\nPrice: " + getPrice() + "\nProduct ID: " + getProductId() + "\nBrand: " + brand + "\nHas Battery: " + hasBattery);
    }

    final void warrantyInfo() {
        System.out.println("hi you have no WARRANTY YOU WILL BE CURSED WIT BBROKEN IPHANE");
    }
}

class Grocery extends Product{
    private double weight;
    private boolean isPerishable;

    // alows this constructor to be accessible EVERYWHERE!!!!!!!! BC YAY!!! I WANT TO REFERENCE IT ALWYAS! FROM ANYWHER!!!!!!
    public Grocery(String name, double price, double weight, boolean isPerishable) {
        super(name, price);
        this.weight = weight;
        this.isPerishable = isPerishable;
    }

    @Override
    public String toString() {
        return ("Name: " + getName() + "\nPrice: " + getPrice() + "\nProduct ID: " + getProductId() + "\nWeight: " + weight + "\nPerishable: " + isPerishable);
    }
}

final class Toy extends Product{
    private int minAge;

    // alows this constructor to be accessible EVERYWHERE!!!!!!!! BC YAY!!! I WANT TO REFERENCE IT ALWYAS! FROM ANYWHER!!!!!!
    public Toy(String name, double price, int minAge) {
        super(name, price);
        this.minAge = minAge;
    }

    @Override
    public String toString() {
        return ("Name: " + getName() + "\nPrice: " + getPrice() + "\nProduct ID: " + getProductId() + "\nMinumum Age: " + minAge);
    }
}

public class SuperStoreTest{
    public static void main(String[] args) {
        Product electronic = new Electronics("ermm.... Iphane", 10000, "Abram's Alactronics", true);
        Product electronic2 = new Electronics("ermm.... Iphane", 10000, "Abram's Alactronics", true);
        Product grocery = new Grocery("EPIC VEGETABLE", 1, 1000, false);
        Product toy = new Toy("Roblox mini figure", 100, 3);

        Product[] balls = {electronic, grocery, toy};

        for (int i = 0; i < balls.length; i++) {
            System.out.println(balls[i]);
            System.out.println("\n");
        }

        System.out.println(electronic.equals(electronic2));

        System.out.println("ORIGINAL TOY PRICE: " + toy.price);
        System.out.println("DISCOUTNED TOY PRICE: " + (toy.price = Coupon.discountRate * toy.price));
    }
}

/**
 * 🚨🚨🚨ANNOUCNEMENT🚨🚨🚨
 * The reason that Toy cannot be extended is because it JUST CANT!!! Toy is a final method and once it's final then that's that there's no more that it can extend thats where its bloodline dies
 * so therefore toy just cannot be extended due to the final property
 */

// class ohmygah extends Toy{
//     :3    
// }

class Coupon{
    // static alloes this to be able to belong to the class and be able to be referenced in the main class :3 :3 :3 :3 :3
    final static double discountRate = 0.5;
}