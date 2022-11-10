package Java.Blind75.ArraysHashing;

import java.util.*;

public class LongestConsecutiveString {
    public static int longestConsecutive (int [] nums){
        Arrays.sort(nums);
        int Maxcounter = 0;
        int counter = 0;
        if (nums.length == 0)
            return 0;

        for (int i = 1; i < nums.length; i++){
            if (nums[i] == nums[i - 1] + 1){
                counter++;
            }
            else if (nums[i] == nums[i - 1]){
                continue;
            }
            else {
                counter = 0;
            }
            
            
            if (Maxcounter < counter){
                Maxcounter = counter;
            }
        }
        return Maxcounter + 1;
    }
    public static void main(String[] args) {
        
    }
}
