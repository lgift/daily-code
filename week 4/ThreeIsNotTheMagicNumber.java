public class ThreeIsNotTheMagicNumber {
    public static void main(String[] args) {
        // count up to 20 and loop until it hits 20
        for (int i = 0; i <= 20; i++) {
            // if the number is a multiple of 3, then ignore it and dont print it

            if (i % 3 == 0) {
            } else {
                System.out.println(i);
            }
        }

        System.out.println("freedom at last ..... im all done .. ...");
    }
}
