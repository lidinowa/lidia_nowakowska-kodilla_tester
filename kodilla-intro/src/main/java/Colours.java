import java.util.Scanner;

public class Colours {

    public static String getColourName() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter first letter of your colour name: ");
        String colourName = scanner.nextLine().toUpperCase().trim();

        switch (colourName) {
            case "B":
                System.out.println("BLUE");
                break;
            case "G":
                System.out.println("GREEN");
                break;
            case "M":
                System.out.println("MAGENTA");
                break;
            case "N":
                System.out.println("NAVY");
                break;
            case "O":
                System.out.println("ORANGE");
                break;
            case "P":
                System.out.println("PINK");
                break;
            case "R":
                System.out.println("RED");
                break;
            case "Y":
                System.out.println("YELLOW");
                break;
            case "W":
                System.out.println("WHITE");
                break;
        }
        return colourName;

    }

    public static void main(String[] args) {
        getColourName();
    }

}