import java.util.*;
import java.io.*;


public class Solution {
	public static void main(String[] args) {
		try {
			System.setIn(new FileInputStream("input.txt"));
			System.setOut(new PrintStream(new FileOutputStream("output.txt")));
		} catch (Exception e) {
			System.err.println("Error");
		}
		Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr=new int[n];
        for (int i = 0; i < n; i++){
            arr[i] = sc.nextInt();  
        }    
        mapKV(n,arr);
	}

	public static void mapKV(int n,int[] arr){
		Map<Integer,Integer> map = new HashMap<>();

		for(int i=0;i<n;i++){
			if(map.containsKey(arr[i])){
				map.put(arr[i],map.get(arr[i])+1);
			}else{
				map.put(arr[i],1);
			}
		} 
        
        for (Integer key : map.keySet()) {
        	if(map.get(key)==2){
        		System.out.println(key+" "+map.get(key));
        	}
		    
		}
    }  
}




