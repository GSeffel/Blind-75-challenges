package Java.Blind75.ArraysHashing;

import java.util.*;




public class TopKFrequent {

    public static int [] topKFreq (int [] nums, int k){
        HashMap <Integer, Integer> hm = new HashMap<>();

        for (int values: nums){
            if (hm.containsKey(values)){
                hm.put(values, hm.get(values) + 1);
            }
            else{
                hm.put(values, 1);
            }
        }
        TreeMap<Integer, Integer> sorted = new TreeMap<>();
        sorted.putAll(hm);
        
        List <Map.Entry<Integer, Integer>> list = new LinkedList<>(sorted.entrySet());

        int[] dogSHitANwSER = new int [k];
        for (int i = 0; i < k; i++){
            dogSHitANwSER[i] = list.get(i).getKey();
        }
        
        return dogSHitANwSER;
        
        
       

 
        

    }
    public static void main(String[] args) {
        int [] nums = {4,1,-1,2,-1,2,3};
        int k = 2;

        System.out.println(topKFreq(nums, k).toString());
        
    }
    
}
