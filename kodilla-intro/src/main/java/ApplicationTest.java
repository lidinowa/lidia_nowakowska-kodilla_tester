public class ApplicationTest {
    String name;
    double age;
    double height;

    public ApplicationTest(String name, double age, double height) {
        this.name = name;
        this.age = age;
        this.height = height;
    }

    public void checkUserAgeHeight() {
        if (name != null) {
            if (age > 30 && height > 160) {
                System.out.println("User is older than 30 and taller than 160cm");
            } else {
                System.out.println("User is 30(or younger) or 160cm (or shorter)");
            }
        }
    }

    public static void main(String[] args) {
        ApplicationTest applicationTest = new ApplicationTest("Adam", 31, 172);
        applicationTest.checkUserAgeHeight();
    }
}