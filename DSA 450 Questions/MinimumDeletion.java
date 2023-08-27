public class MinimumDeletion {
    public static int minimumDeletions(int[] nums) {
        int min = nums[0];
        int max = nums[0];
        for (int i = 1; i < nums.length; i++) {
            if (nums[i]>max) {
                max = i;
            }else if (nums[i] < min) {
                min = i;
            }
        }
        if(max <= nums.length/2 && min <= nums.length/2){
            return Math.max(max,min)+1;
        }else if(max >= nums.length/2 && min >= nums.length/2){
            return Math.max(max,min);
        }else if(max <= nums.length/2 && min >= nums.length/2){
            return max + (nums.length-min);
        }else if(max >= nums.length/2 && min <= nums.length/2){
            return min + (nums.length-max);
        }
        return -1;
    }
    public static void main(String[] args) {
        int[] arr =  {2,10,7,5,4,1,8,6};
        System.out.println(minimumDeletions(arr));
    }
}
