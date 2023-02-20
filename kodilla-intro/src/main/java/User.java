public class User {
    String name;
    int age;

    public User(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public static void main(String[] args) {
        User ola = new User("Ola", 10);
        User ula = new User("Ula", 20);
        User ela = new User("Ela", 30);
        User pola = new User("Pola", 40);

        User[] user = {ola, ula, ela, pola};

        int sumOfAge = 0;
        for (int i = 0; i < user.length; i++) {
            sumOfAge += user[i].age;
        }
        int averageAge = sumOfAge / user.length;
        System.out.println("Average age is " + averageAge);

        for (int i = 0; i < user.length; i++) {
            if (user[i].age > averageAge) {
                System.out.println("User who is older than average age is: " + user[i].name + " is " + user[i].age + " years old");
            }
        }
    }
}

//public class User {
//    String[] name;
//    int[] age;
//    int size;
//
//    public User(String name, int age){
//        this.name = new String[10];
//        this.age = new int[10];
//        this.size = 0;
//        if (this.size == 10) {
//            return;
//        }
//        this.name[this.size] = name;
//        this.age[this.size] = age;
//        this.size++;
//        System.out.println(this.age[0]);
//    }
//    public int[] getAge() {
//        return this.age;
//    }
//    public String[] getName(){
//        return this.name;
//    }
//    public void checklenghtoflist(){
//        System.out.println(this.age.length);
//    }