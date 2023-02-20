public class Grades {
    public static void main(String[] args) {
        Grades grades = new Grades();
        //adding example grades:
        grades.add(4); // at the end size value 0 + 1, index 0
        grades.add(2); // at the end size value 1 + 1, index 1
        grades.add(6); // at the end size value 2 + 1, index 2

        //methods last grade and average grade:
        grades.lastGrade();
        grades.averageGrade();
    }

    private int[] grades;
    private int size;

    public Grades() {
        this.grades = new int[10];
        this.size = 0;
    }

    public void add(int value) {
        if (this.size == 10) {
            return;
        }
        this.grades[this.size] = value;
        this.size++;
    }

    public void lastGrade() {
        int lastGrade = grades[this.size - 1];
        System.out.println("The last grade added is " + lastGrade);
    }

    public void averageGrade() {
        int numberOfGrades = this.size;
        int total = 0;
        for (int i = 0; i <= numberOfGrades; i++) {
            total += this.grades[i];
        }
        int averageGrade = total / this.size;
        System.out.println("The average grade is " + averageGrade);
    }
}