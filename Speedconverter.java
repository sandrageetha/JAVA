public class Speedconverter {
    public static long toMilesPerHour(double kilometerPerHour){
        if(kilometerPerHour <0){
            return -1;
            
        }
        long rounded = Math.round((kilometerPerHour)/(1.609));
        return rounded;   
    }
    public static void printConversion(double kilometerPerHour){
        if(kilometerPerHour < 0){
            System.out.println("Invalid Value");
        }
        else{
            System.out.println(kilometerPerHour+" km/h = "+toMilesPerHour(kilometerPerHour)+" mi/h");
        }
    }
   public static void main(String[] args){
    printConversion(95.75);
   } 
    
}