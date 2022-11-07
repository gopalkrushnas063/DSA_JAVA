package com.masai;

import java.util.Scanner;

public class Main {

    public static void firstMaze(int n,char[] ch){
        int u = 0;
        int l = 0;
        for(int i = 0;i<n;i++){
            if(ch[i] == 'L'){
                l-=1;
            }else if(ch[i] == 'R'){
                l+=1;
            }else if(ch[i] == 'U'){
                u+=1;
            }else if(ch[i] == 'D'){
                u-=1;
            }else {
                continue;
            }
        }

        System.out.println(l+" "+u);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter Length :");
        int n = sc.nextInt();
        System.out.println("Enter Query : ");
        String str = sc.next();
        char[] ch = new char[n];
        for(int i=0;i<n;i++) ch[i] = str.charAt(i);

        firstMaze(n,ch);
    }
}
