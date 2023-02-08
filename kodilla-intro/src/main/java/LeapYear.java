public class LeapYear {
    public static void main(String[] args) {
        isItLeapYear(2024);
    }
    private static void isItLeapYear (int year){
        int moduloDividingByFour = year%4;
        int moduloDividingByHundred = year%100;
        int moduloDividingByFourHundred = year%400;

        if (moduloDividingByFour!=0){
            System.out.println("This is not Leap Year (second method");
        } else if (moduloDividingByHundred!=0){
            System.out.println("This is Leap Year (second method)");
        } else if (moduloDividingByFourHundred!=0){
            System.out.println("This is not Leap Year (second method)");
        } else {
            System.out.println("This is Leap Year");
        }
    }
}
