package leetcode.medium.longestpalindromicsubstring;


/**
 * 给定一个字符串 s，找到 s 中最长的回文子串。你可以假设 s 的最大长度为 1000。
 *
 * 示例 1：
 *
 * 输入: "babad"
 * 输出: "bab"
 * 注意: "aba" 也是一个有效答案。
 * 示例 2：
 *
 * 输入: "cbbd"
 * 输出: "bb"
 *
 * 来源：力扣（LeetCode）
 * 链接：https://leetcode-cn.com/problems/longest-palindromic-substring
 * 著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
 */
public class Solution {
    public String longestPalindrome(String s) {
        if(s.length()==0){
            return "";
        }
        String outS="";
        int i=0;
        int j=1;
        while (i<=s.length()){
            String substring = s.substring(i, j);
            if(isPalindrome(substring)&&substring.length()>outS.length()){
                outS=substring;
                j++;
            }else{
                i++;
            }

        }
        return outS;
    }
    public boolean isPalindrome(String s){
        for (int i = 0; i < s.length() / 2; i++) {
            if(s.charAt(i)==s.charAt(s.length()-1-i)){
                
            }else{
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        Solution solution = new Solution();
        System.out.println(solution.isPalindrome("a"));
        String babad = solution.longestPalindrome("a");
        System.out.println(babad);

        System.out.println("ss".substring(0, 0));
    }
}
