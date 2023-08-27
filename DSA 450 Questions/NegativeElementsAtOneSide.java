// Merge Sort

import java.util.Arrays;

public class NegativeElementsAtOneSide{
    public static int[] MergeSort(int[] arr){
        if(arr.length == 1){
            return arr;
        }
        int[] left =  MergeSort(Arrays.copyOfRange(arr, 0, arr.length/2));
        int[] right = MergeSort(Arrays.copyOfRange(arr, arr.length/2, arr.length));

        return merge(left,right);



    }
    public static int[] merge(int[] left, int[] right){
        int[] ans = new int[left.length+right.length];
        int i =0;
        int j = 0;
        int k = 0;
        while (i<left.length && j< right.length) {
            if (left[i]<right[j]) {
                ans[k] = left[i];
                i++;
                k++;
            }else{
                ans[k] = right[j];
                j++;
                k++;
            }
        }
        while (i<left.length) {
            ans[k] = left[i];
            i++;
            k++;
        }
        while (j<right.length) {
            ans[k] = right[j];
            j++;
            k++;
        }
        return ans;
    }
    public static void main(String[] args) {
        int[] arr = {-12, 11, -13, -5, 6, -7, 5, -3, -6};
        int [] ans  = MergeSort(arr);
        for (int i = 0; i < ans.length; i++) {
            System.out.print(ans[i]+" " );
        }
        
    }
}