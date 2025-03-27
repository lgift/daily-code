public class CoffeeOrder {
    String size;
    String type;
    private String orderID;
    static int totalOrders;

    CoffeeOrder() {
        this.size = "medium";
        this.type = "black";
        totalOrders++;
    }

    CoffeeOrder(String size) {
        this.size = size;
        this.type = "black";
        totalOrders++;
    }

    CoffeeOrder(String size, String type) {
        this.size = size;
        this.type = type;
        totalOrders++;
    }

    void describeOrder() {
        System.out.print("ORDER: \n");
        System.out.println("SIZE: " + size);
        System.out.println("TYPE: " + type);
        System.out.println();
    }

    static void getTotalOrders() {
        System.out.println("TOTAL COFFEE'S ORDERED: " + totalOrders);
    }
}
