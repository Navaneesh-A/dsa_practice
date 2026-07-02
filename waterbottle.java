public class waterbottle {
    public static int numWaterBottles(int numBottles, int numExchange) {
        int total = numBottles;
        int s = total;
        while (numBottles >= numExchange) {
            s = s + (numBottles / numExchange);
            // System.out.println("filled " + s);
            numBottles = (numBottles / numExchange) + numBottles % numExchange;
            // System.out.println("emp: " + empty);

        }
        // System.out.println("brooo : " + s);

        return s;

    }

    public static void main(String[] args) {
        System.out.println(numWaterBottles(9, 3)); // Output: 13
        System.out.println(numWaterBottles(15, 4)); // Output: 19
        System.out.println(numWaterBottles(5, 5)); // Output: 6
    }
}
