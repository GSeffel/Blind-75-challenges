package Java.Blind75.ArraysHashing;

import java.util.HashMap;

public class ContainsDuplicate {

    public static boolean containsDup(int[] nums){
        HashMap <Integer, Integer> hashmap = new HashMap<>();

        for (int values : nums){
            if (hashmap.containsKey(values)){
                return true;
            }
            hashmap.put(values, null);
        }
        return false;
    }
    public static void main(String[] args) {
        int [] nums = {1,1,1,3,3,4,3,2,4,2};
        int [] nums2 = {1,2,3,4};
        System.out.println(containsDup(nums));
        System.out.println(containsDup(nums2));
    }
}
