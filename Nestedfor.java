public class Nestedfor{
    public static void main(String[] args){
        int i = 1;
        for(;i<=5;){
            System.out.println("Day" + i);
            i++;
            for(int j=1;j<=9;j++){
                System.out.println(" "+(j+8)+" - "+(j+9));
            }
        }
        
    }
}