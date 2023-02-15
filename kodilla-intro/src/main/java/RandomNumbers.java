import java.util.Random;

public class RandomNumbers {
    public static void main(String[] args) {
        Random random = new Random();
        int sumOfNumbers = 0;
        int maxNumber = 0;
        int minNumber = 30;
        while (sumOfNumbers < 5000) {
            int newNumber = random.nextInt(31);
            sumOfNumbers += newNumber;
            System.out.println("New number is " + newNumber + " and current sum is " + sumOfNumbers);

            if (newNumber < minNumber) {
                minNumber = newNumber;
                //   System.out.println("This time min. number is " + minNumber);
            }
            if (newNumber > maxNumber) {
                maxNumber = newNumber;
                //  System.out.println("This time max. number is " + maxNumber);
            }
        }
        System.out.println("Min. number obtained is " + minNumber);
        System.out.println("Max. number obtained is " + maxNumber);
    }
}



