class Sub{
    int c;
    void subtract(int a , int b){
        if (a>b){
            c = a-b;
            System.out.println("subtraction  of 2 numbers are :"+c);
        }
        else{
            c = b-a;
            System.out.println("subtraction  of 2 numbers are :"+c);
        }
    }
}