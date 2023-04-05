
public class Lab7 {
    public static void main(String[] args) throws Exception {
        
        String[] array = {"A", "B", "C", "D", "E", "F", "G", "H", "I", "J"};
        int arraySize = array.length;

        // First loop: //print array in order
        for (int i = 0; i < arraySize; i++) {
            System.out.print(array[i]);
            if (i != array.length - 1) {
                System.out.print(", ");
            } else {
                System.out.print("|-");
            }
        }
        
        System.out.println(); 
        System.out.println();
        
        // Second loop: print array in reverse order
        for (int i =arraySize - 1; i >= 0; i--) {
            System.out.print(array[i]);
            if (i != 0) {
                System.out.print(", ");
            } else {
                System.out.print("|-");
            }
        }
        
        System.out.println();
        System.out.println();
        
        // Third loop:print arrays with switched pairs
        for (int i = 1; i < arraySize; i += 2) {
            System.out.print(array[i] + ", " + array[i-1]);
            if (i < array.length - 2) {
                System.out.print(", ");
            } else {
                System.out.print("|-");
            }
        }
        
        System.out.println();
        System.out.println();
        
        // Fourth loop: print special, concatenate first with last, second with element before last,
        // third with element before the element before the last, etc.
        for (int i = 0; i < arraySize / 2; i++) {
            int j = array.length - 1 - i;
            System.out.print(array[i] + array[j]);
            if (i < array.length / 2 - 1) {
                System.out.print(", ");
            } else {
                System.out.print("|-");
            }
        }
        
        System.out.println();
        System.out.println();
        
        // Fifth loop: print array permutations
    //     for (int i = 0; i < arraySize - 1; i++) {
    //         for (int j = i + 1; j < array.length; j++) {
    //             System.out.print(array[i] + array[j]);
    //             if (i != array.length - 2 || j != array.length - 1) {
    //                 System.out.print(", ");
                
    //             } else {
    //                 System.out.print("|-");
    //                 System.out.println();
    //             }
    //         }
    //     System.out.println();

    // }
}
}
        
