import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter N : ");
        int n = sc.nextInt();

        System.out.println("Enter N number of array elements :");
        int[] arr = new int[n];
        for(int i=0;i<n;i++) arr[i] = sc.nextInt();

        System.out.println(Arrays.toString(arr));
        System.out.println("Second largest number is : "+secondLargest(n,arr));
    }

    public static int secondLargest(int n,int[] arr){
        if(n<2){
            return -1;
        }

        Arrays.sort(arr);
        for(int i=n-2;i>=0;i--){
            if(arr[i] != arr[n-1]){
                return arr[i];
            }
        }
        return -1;
    }
}
