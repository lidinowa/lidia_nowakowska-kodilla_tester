public class Loops {
    public static void main(String[] args) {
        System.out.println("Pętla for");
        for (int i = 0; i <= 10; i++) {
            System.out.println(i);
        }
        String[] names = new String[] {"Zygfryd", "Gwidon", "Florentyna"};
        int numberOfNames = names.length;

        for (int i = 0; i < numberOfNames; i++) {
            System.out.println(names[i]);
        }

        System.out.println("Pętla while");
        int i = 0;
        while (i <= 10) {
            System.out.println(i);
            i++;
        }
    }
}
