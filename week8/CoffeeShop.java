public class CoffeeShop {

    public static void main(String[] args) {
        CoffeeOrder coffee1 = new CoffeeOrder();
        CoffeeOrder coffee2 = new CoffeeOrder("SUPER SUPER SUPER SUPER MEGA BIG COFFEEWSA SOOOOO LARGE MEOW MEOW");
        CoffeeOrder coffee3 = new CoffeeOrder("stupid stupid tiny size", "#epic type");

        coffee1.describeOrder();
        coffee2.describeOrder();
        coffee3.describeOrder();

        CoffeeOrder.getTotalOrders();
    }
}
