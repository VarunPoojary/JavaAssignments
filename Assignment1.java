/*Write a Java Program that accepts 4 integers from user and prints "Equal" 
if all four numbers are equal and "Not Equal" if not*/
import java.util.Scanner;
public class Assignment1
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter 4 Nos.");
        int a,b,c,d;
        a = sc.nextInt();
        b = sc.nextInt();
        c = sc.nextInt();
        d = sc.nextInt();

        if(a == b && b == c && c == d)
        {
            System.out.println("Equal");
        }
        else
        {
            System.out.println("Not Equal");
        }
    }
}
