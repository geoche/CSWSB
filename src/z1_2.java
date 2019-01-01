import java.util.Random;

public class z1_2 {

    public static void main(String[] args) {
        Random random = new Random();
        int[] newArray = new int[10];
        for (int i = 0; i<10; i++) {
            newArray[i] = random.nextInt(20);
            if (newArray[i] > 10){
                System.out.println("Element [" + i + "] = " + newArray[i] + " > 10");
            }
            else if (newArray[i] == 10){
                System.out.println("Element [" + i + "] = " + newArray[i] + " == 10");
            }
            else {
                System.out.println("Element [" + i + "] = " + newArray[i] + " < 10");
            }
        }
    }
}
