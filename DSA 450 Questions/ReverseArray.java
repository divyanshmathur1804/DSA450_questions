class Solution {
    public void reverseString(char[] s) {
      char swap;
      int i = 0;
        int j =s.length-1;
        while(j>i){
            swap = s[j];
            s[j] = s[i];
            s[i] = swap;
            i++;
            j--;
        }
        
    }
}