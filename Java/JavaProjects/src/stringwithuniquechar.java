public class stringwithuniquechar {
    public static void main(String[] args) {
        String word = "something";
        boolean isunique = isuniquecharacters(word);
        if(isunique){
            System.out.print("this string has unique characters");
        }else{
            System.out.print("this string does not have unique characters");
        }

    }
    public static boolean isuniquecharacters(String w){
        int n = w.length();
        for (int i=0 ;i<n-1; i++){
            for (int j = i+1;j<n;j++){
                if (w.charAt(i) == w.charAt(j)){
                    return false;
                }
                
            }


        }
        return true;

    }
}
