public class switchprgm1{
    public static void main(String[] args){
        //character represented in '' ie, single quotes
        char switchcase = 'A';
        switch(switchcase){
            case 'A':
                System.out.println(switchcase+" represents Able");
                break;
            case 'B':
                System.out.println(switchcase+" represents Baker");
                break;
            case 'C':
                System.out.println(switchcase+" represents Charlie");
                break;
            case 'D':
                System.out.println(switchcase+" represents Dog");
                break;
            case 'E':
                System.out.println(switchcase+" represents Easy");
                break;
            default:
                System.out.println(switchcase+"not found");
                break;
        }
    }
}