package leetcode.medium.uniquepaths;

/**
 * 动态规划
 * @author fang7
 */
public class AnswerDynamic {
    public static void main(String[] args) {
        AnswerDynamic answer = new AnswerDynamic();
        int i = answer.uniquePaths(51, 9);
        System.out.println(i);
    }
    public int uniquePaths(int m, int n) {
        int[][] array=new int[n][m];
        for (int i = 0; i < m; i++) {
            array[0][i]=1;
        }
        for (int i = 0; i < n; i++) {
            array[i][0]=1;
        }
        for (int i = 1; i < m; i++) {
            for (int j = 1; j < n; j++) {
                array[j][i]=array[j-1][i]+array[j][i-1];
            }
        }
        return array[n-1][m-1];
    }

}
