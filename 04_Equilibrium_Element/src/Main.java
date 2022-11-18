/*Description

Given an array A of N positive numbers. The task is to find the position where equilibrium first occurs in the array. Equilibrium position in an array is a position such that the sum of elements before it is equal to the sum of elements after it.



Note:This problem was asked in Oracle


Input
Input Format

First line contains an integer N denoting the size of the array.

Then in the next line are N space separated values of the array A.

N <= 1000

Ai <= 10000


Output
In a new line print the position at which the elements are at equilibrium if no equilibrium point exists print -1.


Sample Input 1 

5
3 3 5 5 1
Sample Output 1

3
Language: 
  
Theme: 
Font Size: 12


*/


import java.util.*;


public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] arr = new int[n];
		for(int i=0;i<n;i++) arr[i] = sc.nextInt();
		
		System.out.println(equilibriumNum(n,arr));
		sc.close();
		
	}
	
	public static int equilibriumNum(int n,int[] arr) {
		int[] sum = new int[n];
        for(int i=0;i<n;i++){
            if(i == 0){
                sum[i] = arr[i];
            }else{
                sum[i] = arr[i]+sum[i-1];
            }
        }
        
       
        for(int i=0;i<n;i++){
            if((sum[i]-arr[i]) == (sum[n-1]-sum[i])){
                return i+1;
            }
        }
        
        return -1;
	}
}
