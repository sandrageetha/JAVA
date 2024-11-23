import java.util.Scanner;
class Calculator{
    public static void main(String arg[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the two numbers");
        int a = sc.nextInt();
        int b = sc.nextInt();
        Add  add = new Add();
        Sub  sub = new Sub();
        Mul  mul = new Mul();
        Div  div = new Div();
        System.out.println("Enter your choice :");
        int choice = sc.nextInt();

        switch(choice){
            case 1:
                add.addition(a,b);
                break;
            case 2:
                sub.subtract(a,b);
                break;
            case 3:
                mul.multiplication(a,b);
                break;
            case 4:
                div.division(a,b); 
                break;
            default:
                System.out.println("Invalid");


            

        }
       
        
    }
}