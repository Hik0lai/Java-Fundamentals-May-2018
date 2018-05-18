import java.util.Scanner;

public class Encrypt_Sort_and_Print_Array {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Integer numOfElements = Integer.parseInt(scanner.nextLine());
        String [] names = new String[numOfElements];
        for (int i = 0;i<names.length;i++){
            names[i]=scanner.nextLine();
        }
        for (String name: names) {
        int[] sums = new int[numOfElements];
        int sum =0;
            char[] letters = name.toCharArray();
            for (int i =0;i<letters.length;i++){
                if(isVowel(letters[i])){
                   sum += letters[i]*letters.length;
                }else {
                    sum += letters[i]/letters.length;
                }
            }

        }
        System.out.println();
        
    }
    static boolean isVowel(char letter){
        char[] Vowels = new char[]{'a','e','o','u','i'};
        for (int i =0 ; i<Vowels.length;i++){
            if (Vowels[i]==letter){
                return true;
            }else{
                return false;
            }
        }
        return true;
    }
}
