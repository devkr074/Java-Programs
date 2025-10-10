public class Program_140 {
    public static void main(String[] args) {
        int[] nums = { 1, 2, 3, 2, 4, 5, 1 };
        for (int i = 0; i < nums.length; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                if (nums[i] == nums[j]) {
                    System.out.println("Duplicate: " + nums[i]);
                }
            }
        }
    }
}