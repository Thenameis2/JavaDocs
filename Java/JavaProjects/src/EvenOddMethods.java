import java.util.Scanner;
public class EvenOddMethods {
    public static void main(String[] args) {  
        
        Scanner myscor = new Scanner(System.in);

        System.out.print("enterb number of iterations");
        int number = myscor.nextInt();
        int count = 1;
        while (count <= number){
            eveOrOdd(count);
            count++;
        }
    }
    public static void eveOrOdd(int x) {
        if (x%2 == 0){
            System.out.println(x + " even");
        }else{
            System.out.println(x + " odd");
        }
    }
}
