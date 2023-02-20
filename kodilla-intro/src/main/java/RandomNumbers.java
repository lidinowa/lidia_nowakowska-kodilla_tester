import java.util.Random;

public class RandomNumbers {
    Random random = new Random();
    int min;
    int max;

    public void drawRandom() {
        int sum = 0;
        this.min = 30;
        this.max = 0;
        while (sum < 500) {
            int newNumber = random.nextInt(31);
            sum += newNumber;
            System.out.println("New number is " + newNumber + " and current sum is " + sum);
            if (newNumber < min) {
                min = newNumber;
                //   System.out.println("This time min. number is " + minNumber);
            }
            if (newNumber > max) {
                max = newNumber;
                //  System.out.println("This time max. number is " + maxNumber);
            }
        }
    }

    public void getMinNumber() {
        System.out.println("Min number is " + min);
    }

    public void getMaxNumber() {
        System.out.println("Max number is " + max);
    }

    public static void main(String[] args) {
        RandomNumbers randomNumbers = new RandomNumbers();
        randomNumbers.drawRandom();
        randomNumbers.getMinNumber();
        randomNumbers.getMaxNumber();
    }
}

//************ version without methods get:

//import java.util.Random;
//
//public class RandomNumbers {
//    public static void main(String[] args) {
//
//        Random random = new Random();
//        int sumOfNumbers = 0;
//        int maxNumber = 0;
//        int minNumber = 30;
//
//
//        while (sumOfNumbers < 5000) {
//            int newNumber = random.nextInt(31);
//            sumOfNumbers += newNumber;
//            System.out.println("New number is " + newNumber + " and current sum is " + sumOfNumbers);
//
//            if (newNumber < minNumber) {
//                minNumber = newNumber;
//                //   System.out.println("This time min. number is " + minNumber);
//            }
//            if (newNumber > maxNumber) {
//                maxNumber = newNumber;
//                //  System.out.println("This time max. number is " + maxNumber);
//            }
//        }
//        System.out.println("Min. number obtained is " + minNumber);
//        System.out.println("Max. number obtained is " + maxNumber);
//
//    }
//
//}