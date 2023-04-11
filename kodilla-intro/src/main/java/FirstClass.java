public class FirstClass {
    public static void main(String[] args) {
        Notebook notebook = new Notebook(600, 1000, 2020);
        Notebook heavyNotebook = new Notebook(2000, 1500, 2023);
        Notebook oldNotebook = new Notebook(1600, 500, 2015);

        displayNotebookParameters(notebook);
        displayNotebookParameters(heavyNotebook);
        displayNotebookParameters(oldNotebook);
    }

    public static void displayNotebookParameters(Notebook exampleNotebook) {
        exampleNotebook.checkPrice();
        exampleNotebook.checkWeight();
        exampleNotebook.isALaptopGoodOffer();
    }
}

//public class FirstClass {
//    public static void main(String[] args) {
//
//        System.out.println("First laptop:");
//        Notebook notebook = new Notebook(600, 1000, 2020);
//        notebook.checkPrice();
//        notebook.checkWeight();
//        notebook.isALaptopGoodOffer();
//
//        System.out.println("Second laptop:");
//        Notebook heavyNotebook = new Notebook(2000, 1500, 2023);
//        heavyNotebook.checkPrice();
//        heavyNotebook.checkWeight();
//        heavyNotebook.isALaptopGoodOffer();
//
//        System.out.println("Third laptop:");
//        Notebook oldNotebook = new Notebook(1600, 500, 2015);
//        oldNotebook.checkPrice();
//        oldNotebook.checkWeight();
//        oldNotebook.isALaptopGoodOffer();
//    }
//}