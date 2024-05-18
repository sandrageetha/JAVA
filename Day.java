public class Day{
    public static void printDayOfWeek(int day){
        switch(day){
            case 1 -> System.out.println(day + " is Monday");
            
            case 2 -> System.out.println(day + " is Tuesday");
            
            case 3 -> System.out.println(day + " is Wednesday");
            
            case 4 -> System.out.println(day + " is Thursday");
            
            case 5 -> System.out.println(day + " is Friday");
            
            case 6 -> System.out.println(day + " is Saturday");
            
            case 7 ->  System.out.println(day + " is Sunday");
            
            default -> System.out.println("Invalid");
        };
    }
    public static void printWeekDay(int day){
        if(day ==1){
            System.out.println("1 stands for monday");
        }
        else if(day ==2){
            System.out.println(day + " stands for tuesday");
        }
        else if(day ==3){
            System.out.println(day + " stands for wednesday");
        }
        else if(day == 4){
            System.out.println(day + " stands for thursday");
        }
        else if(day == 5){
            System.out.println(day + " stands for friday");
        }
        else if(day == 6){
            System.out.println(day + " stands for saturday");
        }
        else if(day == 7){
            System.out.println(day + " stands for sunday");
        }
        else{
            System.out.println("Invalid day");
        }

    }
    public static void main(String[] args){
        printDayOfWeek(1);
        printWeekDay(7);
    }
}