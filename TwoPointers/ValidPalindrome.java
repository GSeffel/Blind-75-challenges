package Java.Blind75.TwoPointers;

public class ValidPalindrome {
    public static boolean isPlaindrome (String s){
        s = s.replaceAll("[^a-zA-Z0-9]", "");
        s = s.toLowerCase();
        char [] arr = s.toCharArray();
        int first = 0;
        int last = arr.length - 1;
        

        while (first < last){
            if (arr[first] == (arr[last])){
                first++;
                last--;
            }
            else {
                return false;
            }
        }
        return true;
    }
    public static void main(String[] args) {
        String s = "A man, a plan, a canal: Panama";
        System.out.println(isPlaindrome(s));
    }
    }
