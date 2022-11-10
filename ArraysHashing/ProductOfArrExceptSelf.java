package Java.Blind75.ArraysHashing;

public class ProductOfArrExceptSelf {

    public static int[] productOfArrEXSelf (int[] nums){
        int [] arr = new int[nums.length];
        arr[0] = 1;
        for (int i = 1; i < nums.length; i++){
            arr[i] = nums[i - 1] * arr[i - 1];
        }
        int rightP = 1;
        for (int i = nums.length - 1; i >= 0; i--){
            arr[i] *= rightP;
            rightP *= nums[i];
        }
        return arr;
    }
    public static void main(String[] args) {
        int[]nums = {1,2,3,4};
        System.out.println(productOfArrEXSelf(nums));
        
    }
    
}
