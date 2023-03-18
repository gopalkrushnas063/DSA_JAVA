
import java.util.*;
import java.io.*;
import java.lang.*;


public class Main{
    
   public static List<List<String>> solveNQueens(int n) {
       boolean[][] board = new boolean[n][n];
       List<List<String>> answer = new ArrayList<>();
       queens(board,0,answer);
       return answer;
   }
    
    
    public static void queens(boolean[][] board,int row,List<List<String>> answer){
    
        if(row==board.length){
            List<String> res = insert(board);
            answer.add(res);
            return;
        }
        
        for(int col=0;col<board.length;col++){
            if(isSafe(board,row,col)){
                board[row][col] = true;
                queens(board,row+1,answer); 
                board[row][col] = false;   
            }
        }
    }

    public static boolean isSafe(boolean[][] board, int row ,int col){
        
        for(int i=0;i<row;i++){
            if(board[i][col])
                return false;
        }
        
        int maxLeft = Math.min(row,col);
        for(int i=1;i<=maxLeft;i++){
            if(board[row-i][col-i]){
                return false;
            }
        }
        
        int maxRight = Math.min(row,board.length-col-1);
        for(int i=1;i<=maxRight;i++){
            if(board[row-i][col+i]){
                return false;
            }
        }
        return true;
    }
 
  public static List<String> insert(boolean[][] board){
      
        List<String> ans = new ArrayList<>();
        for(boolean[] row: board){
            String S = "";
            for(boolean element:row){
                if(element){
                    S += "Q";
                }
                else
                    S += ".";
            }
            ans.add(S);
        }
          return ans;
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        
        int n = sc.nextInt();
    
        System.out.println(solveNQueens(n).size());
    }
}
