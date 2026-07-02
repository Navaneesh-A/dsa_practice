class maxproduct1464 {
    public static int maxProduct(int[] nums) {
        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;

        return (min - 1) * (max - 1);
    }

    public static void main(String[] args) {
        System.out.println(maxProduct(new int[] {3,4,5,2})); // Output: 13
        System.out.println(maxProduct(new int[] {1,5,4,5})); // Output: 19
        System.out.println(maxProduct(new int[] {3,7})); // Output: 6
    }
}

}