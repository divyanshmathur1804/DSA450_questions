import java.util.ArrayList;
import java.util.List;

public class UninonAndIntersectionOfArray {
    public static void union(int[] arr, int[] arr2) {
        List<Integer> ans = new ArrayList<>();
        int i = 0;
        int j = 0;
        while (i < arr.length && j < arr2.length) {
            if (arr[i] < arr2[j]) {
                ans.add(arr[i]);
                i++;
            } else if (arr[i] > arr2[j]) {
                ans.add(arr2[j]);
                j++;
            } else if (arr[i] == arr2[j]) {
                ans.add(arr[i]);
                i++;
                j++;
            }
        }
        while (i < arr.length) {
            ans.add(arr[i]);
            i++;
        }
        while (j < arr2.length) {
            ans.add(arr[j]);
            j++;
        }
        for (int k = 0; k < ans.size(); k++) {
            System.out.print(ans.get(k) + " ");
        }
    }

    public static void main(String[] args) {
        int[] arr = { 85, 25, 1, 32, 54, 6 };
        int[] arr2 = { 85, 2 };
        union(arr, arr2);

    }
}
