public class Lab5 {
    public static void main(String[] args) throws Exception {
        int num = 1;
        while( num <=100 ){
            if (num %5 == 0){
                System.out.println( "Fizz " );
            }
            if (num %3 == 0){
                System.out.println( "Buzz " );
            }
            if (num %3 == 0 && num %5 == 0 ){
                System.out.println( "“BuzzFizz ");
            }
            if (num %3 != 0 && num %5 != 0 ){
                System.out.println(num);
            }
            num++;
    }
}
}
