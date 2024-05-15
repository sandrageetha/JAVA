public class MegaBytesConverter {
    public static void printMegaBytesAndKiloBytes(int kiloBytes){
        int megabyte = (int)(kiloBytes / 1024);
        int remainingKiloBytes = kiloBytes - (megabyte*1024);
        if (kiloBytes < 0){
          System.out.println("Invalid Value") ; 
        }
        else{
            System.out.println(kiloBytes+" KB = "+megabyte+" MB and "+ remainingKiloBytes+" KB");
        }
        
    }
    public static void main(String[] args){
        printMegaBytesAndKiloBytes(2500);
    }
}