import java.util.Scanner;
public class Hello{
    public static void main(String args[]){
        Scanner s = new Scanner(System.in);
        System.out.println("Enter the 2 numbers :");
        int a = s.nextInt();
        int b = s.nextInt();
        int c = a+b;
        System.out.println(a+" "+b+ " = "+c);
    }
} 