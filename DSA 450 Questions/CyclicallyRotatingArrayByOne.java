public class CyclicallyRotatingArrayByOne {
    public static void rotate(int[] nums) {
        int last = nums[nums.length - 1];
        for (int i = nums.length - 2; i >= 0; i--) {
            nums[i + 1] = nums[i];

        }
        nums[0] = last;
        for (int i = 0; i < nums.length; i++) {
            System.out.print(nums[i] + " ");
        }
    }

    public static void main(String[] args) {
        int[] arr = { 9, 8, 7, 6, 4, 2, 1, 3 };
        rotate(arr);

    }
}
