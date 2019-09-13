package leetcode.easy.integerinversion;

/**
 * 给出一个 32 位的有符号整数，你需要将这个整数中每位上的数字进行反转。
 *
 * 示例 1:
 *
 * 输入: 123
 * 输出: 321
 *  示例 2:
 *
 * 输入: -123
 * 输出: -321
 * 示例 3:
 *
 * 输入: 120
 * 输出: 21
 * 注意:
 *
 * 假设我们的环境只能存储得下 32 位的有符号整数，则其数值范围为 [−231,  231 − 1]。请根据这个假设，如果反转后整数溢出那么就返回 0。
 *
 * 来源：力扣（LeetCode）
 * 链接：https://leetcode-cn.com/problems/reverse-integer
 * 著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
 */
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
