import java.util.Scanner;

public class Palindrome {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number to be checked :");
        int num=sc.nextInt();
        int cpy=num,sum=0;
        while(num>0){
            int reminder=num%10;
            sum=sum*10+reminder;
            num=num/10;
        }
        System.out.println(sum);
        if(sum==cpy)
        {
            System.out.println("number is palindrome");
        }else{
            System.out.println("number is not palindrome");
        }

    }
}
