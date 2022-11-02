import java.sql.SQLOutput;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number for reverse : ");
        long num = sc.nextInt();

        reverseNum(num);
    }

    public static void reverseNum(long num){
        long reverseNum = 0;
        while (num != 0){
            long reminder = num%10;
            reverseNum = reverseNum*10+reminder;
            num = num/10;
        }
        System.out.println("Recerse Number is : "+reverseNum);
    }
}
