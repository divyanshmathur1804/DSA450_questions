public class MaxMinArray {
    public static void solver(int[] arr){
        int min = arr[0];
        int max = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (arr[i]>max) {
                max = arr[i];
            }else if (arr[i] < min) {
                min = arr[i];
            }
        }
        
        System.out.println("Max: "+max+" Min: "+min);
    }
    public static void main(String[] args) {
        int[] arr = {0,-4,19,1,8,-2,-3,5};
        solver(arr);
    }
}
