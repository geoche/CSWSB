import java.util.Scanner;
public class z2_1 {

        public static double add(double a, double b){
            double result = a + b;
            return result;
        }
        public static double sub(double a, double b) {
            double result = a - b;
            return result;
        }
        public static double mult(double a, double b) {
            double result = a * b;
            return result;
        }
        public static double div(double a, double b) {
            double result = a / b;
            return result;
        }

        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            System.out.println("Please enter first value:");
            double x = scanner.nextDouble();
            System.out.println("Please enter second value:");
            double y = scanner.nextDouble();
            System.out.println("Choose the operation: \n 1 for + \n 2 for - \n 3 for * \n 4 for / \n For exit press 0");
            double i = scanner.nextDouble();
            while (i != 0){
                if (i == 1){
                    System.out.println(add(x,y));
                    break;
                }
                else if (i == 2){
                    System.out.println(sub(x,y));
                    break;
                }
                else if (i == 3){
                    System.out.println(mult(x,y));
                    break;
                }
                else if (i == 4){
                    System.out.println(div(x,y));
                    break;
                }
                else {
                    System.out.println("Please choose the exact operation fro 1 to 4.");
                    i = scanner.nextDouble();
                }
            }
        }
    }
