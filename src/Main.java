import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter a number");
        int n = scan.nextInt();

        rec(n);
    }
    public static void rec(int n)
    {
        if(n<=0)
            return;
        else
        {
            System.out.println("Hello world");
            rec(n-1);
        }
    }
}

