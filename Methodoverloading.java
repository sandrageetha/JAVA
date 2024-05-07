class Sum{
    public int add(int n1, int n2){
        return n1+n2;
    }
    public int add(int n1 , int n2 , int n3){
        return n1+n2+n3;
    }
    public double add(double n1 , int n2){
        return n1+n2;
    }
}
public class Methodoverloading{
    public static void main(String[] args){
        int num1 = 4;
        int num2 = 6;
        int num3 = 7;
        double num4 = 4.5;
        Sum obj = new Sum();
        int r1 = obj.add(num1,num2);
        int r2 = obj.add(num1,num2,num3);
        double r3 = obj.add(num4,num2);
        System.out.println("Sum of add with two int :" + r1);
        System.out.println("Sum of add with three int :" + r2);
        System.out.println("Sum of add with one double and int :" + r3);

    }
}