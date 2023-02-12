public class LeapYear {
    public static void main(String[] args) {
        isItLeapYear(2023);
    }
    private static void isItLeapYear (int year){
        int moduloDividingByFour = year%4;
        int moduloDividingByHundred = year%100;
        int moduloDividingByFourHundred = year%400;

        if (year < -238){
            System.out.println("You have to insert year which is after 232 BC");
        }
        else if (moduloDividingByFour!=0){
            System.out.println("This is not Leap Year");
        } else if (moduloDividingByHundred!=0){
            System.out.println("This is Leap Year");
        } else if (moduloDividingByFourHundred!=0){
            System.out.println("This is not Leap Year");
        } else {
            System.out.println("This is Leap Year");
        }
    }
}
