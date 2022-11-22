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
        String str = sc.next();
           
        substringCount(str);
	}

	public static void substringCount(String str){
		int count = 0;
		for(int i=0;i<str.length();i++){
			String ans = "";
			for(int j=i;j<str.length();j++){
				ans+=str.charAt(j);
				if(ans.charAt(0)==ans.charAt(ans.length()-1)){
					count++;
				}
			}
		}

		System.out.println(count);
    }  
}




