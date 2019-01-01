import java.util.Scanner;
public class z2_2 {

        protected  static char[] alphabet = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789".toCharArray();

        // Ceasar's cypher
        public static void main(String[] args) {

            System.out.println("Enter a sentence below:\n");
            Scanner scn = new Scanner(System.in);
            String sentence = scn.nextLine(); // enter new line
            //sentence.toUpperCase(); // all characters to upper case
            char[] arrSent = sentence.toCharArray(); // making array from line
            int[] arrInd = new int[arrSent.length]; // array with indexes of equal symbols
            char ii;
            char jj;
            for (int i = 0; i < arrSent.length; i++){
                for (int j = 0; j < alphabet.length; j ++){
                    ii = arrSent[i];
                    jj = alphabet[j];
                    if (ii == jj){
                        arrInd[i] = j;
                    }
                }
            }
            System.out.println("Enter a value to encrypt your sentence:\n");
            int x = scn.nextInt();
            if (x >= 62){
                x %= 62;
                System.out.println("Your key is:" + x);
            }
            for (int i = 0; i < arrInd.length; i++){
                if (arrInd[i] == 0){
                    System.out.print(" ");
                }
                else {
                    arrInd[i] = arrInd[i] + x;
                    if (arrInd[i] >= 62){
                        int res = arrInd[i]%62;
                        arrInd[i] = res;
                    }
                    char s = alphabet[arrInd[i]];
                    arrSent[i] = s;
                }
            }
            System.out.println(arrSent);
        }
    }
