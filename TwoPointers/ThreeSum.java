package Java.Blind75.TwoPointers;
import java.util.*;
public class ThreeSum {

    public static List <List <Integer>> threeSum2 (int [] nums){
        Arrays.sort(nums);
        List <List <Integer>> result = new LinkedList<>();
        Set<List <Integer>> checkDup = new HashSet<>();

        for (int i = 0; i < nums.length - 2; i++){
            int j = i + 1;
            int k = nums.length - 1;
            while (j < k){
                int res = nums[i] + nums[j] + nums[k];
                if (res < 0){
                    j++;
                }
                
                else if (res > 0){
                    k--;
                }

                else{
                    checkDup.add(Arrays.asList(nums[i], nums[j], nums[k]));

                    while (j + 1 < k && nums[j] == nums[j + 1]) j++;
                    while (k - 1 > j && nums[k] == nums[k - 1]) k--;

                    j++;
                    k--;
                }
                
            }
        }
        result.addAll(checkDup);
        return result;
    }

    //brute force...
    public static List <List <Integer>> threeSum (int [] nums){
        Arrays.sort(nums);
    
        int first = 0, second = 1, last = 2;
        List <List <Integer>> result = new LinkedList<>();
        Set<List <Integer>> checkDup = new HashSet<>();

        while (first <= nums.length - 3){
            if (nums[first] + nums[second] + nums[last] == 0){
                List <Integer> tmp = Arrays.asList(nums[first], nums[second], nums[last]);
                checkDup.add(tmp);
            }
            last++;

            if (last > nums.length - 1){
                second++;
                last = second + 1;
            }
            if (second > nums.length - 2){
                first++;
                second = first + 1;
                last = second + 1;
            }
        }
        result.addAll(checkDup);
        return result;
    }
    public static void main(String[] args) {
        int[] nums = {-1,0,1,2,-1,-4};
        int[] nums2 = {0,0,0};
        System.out.println(threeSum2(nums));
        System.out.println(threeSum(nums2));
    }
}
