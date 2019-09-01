package easy.integerinversion;

public class IntegerInversion {
    public static void main(String[] args) {
        Solution solution = new Solution();
        System.out.println(solution.reverse(1534236469));
    }
}
class Solution {
    public int reverse(int x) {
        String s;
        int flag=1;
        if(x<0){
            s=Math.abs(x)+"";
            flag=-1;
        }else{
             s=x+"";
        }



        char[] chars = s.toCharArray();
        for (int i = 0; i < s.length()/2; i++) {
            char c = s.charAt(i);
            char c1 = s.charAt(s.length() - 1 - i);
            chars[i]=c1;
            chars[s.length() - 1 - i]=c;
        }
        String s1 = String.valueOf(chars);
        try {

            return Integer.valueOf(s1)*flag;
        } catch (Exception e) {
            return 0;
        }

    }
}
