public class challengeOne{
    public static void main(String[] args){
        double firstVar = 20.00d;
        double secondVar = 80.00d;
        double resultVar = (firstVar+secondVar)* 100.00d;
        double remainder = (resultVar % 40.00d);
        System.out.println(remainder);
        boolean result = (remainder == 0)? true : false;
        System.out.println(result);
        if(!result){
            System.out.println("got some remainder");
        }
    }
}