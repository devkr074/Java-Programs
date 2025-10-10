public class Program_135 {
    public static void main(String[] args) {
        int[] nums = { 12, 7, 25, 3, 18 };
        int largest = nums[0];
        for (int n : nums) {
            if (n > largest) {
                largest = n;
            }
        }
        System.out.println("Largest element: " + largest);
    }
}