import java.util.Random;

public class z1_3 {

        public static void main(String[] args) {
            Random random = new Random();
            int[] newArray = new int[50];

            //New array[50] with random values

            System.out.println("Unsorted elements:");
            for (int i = 0; i < newArray.length; i++){
                newArray[i] = random.nextInt(1000);
                System.out.println("Element [" +i+ "]: " + newArray[i]);
            }
            //Array sorting from min to max
            System.out.println();
            System.out.println("Sorted elements:");
            int temp;
            int count = 0;
            int sum = 0;
            for (int i = 0; i < newArray.length; i++){
                for (int n = 0; n < newArray.length; n++){
                    if (newArray[i] < newArray[n]){
                        temp = newArray[i];
                        newArray[i] = newArray[n];
                        newArray[n] = temp;
                    }
                    else if (newArray[i] == newArray[n]){
                        count++;
                    }
                }
            }
            //Sorted array
            for (int i = 0; i < newArray.length; i++){
                sum+=newArray[i];
                System.out.println("Element [" +i+ "]: " + newArray[i]);
                //Sum of elements
                if (i == newArray.length-1){
                    System.out.println("Sum of elements is: " + sum);
                }
            }
            //Wrong way to copy array
            int[] wrongArray = new int[50];
            wrongArray = newArray;
            int x = 0;
            while (x<50){
                System.out.println(wrongArray);
                x++;
            }
            //Right copy way to copy array
            int[] rightArray = new int[newArray.length];
            for (int i = 0; i < newArray.length; i++){
                rightArray[i] = newArray[i];
                System.out.println("Element [" +i+ "] in new array: " + rightArray[i]);
            }


        }
}
