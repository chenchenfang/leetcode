package leetcode.medium.uniquepaths;

/**
 * 递归方法
 * 小的还好如果太大那么就会等的很久
 * https://leetcode-cn.com/problems/unique-paths/
 * @author fang7
 */
public class Answer {
    public static void main(String[] args) {
        Answer answer = new Answer();
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
        int yyy = x(m-1, n-1, array);
        return yyy;
    }

    public int x(int m,int n,int[][] array){
        if(m==0||n==0){
            return array[n][m];
        }else{
            return x(m - 1, n, array) + x(m, n - 1, array);
        }
    }

}
