package homework;

public class FizzBuzzChecker {

    int number;
    public String checkNumber(int number){
        if (number % 15 == 0 && number != 0){
            return "FizzBuzz";
        }else if (number % 5 == 0 && number != 0){
            return "Buzz";
        }
        else if (number % 3 == 0 && number != 0){
            return "Fizz";
        }
        else return "none";
    }
}