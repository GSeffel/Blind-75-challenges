package Java.Blind75.SlidingWindow;

public class BestTimeToBuyAndSellStock {
    public static int bestTimeToBuyAndSell (int[] prices){
        int length = prices.length;
        for (int i = 0; i < length; i++){
            for (int j = i + 1; j < length; j++){
                int minVal = prices [i];
                int maxVal;
                if (minVal > prices[j]){
                    minVal = prices[j];
                }
                else{
                    maxVal = prices[j];
                }
            }
        }
        return 0;
    }
    public static void main(String[] args) {
        
    }
}
