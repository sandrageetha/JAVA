public class challengeOne{
    public static void main(String[] args){
        double firstVar = 20;
        double secondVar = 80;
        double resultVar = (firstVar+secondVar)*100;
        double remainder = (resultVar % 40.00);
        boolean result = (remainder == 0.00)?true : false;
        System.out.println(result);
        if(result == false){
            System.out.println("got some remainder");
        }
    }
}