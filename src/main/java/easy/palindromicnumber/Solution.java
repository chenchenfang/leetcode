package easy.palindromicnumber;

public class Solution {
    public boolean isPalindrome(int x) {
        int ans=0;
        int start=x;
        if(x<0){
            return false;
        }
        while (x>0){
            int i = x % 10;
            ans=ans*10+i;
           x= x/10;
        }
        if(ans==start){
            return true;
        }else{
            return false;
        }
    }

    public static void main(String[] args) {
        Solution solution = new Solution();
        boolean palindrome = solution.isPalindrome(121);
        System.out.println(palindrome);
    }
}
